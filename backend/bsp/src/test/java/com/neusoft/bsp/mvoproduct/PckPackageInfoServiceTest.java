package com.neusoft.bsp.mvoproduct;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.mvoproduct.service.PckPackageInfoService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class PckPackageInfoServiceTest {

    @Autowired
    PckPackageInfoService pckPackageInfoService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: searchPck(int pro_id)
     *
     */
    @Test
    public void testSearchPck() throws Exception {
//TODO: Test goes here...
        pckPackageInfoService.searchPck(0);
    }

}
