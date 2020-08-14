package aaa.service;

import aaa.dao.CourseDao;
import aaa.entity.Course;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseService {

    @Resource
    CourseDao courseDao;

    public List<Course> findAll(){
       return courseDao.findAll();
    }

    public int deleteById(Integer tid){
        return courseDao.deleteByPrimaryKey(tid);
    }
}
