package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    @Insert("insert into sky_take_out.employee (name, username, password, phone, sex, status," +
            " create_time, update_time, create_user, update_user,id_number) values " +
            "(#{name},#{username},#{password},#{phone},#{sex},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser},#{idNumber})")
    void insert(Employee employee);

    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return
     */
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 根据主键动态修改语句
     * @param employee
     */
    void update(Employee employee);
}
