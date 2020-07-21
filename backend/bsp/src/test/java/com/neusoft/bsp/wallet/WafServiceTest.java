package com.neusoft.bsp.wallet;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.wallet.service.WafService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class WafServiceTest {

    @Autowired
    WafService wafService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: searchWafById(int buyer_id)
     *
     */
    @Test
    public void testSearchWafById() throws Exception {
//TODO: Test goes here...
        wafService.searchWafById(0);
    }

    /**
     *
     * Method: insertWaf(Waf waf)
     *
     */
    @Test
    public void testInsertWaf() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: updateWaf(Waf waf)
     *
     */
    @Test
    public void testUpdateWaf() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: updateMoney(int buyer_id, BigDecimal a_money, BigDecimal d_money, BigDecimal w_money)
     *
     */
    @Test
    public void testUpdateMoney() throws Exception {
//TODO: Test goes here...
    }

}
