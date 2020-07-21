package com.neusoft.bsp.role;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.role.service.RoleService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class RoleServiceTest {

    @Autowired
    RoleService roleService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: getAll()
     *
     */
    @Test
    public void testGetAll() throws Exception {
//TODO: Test goes here...
        roleService.getAll();
    }

}
