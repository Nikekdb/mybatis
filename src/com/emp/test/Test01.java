package com.emp.test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;

import com.emp.mapper.EmpMapper;
import com.emp.pojo.Emp;

public class Test01 {
	
	private SqlSession session=null;
	{
		try {
			SqlSessionFactory sqlSession=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
			session=sqlSession.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private EmpMapper mapper=session.getMapper(EmpMapper.class);
	
	//��ѯ����;
	@Test
	public void selectAll() {
		System.out.println("���\t����\t����\tнˮ");
		for(Emp emp:mapper.selectAll()) {
			System.out.println("asdasdasd");
			System.out.println("asdasdasd");
			System.out.println(emp.getEmpno()+"\t"+emp.getName()+"\t"+emp.getHiredate()+"\t"+emp.getSal()+";");
		}
	}
	
	//���������ѯ;
	@Test
	public void selectEmp() {
		Map<Object,Object> map=new HashMap<Object,Object>();
		map.put("empno", 4);
		map.put("name", "kdb");
		Emp emp=mapper.selectEmp(map);
		System.out.println(emp);
	}
	
	//����;
	@Test
	public void insertEmp() {
		Emp emp=new Emp("����",new Date(),2000);
		int num=mapper.insertEmp(emp);
		System.out.println(num>0?"ok":"no");
	}
	
	//ɾ��;
	@Test
	public void deleteEmp() {
		int num=mapper.deleteEmp(5);
		System.out.println(num>0?"ok":"no");
	}
	
	//�޸�;
	@Test
	public void updateEmp() {
		Emp emp=new Emp(1,"qeq",new Date(),1111);
		int num=mapper.updateEmp(emp);
		System.out.println(num>0?"ok":"no");
	}
	
	//�ر�;
	@After
	public void closeAll() {
		if(session!=null) {
			session.commit();
			System.out.println("�ر�");
			session.close();
		}
	}
}
