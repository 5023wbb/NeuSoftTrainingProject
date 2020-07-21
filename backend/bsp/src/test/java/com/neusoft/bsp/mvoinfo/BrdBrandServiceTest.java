package com.neusoft.bsp.mvoinfo;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.mvoinfo.service.BrdBrandService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class BrdBrandServiceTest {

    @Autowired
    BrdBrandService brdBrandService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: getAllBrand(int man_id)
     *
     */
    @Test
    public void testGetAllBrand() throws Exception {
//TODO: Test goes here...
        brdBrandService.getAllBrand(0);
    }

    /**
     *
     * Method: insertBrand(BrdBrand brdBrand)
     *
     */
    @Test
    public void testInsertBrand() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: deleteBrand(int brd_id)
     *
     */
    @Test
    public void testDeleteBrand() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: updateBrand(BrdBrand brdBrand)
     *
     */
    @Test
    public void testUpdateBrand() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: searchLastedId()
     *
     */
    @Test
    public void testSearchLastedId() throws Exception {
//TODO: Test goes here...
        brdBrandService.searchLastedId();
    }

}
