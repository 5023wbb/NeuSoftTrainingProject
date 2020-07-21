package com.neusoft.bsp.menu;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.menu.service.MenuService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class MenuServiceTest {

    @Autowired
    MenuService menuService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: getAll()
     *
     */
    @Test
    public void testGetAll() throws Exception {
//TODO: Test goes here...

        menuService.getAll();
    }

    /**
     *
     * Method: getAuthMenu(String username)
     *
     */
    @Test
    public void testGetAuthMenu() throws Exception {
//TODO: Test goes here...
        menuService.getAuthMenu("");
    }

    /**
     *
     * Method: deleteById(String id)
     *
     */
    @Test
    public void testDeleteById() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getById(String menuid)
     *
     */
    @Test
    public void testGetById() throws Exception {
//TODO: Test goes here...
        menuService.getById("");
    }

    /**
     *
     * Method: deleteByUrlAndName(String url, String name)
     *
     */
    @Test
    public void testDeleteByUrlAndName() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: addChildMenus(List<Menu> menus)
     *
     */
    @Test
    public void testAddChildMenus() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAllFather()
     *
     */
    @Test
    public void testGetAllFather() throws Exception {
//TODO: Test goes here...
        menuService.getAllFather();
    }

    /**
     *
     * Method: getMenuByRoleId(String id)
     *
     */
    @Test
    public void testGetMenuByRoleId() throws Exception {
//TODO: Test goes here...
        menuService.getMenuByRoleId("");
    }

    /**
     *
     * Method: updateById(Menu menu)
     *
     */
    @Test
    public void testUpdateById() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: insertAuthByRoleId(String role_id, List<String> menu_ids)
     *
     */
    @Test
    public void testInsertAuthByRoleId() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: addMenu(Menu menu)
     *
     */
    @Test
    public void testAddMenu() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: deleteByRoleId(String role_id)
     *
     */
    @Test
    public void testDeleteByRoleId() throws Exception {
//TODO: Test goes here...
    }

}
