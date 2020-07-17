package com.neusoft.bsp.controller;


import com.alibaba.fastjson.JSONObject;
import com.neusoft.bsp.common.base.BaseController;
import com.neusoft.bsp.common.base.BaseModel;
import com.neusoft.bsp.common.base.BaseModelJson;
import com.neusoft.bsp.common.exception.BusinessException;
import com.neusoft.bsp.common.validationGroup.UpdateGroup;
import com.neusoft.bsp.express.entity.ExpressInfoReqBody;
import com.neusoft.bsp.express.entity.ExpressListReqBody;
import com.neusoft.bsp.express.service.ExpressService;
import com.neusoft.bsp.mvoorder.entity.Sal;
import com.neusoft.bsp.mvoorder.entity.SaoSalesOrder;
import com.neusoft.bsp.mvoorder.service.Salservice;
import com.neusoft.bsp.mvoorder.service.SaoSalesOrderService;
import com.neusoft.bsp.mvoproduct.entity.ProProduct;
import com.neusoft.bsp.mvoproduct.service.ProProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/salesOrderManagementController")
public class SalesOrderManagementController extends BaseController {

    @Autowired
    SaoSalesOrderService saoSalesOrderService;

    @Autowired
    ProProductService productService;

    @Autowired
    Salservice salservice;

    @Autowired
    ExpressService expressService;

    //根据用户信息的man_buyer_id(man_id)查询sao, 返回对应的sao列表信息
    @RequestMapping("/searchBaseSao")
    public BaseModelJson<List<SaoSalesOrder>> searchBaseSao(@RequestBody int man_id){
        List<SaoSalesOrder> resultList = saoSalesOrderService.searchSao(man_id);
        BaseModelJson<List<SaoSalesOrder>> result = new BaseModelJson();
        if(resultList.size() != 0){
            result.data = resultList;
            result.message = "success";
            result.code = 200;
        }else {
            result.data = resultList;
            result.message = "no result";
            result.code = 201;
        }
        return  result;
    }

    //根据sao_id查询sal再根据sal的pro_id查询pro
    @RequestMapping("/unionSearch")
    public BaseModelJson<Map<String,Object>> unionSearch(@RequestBody int sao_id){
        Sal resultSal = salservice.searchSal(sao_id);

        Map<String, Object> resultData = new HashMap();
        BaseModelJson<Map<String,Object>> result = new BaseModelJson();//返回打包结果
        if (resultSal != null){
            ProProduct resultPro = productService.searchByProId(resultSal.getPro_id());//根据当前sal的pro_id查询对应的pro
            resultData.put("sal",resultSal);
            resultData.put("pro",resultPro);
            result.data = resultData;
            result.message = "success";
            result.code = 200;
        }else {
            resultData.put("sal","");
            resultData.put("pro","");
            result.data = resultData;
            result.message = "no result";
            result.code = 201;
        }
        return result;
    }

    //发货更新sao的order_sts
    @RequestMapping("/shipSao")
    public BaseModel shipSao(@Validated({UpdateGroup.class})@RequestBody int sao_id, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            throw BusinessException.SAOID_NULL_ERROR.newInstance(this.getErrorResponse(bindingResult),
                    new Object[]{sao_id});
        } else {
            BaseModel result = new BaseModel();

            if (saoSalesOrderService.searchSaoById(sao_id).getOrder_sts().equals("SHIPPED")){
                result.message = "can not deliver again";
                result.code = 201;
            }else if(saoSalesOrderService.searchSaoById(sao_id).getOrder_sts().equals("AwaitingPayment")){
                result.message = "waiting for payment";
                result.code = 202;
            }else if(saoSalesOrderService.searchSaoById(sao_id).getOrder_sts().equals("Complete") ||
                     saoSalesOrderService.searchSaoById(sao_id).getOrder_sts().equals("Canceled")){
                result.message = "can not deliver now";
                result.code = 203;
            }else {
                saoSalesOrderService.shipSao(sao_id);
                result.message = "success";
                result.code = 200;
            }
            return result;
        }
    }

    /**
     * 快递公司查询
     *
     * @param reqBody
     * @return
     */
    @PostMapping(value = "/getExpressList")
    public JSONObject getExpressList(@RequestBody ExpressListReqBody reqBody) {
        JSONObject jsonObject = null;
        try {
            jsonObject = expressService.getExpressList(reqBody);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    /**
     * 快递物流节点跟踪
     * @Param com公司简称(必须)
     * @Param nu快递单号(必须)
     * @Param receiverPhone收件人手机号后四位，顺丰需要填写(可选)
     * @Param senderPhone寄件人手机号后四位,顺丰需要填写(可选)
     */
    @PostMapping(value = "/getExpressInfo")
    public JSONObject getExpressInfo(@RequestBody ExpressInfoReqBody reqBody) {//前端必须传回快递公司简称和快递单号
        JSONObject jsonObject = null;
        try {
            jsonObject = expressService.getExpressInfo(reqBody);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }


    /**
     *单号查快递公司名
     * @Param nu快递单号
     */
    @GetMapping(value = "/fetchCom")
    public JSONObject fetchCom(@RequestParam(value = "nu",required = false) String nu) {
        JSONObject jsonObject = null;
        try {
            jsonObject = expressService.fetchCom(nu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }



}
