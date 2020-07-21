package com.neusoft.bsp.mvoproduct;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.mvoproduct.service.ImgImageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class ImgImageServiceTest {

    @Autowired
    ImgImageService imgImageService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: searchImg(int pro_id)
     *
     */
    @Test
    public void testSearchImg() throws Exception {
//TODO: Test goes here...
        imgImageService.searchImg(0);
    }

    /**
     *
     * Method: searchBrdImg(int brd_id)
     *
     */
    @Test
    public void testSearchBrdImg() throws Exception {
//TODO: Test goes here...
        imgImageService.searchBrdImg(0);
    }

    /**
     *
     * Method: addBrdImg(String uri, int brd_id)
     *
     */
    @Test
    public void testAddBrdImg() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: updateBrdImg(String uri, int brd_id)
     *
     */
    @Test
    public void testUpdateBrdImg() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: deleteBrdImg(int brd_id)
     *
     */
    @Test
    public void testDeleteBrdImg() throws Exception {
//TODO: Test goes here...
    }

}
