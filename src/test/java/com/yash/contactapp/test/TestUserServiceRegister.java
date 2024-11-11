package com.yash.contactapp.test;

import com.yash.contactapp.config.SpringRootConfig;
import com.yash.contactapp.dao.UserDAO;
import com.yash.contactapp.domain.User;
import com.yash.contactapp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserServiceRegister {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserService userService =ctx.getBean(UserService.class);
        //TODO: the user details will be taken from User-Reg-Form
        User u=new User();
        u.setName("Srashti");
        u.setPhone("7893213321");
        u.setEmail("srashti@.net");
        u.setAddress("indore");
        u.setLoginName("srashti");
        u.setPassword("srashti123");
        u.setRole(1);//Admin Role
        u.setLoginStatus(1); //Active
        userService.register(u);
        System.out.println("--------Data Saved in Service------");
    }
}
