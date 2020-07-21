package com.neusoft.bsp.wallet;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.wallet.entity.Waa;
import com.neusoft.bsp.wallet.service.WaaService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class WaaServiceTest {

    @Autowired
    WaaService waaService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: searchWaaByName(String account_name)
     *
     */
    @Test
    public void testSearchWaaByName() throws Exception {
//TODO: Test goes here...
        waaService.searchWaaByName("");
    }

    /**
     *
     * Method: insertWaa(Waa waa)
     *
     */
    @Test
    public void testInsertWaa() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: searchAuthority(Waa waa)
     *
     */
    @Test
    public void testSearchAuthority() throws Exception {
//TODO: Test goes here...
        Waa waa = new Waa();
        waaService.searchAuthority(waa);
    }

}
