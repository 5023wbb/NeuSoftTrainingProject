package com.neusoft.bsp.security;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.security.service.auth.AuthUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class AuthUserTest {

    @Autowired
    AuthUser authUser;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: getAuthorities()
     *
     */
    @Test
    public void testGetAuthorities() throws Exception {
//TODO: Test goes here...
        authUser.getAuthorities();
    }

    /**
     *
     * Method: getPassword()
     *
     */
    @Test
    public void testGetPassword() throws Exception {
//TODO: Test goes here...
        authUser.getPassword();
    }

    /**
     *
     * Method: getUsername()
     *
     */
    @Test
    public void testGetUsername() throws Exception {
//TODO: Test goes here...
        authUser.getUsername();
    }

    /**
     *
     * Method: isAccountNonExpired()
     *
     */
    @Test
    public void testIsAccountNonExpired() throws Exception {
//TODO: Test goes here...
        authUser.isAccountNonExpired();
    }

    /**
     *
     * Method: isAccountNonLocked()
     *
     */
    @Test
    public void testIsAccountNonLocked() throws Exception {
//TODO: Test goes here...
        authUser.isAccountNonLocked();
    }

    /**
     *
     * Method: isCredentialsNonExpired()
     *
     */
    @Test
    public void testIsCredentialsNonExpired() throws Exception {
//TODO: Test goes here...
        authUser.isCredentialsNonExpired();
    }

    /**
     *
     * Method: isEnabled()
     *
     */
    @Test
    public void testIsEnabled() throws Exception {
//TODO: Test goes here...
        authUser.isEnabled();
    }

    /**
     *
     * Method: getState()
     *
     */
    @Test
    public void testGetState() throws Exception {
//TODO: Test goes here...
        authUser.getState();
    }

    /**
     *
     * Method: setState(Integer state)
     *
     */
    @Test
    public void testSetState() throws Exception {
//TODO: Test goes here...
        authUser.setState(0);
    }

    /**
     *
     * Method: toString()
     *
     */
    @Test
    public void testToString() throws Exception {
//TODO: Test goes here...
        authUser.toString();
    }


}
