package com.neusoft.bsp.mvoorder;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.mvoorder.service.SaoSalesOrderService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class SaoSalesOrderServiceTest {

    @Autowired
    SaoSalesOrderService saoSalesOrderService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: searchSao(int man_id)
     *
     */
    @Test
    public void testSearchSao() throws Exception {
//TODO: Test goes here...
        saoSalesOrderService.searchSao(0);
    }

    /**
     *
     * Method: searchSaoById(int sao_id)
     *
     */
    @Test
    public void testSearchSaoById() throws Exception {
//TODO: Test goes here...
        saoSalesOrderService.searchSaoById(1);
    }

    /**
     *
     * Method: shipSao(int sao_id)
     *
     */
    @Test
    public void testShipSao() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: cancelSao(int sao_id)
     *
     */
    @Test
    public void testCancelSao() throws Exception {
//TODO: Test goes here...
    }

}
