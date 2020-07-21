package com.neusoft.bsp.wallet;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.wallet.service.WtrService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class WtrServiceTest {

    @Autowired
    WtrService wtrService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: insertWtr(Wtr wtr)
     *
     */
    @Test
    public void testInsertWtr() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: searchWtrByBuyerId(int buyer_id)
     *
     */
    @Test
    public void testSearchWtrByBuyerId() throws Exception {
//TODO: Test goes here...
        wtrService.searchWtrByBuyerId(0);
    }

    /**
     *
     * Method: searchAllWtrByFilter()
     *
     */
    @Test
    public void testSearchAllWtrByFilter() throws Exception {
//TODO: Test goes here...
        wtrService.searchAllWtrByFilter();
    }

    /**
     *
     * Method: searchWtrById(int transaction_id)
     *
     */
    @Test
    public void testSearchWtrById() throws Exception {
//TODO: Test goes here...
        wtrService.searchWtrById(0);
    }

    /**
     *
     * Method: updateWtrStatus(int transaction_id, int status)
     *
     */
    @Test
    public void testUpdateWtrStatus() throws Exception {
//TODO: Test goes here...
    }

}
