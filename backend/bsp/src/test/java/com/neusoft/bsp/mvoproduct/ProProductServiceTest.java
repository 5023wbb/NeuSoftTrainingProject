package com.neusoft.bsp.mvoproduct;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.mvoproduct.service.ProProductService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class ProProductServiceTest {

    @Autowired
    ProProductService proProductService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: searchProduct(int man_id)
     *
     */
    @Test
    public void testSearchProduct() throws Exception {
//TODO: Test goes here...
        proProductService.searchProduct(0);
    }

    /**
     *
     * Method: searchByProId(int pro_id)
     *
     */
    @Test
    public void testSearchByProId() throws Exception {
//TODO: Test goes here...
        proProductService.searchByProId(0);
    }

    /**
     *
     * Method: updateDeletePro(int pro_id)
     *
     */
    @Test
    public void testUpdateDeletePro() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: updateAIPro(int pro_id, String sts_cd)
     *
     */
    @Test
    public void testUpdateAIPro() throws Exception {
//TODO: Test goes here...
    }


}
