package com.neusoft.bsp.dropshipper.service;

//@Service
public interface DropShipperService {
    String getDropShipperName(String DSR_ID);
    String getDropShipperRemark(String DSR_ID);
    void updateDropShipperName(String DSR_ID, String NAME);
    void updateRemark(String DSR_ID, String REMARK);
}
