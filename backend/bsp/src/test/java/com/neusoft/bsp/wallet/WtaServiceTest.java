package com.neusoft.bsp.wallet;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.wallet.service.WtaService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class WtaServiceTest {

    @Autowired
    WtaService wtaService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: insertWta(Wta wta)
     *
     */
    @Test
    public void testInsertWta() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: searchWtaByBuyerId(int buyer_id)
     *
     */
    @Test
    public void testSearchWtaByBuyerId() throws Exception {
//TODO: Test goes here...
        wtaService.searchWtaByBuyerId(0);
    }

    /**
     *
     * Method: searchAllWtaByFilter()
     *
     */
    @Test
    public void testSearchAllWtaByFilter() throws Exception {
//TODO: Test goes here...
        wtaService.searchAllWtaByFilter();
    }

    /**
     *
     * Method: searchWtaByWtrId(int transaction_id)
     *
     */
    @Test
    public void testSearchWtaByWtrId() throws Exception {
//TODO: Test goes here...
        wtaService.searchWtaByWtrId(0);
    }

    /**
     *
     * Method: updateWtaStatus(int transaction_id, int status)
     *
     */
    @Test
    public void testUpdateWtaStatus() throws Exception {
//TODO: Test goes here...
    }


}
