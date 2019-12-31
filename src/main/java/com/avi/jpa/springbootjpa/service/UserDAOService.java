package com.avi.jpa.springbootjpa.service;

import com.avi.jpa.springbootjpa.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    private static final Logger log = LoggerFactory.getLogger(UserDAOService.class);

    @PersistenceContext
    private EntityManager entityManager;

    public long save(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
