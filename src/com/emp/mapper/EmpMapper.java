package com.emp.mapper;

import java.util.List;
import java.util.Map;

import com.emp.pojo.Emp;

public interface EmpMapper {

	/*��ϰ��
	1���mybatis��ܻ���
	2����MySQL�У��½�Ա����Emp(empno Ա�����,ename Ա������,hiredate ��ְ����,sal нˮ)��
	   ����ӳ���ļ�EmpDao.xml
	3�����Emp�������ɾ���ġ������
	4��ʹ��dao�ӿ�ӳ�������ļ�EmpDao�е�sql��䣬ʹ�ýӿ�ӳ��������з���
	5���������ݱ��ֶκ�ʵ�������Բ���ͬ����µĲ�ѯӳ��
	6������ʹ��Map��ֱ�Ӵ��ݶ�������ķ�ʽ��ѯ
	7������Oracle���ݿ��µ���Ӳ���*/
	
	public List<Emp> selectAll();//��ѯ����;
	public Emp selectEmp(Map<Object,Object> map);//���������ѯ;
	public int insertEmp(Emp emp);//����;
	public int deleteEmp(Integer empno);//ɾ��;
	public int updateEmp(Emp emp);//�޸�;

}
