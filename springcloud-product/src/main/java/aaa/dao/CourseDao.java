package aaa.dao;

import aaa.entity.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CourseDao extends tk.mybatis.mapper.common.Mapper<Course> {

    @Select("select cid,cname from course order by 1")
    List<Course> findAll();
    @Insert("insert into course (cid,cname) values (#{cid},#{cname})")
    int add(Course c);
    @Update("update course set cname=#{cname} where cid=#{cid}")
    int update(Course c);
    @Update("delete from course where cid=#{cid}")
    int del(@Param("cid") int cid);
}
