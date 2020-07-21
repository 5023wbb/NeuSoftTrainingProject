package com.neusoft.bsp.cdm;

import com.neusoft.bsp.BspApplication;
import com.neusoft.bsp.codemaster.entity.Cdm;
import com.neusoft.bsp.codemaster.service.CdmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BspApplication.class})
public class CdmServiceTest {

    @Autowired
    private CdmService cdmService;

    @Test
    public void testSearchAllCdm(){
        cdmService.searchAllCdm();
    }

    @Test
    public void testInsertCdm(){
        Cdm cdm = new Cdm();
        cdmService.insertCdm(cdm);
    }

    @Test
    public void testUpdateCdm(){
        Cdm cdm = new Cdm();
        cdmService.updateCdm(cdm);
    }

    @Test
    public void testDeleteCdm(){
        int cdm_id = 0;
        cdmService.deleteCdm(cdm_id);
    }

    @Test
    public void testSearchCdmByCt(){
        String code_type = "";
        cdmService.searchCdmByCt(code_type);
    }


}
