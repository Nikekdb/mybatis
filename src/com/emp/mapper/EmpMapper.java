package com.emp.mapper;

import java.util.List;
import java.util.Map;

import com.emp.pojo.Emp;

public interface EmpMapper {

	/*练习：
	1、搭建mybatis框架环境
	2、在MySQL中，新建员工表Emp(empno 员工编号,ename 员工姓名,hiredate 入职日期,sal 薪水)，
	   配置映射文件EmpDao.xml
	3、完成Emp表的增、删、改、查操作
	4、使用dao接口映射配置文件EmpDao中的sql语句，使用接口映射调用所有方法
	5、测试数据表字段和实体类属性不相同情况下的查询映射
	6、测试使用Map和直接传递多个参数的方式查询
	7、测试Oracle数据库下的添加操作*/
	
	public List<Emp> selectAll();//查询所有;
	public Emp selectEmp(Map<Object,Object> map);//多个参数查询;
	public int insertEmp(Emp emp);//新增;
	public int deleteEmp(Integer empno);//删除;
	public int updateEmp(Emp emp);//修改;

}
