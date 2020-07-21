package com.neusoft.bsp.parameter;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.parameter.service.ParService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class ParServiceTest {

    @Autowired
    ParService parService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: searchAllPar()
     *
     */
    @Test
    public void testSearchAllPar() throws Exception {
//TODO: Test goes here...
        parService.searchAllPar();
    }

    /**
     *
     * Method: insertPar(Par par)
     *
     */
    @Test
    public void testInsertPar() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: updatePar(Par par)
     *
     */
    @Test
    public void testUpdatePar() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: deletePar(int par_id)
     *
     */
    @Test
    public void testDeletePar() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: searchParByCd(String param_cd)
     *
     */
    @Test
    public void testSearchParByCd() throws Exception {
//TODO: Test goes here...
        parService.searchParByCd("");
    }

}
