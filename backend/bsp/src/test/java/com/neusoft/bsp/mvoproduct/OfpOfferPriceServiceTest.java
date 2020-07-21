package com.neusoft.bsp.mvoproduct;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.mvoproduct.service.OfpOfferPriceService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class OfpOfferPriceServiceTest {

    @Autowired
    OfpOfferPriceService ofpOfferPriceService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: getOfpByProId(int pro_id)
     *
     */
    @Test
    public void testGetOfpByProId() throws Exception {
//TODO: Test goes here...
        ofpOfferPriceService.getOfpByProId(0);

    }

}
