package com.neusoft.bsp.mvoproduct.service;

import com.neusoft.bsp.mvoproduct.entity.ImgImage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImgImageService {

    List<ImgImage> searchImg(int pro_id);

    ImgImage searchBrdImg(int brd_id);

    int addBrdImg(String uri, int brd_id);

    int updateBrdImg(String uri, int brd_id);

    int deleteBrdImg(int brd_id);

}
