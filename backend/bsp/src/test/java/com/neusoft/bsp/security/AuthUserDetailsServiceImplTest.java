package com.neusoft.bsp.security;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.security.service.auth.AuthUserDetailsServiceImpl;
import com.neusoft.bsp.user.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class AuthUserDetailsServiceImplTest {

    @Autowired
    AuthUserDetailsServiceImpl authUserDetailsServiceImpl;


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: loadUserByUsername(String username)
     *
     */
    @Test
    public void testLoadUserByUsername() throws Exception {
//TODO: Test goes here...
        //这里使用数据库中存在的username,否则会throw exception
        authUserDetailsServiceImpl.loadUserByUsername("admin");
    }

}
