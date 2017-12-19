package com.shsxt.xm.api.service;

import com.shsxt.xm.api.po.SysPicture;

import java.util.List;

/**
 * Created by leizidada on 2017/12/16.
 */
public interface ISysPictureService {
    public List<SysPicture> querySysPicturesByItemId(Integer itemId);
}
