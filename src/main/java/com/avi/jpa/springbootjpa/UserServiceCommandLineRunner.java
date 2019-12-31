package com.avi.jpa.springbootjpa;

import com.avi.jpa.springbootjpa.entity.User;
import com.avi.jpa.springbootjpa.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserServiceCommandLineRunner.class);

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Smith", "Admin");
        long id = userDAOService.save(user);
        log.info("New User is created " + user);
    }
}
