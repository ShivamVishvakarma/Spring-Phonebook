package com.yash.contactapp.test;

import com.yash.contactapp.config.SpringRootConfig;
import com.yash.contactapp.dao.UserDAO;
import com.yash.contactapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOUpdate {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO=ctx.getBean(UserDAO.class);
        //TODO: the user details will be taken from User-Reg-Form
        User u=new User();
        u.setName("Shivam vishvakarma");
        u.setPhone("9303580884");
        u.setEmail("shivam123@.net");
        u.setAddress("indore");
        u.setLoginName("shivam");
        u.setPassword("shivam123");
        u.setRole(1);//Admin Role
        u.setLoginStatus(1); //Active
        userDAO.update(u);
        System.out.println("--------Data updated------");
    }
}
