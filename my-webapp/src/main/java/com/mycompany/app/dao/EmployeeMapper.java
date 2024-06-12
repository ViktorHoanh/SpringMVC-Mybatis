package com.mycompany.app.dao;

import com.mycompany.app.entity.Employee;
import com.mycompany.app.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeMapper {
    public List<Employee> getAllEmployees(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Employee> employeesList = session.selectList("getAllEmployees");
        session.commit();
        session.close();
        return employeesList;
    }
}
