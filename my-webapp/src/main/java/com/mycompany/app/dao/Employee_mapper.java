package com.mycompany.app.dao;

import com.mycompany.app.entity.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface Employee_mapper {
    final String getAll = "SELECT * FROM employee";
    final String getById = "SELECT * FROM employee WHERE id = #{id}";
    final String deleteById = "DELETE * FROM employee WHERE id = #{id}";
    final String insert = "INSERT INTO employee (fullname, email, gender, hobbies, country, address ) VALUES (#{fullname}, #{email}, #{gender}, #{hobbies}, #{country}, #{address})";
    final String update = "UPDATE employee SET fullname = #{fullname}, email = #{email}, gender = #{gender}, hobbies = #{hobbies}, country = #{country}, address = #{address} WHERE id = #{id}";


    @Select(getAll)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "fullname", column = "fullname"),
            @Result(property = "email", column = "email"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "hobbies", column = "hobbies"),
            @Result(property = "country", column = "country"),
            @Result(property = "address", column = "address")
    })
    List<Employee> getAll();

    @Select(getById)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "fullname", column = "fullname"),
            @Result(property = "email", column = "email"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "hobbies", column = "hobbies"),
            @Result(property = "country", column = "country"),
            @Result(property = "address", column = "address")
    })
    Employee getById(int id);

    @Delete(deleteById)
    void delete(int id);

    @Update(update)
    void update(Employee employee);

    @Insert(insert)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Employee employee);
}
