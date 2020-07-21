package com.neusoft.bsp.user;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.user.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: insert(User user)
     *
     */
    @Test
    public void testInsert() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: update(User user)
     *
     */
    @Test
    public void testUpdate() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: delete(String userid)
     *
     */
    @Test
    public void testDelete() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getRolesByName(String username)
     *
     */
    @Test
    public void testGetRolesByName() throws Exception {
//TODO: Test goes here...
        userService.getRolesByName("");
    }

    /**
     *
     * Method: getByName(String username)
     *
     */
    @Test
    public void testGetByName() throws Exception {
//TODO: Test goes here...
        userService.getByName("");
    }

    /**
     *
     * Method: getById(String userid)
     *
     */
    @Test
    public void testGetById() throws Exception {
//TODO: Test goes here...
        userService.getById("");
    }

    /**
     *
     * Method: getAll()
     *
     */
    @Test
    public void testGetAll() throws Exception {
//TODO: Test goes here...
        userService.getAll();
    }

    /**
     *
     * Method: getAllByFilter(Map<String, Object> map)
     *
     */
    @Test
    public void testGetAllByFilterMap() throws Exception {
//TODO: Test goes here...
        Map<String,Object> map = new HashMap();
        userService.getAllByFilter(map);
        userService.getAllByFilter(0,0,map);
    }

    /**
     *
     * Method: checkLogin(String username, String rawPassword)
     *
     */
    @Test
    public void testCheckLogin() throws Exception {
//TODO: Test goes here...
        userService.checkLogin("admin","000000");
    }

    /**
     *
     * Method: getAllByFilter(Integer pageNum, Integer pageSize)
     *
     */
    @Test
    public void testGetAllByFilterForPageNumPageSize() throws Exception {
//TODO: Test goes here...
        userService.getAllByFilter(0,0);
    }

    /**
     *
     * Method: getAllByFilter(Integer pageNum, Integer pageSize, Map<String, Object> map)
     *
     */
    @Test
    public void testGetAllByFilterForPageNumPageSizeMap() throws Exception {
//TODO: Test goes here...
        Map<String,Object> map = new HashMap();
        userService.getAllByFilter(0,0,map);
    }

    /**
     *
     * Method: getBuyerIdByUserName(String username)
     *
     */
    @Test
    public void testGetBuyerIdByUserName() throws Exception {
//TODO: Test goes here...
        userService.getBuyerIdByUserName("");
    }

    /**
     *
     * Method: updateBuyerId(String username, int man_buyer_id)
     *
     */
    @Test
    public void testUpdateBuyerId() throws Exception {
//TODO: Test goes here...
    }

}
