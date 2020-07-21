package com.neusoft.bsp.mvoorder;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.mvoorder.service.Salservice;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class SalServiceTest {

    @Autowired
    Salservice salservice;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: searchSal(int sao_id)
     *
     */
    @Test
    public void testSearchSal() throws Exception {
//TODO: Test goes here...
        salservice.searchSal(0);
    }

}
