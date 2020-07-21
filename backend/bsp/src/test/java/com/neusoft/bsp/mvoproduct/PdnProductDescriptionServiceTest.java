package com.neusoft.bsp.mvoproduct;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.mvoproduct.service.PdnProductDescriptionService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class PdnProductDescriptionServiceTest {

    @Autowired
    PdnProductDescriptionService pdnProductDescriptionService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: searchPdn(int pro_id)
     *
     */
    @Test
    public void testSearchPdn() throws Exception {
//TODO: Test goes here...
        pdnProductDescriptionService.searchPdn(0);
    }

}
