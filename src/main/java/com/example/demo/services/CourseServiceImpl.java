package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list= new ArrayList<>();
		
		list.add(new Course(145,"Java Basic","This contain java basic oops"));
		list.add(new Course(146,"Java Spring","This contain java spring"));
		list.add(new Course(147,"Java Spring part-2","This contain java spring adv"));
		list.add(new Course(148,"Java Spring part-3","This contain java spring adv"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
		
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		long index=course.getId();
				int i=0;
        for(Course p:list){
            if(index==p.getId()){
                list.set(i, course);
            }else{
                i++;
            }
	}
		return course;
	}

	@Override
	public String deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		int i=0;
		for(Course c:list) {
			if(c.getId() == courseId) {
				list.remove(i);
				return "Record deleted";
			}else {
				i++;
			}
		}
		return "Record deleted Not found";
	}

}


	 

