package com.yash.contactapp.test;

import com.yash.contactapp.config.SpringRootConfig;
import com.yash.contactapp.dao.UserDAO;
import com.yash.contactapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestUserDAOfindByProp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO=ctx.getBean(UserDAO.class);
       List<User> users =  userDAO.findByProperty("userId" , 1);
        for(User u : users){
            System.out.println(u.getUserId() + "  " +u.getName()+ "   "+u.getRole());
        }
    }
}
