package com.fan.spring5.factorybean;

import com.fan.spring5.collection.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author fans
 */
public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("语文");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
