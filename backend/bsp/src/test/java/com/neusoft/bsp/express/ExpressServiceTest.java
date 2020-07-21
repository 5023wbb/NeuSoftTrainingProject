package com.neusoft.bsp.express;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.express.service.ExpressService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class ExpressServiceTest {

    @Autowired
    ExpressService expressService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: getExpressList(ExpressListReqBody reqBody)
     *
     */
    @Test
    public void testGetExpressList() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getExpressInfo(ExpressInfoReqBody reqBody)
     *
     */
    @Test
    public void testGetExpressInfo() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: fetchCom(String nu)
     *
     */
    @Test
    public void testFetchCom() throws Exception {
//TODO: Test goes here...
    }


    /**
     *
     * Method: getJsonObject(String host, String path, String method, Map<String, String> headers, Map<String, String> querys)
     *
     */
    @Test
    public void testGetJsonObject() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = ExpressServiceImpl.getClass().getMethod("getJsonObject", String.class, String.class, String.class, Map<String,.class, Map<String,.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
    }
}
