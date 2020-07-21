package com.neusoft.bsp.mvoinfo;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.mvoinfo.service.ManManufacturerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class ManManufacturerServiceTest {
    @Autowired
    ManManufacturerService manManufacturerService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: findInfoByMVO(int man_id)
     *
     */
    @Test
    public void testFindInfoByMVO() throws Exception {
//TODO: Test goes here...
        manManufacturerService.findInfoByMVO(0);
    }

    /**
     *
     * Method: insert(ManManufacturer manManufacturer)
     *
     */
    @Test
    public void testInsert() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: searchLatestManiId()
     *
     */
    @Test
    public void testSearchLatestManiId() throws Exception {
//TODO: Test goes here...
        manManufacturerService.searchLatestManiId();
    }

}
