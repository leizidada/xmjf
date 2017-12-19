package com.shsxt.xm.api.service;

import com.shsxt.xm.api.model.ResultInfo;
import com.shsxt.xm.api.po.BasUserSecurity;

/**
 * Created by leizidada on 2017/12/16.
 */
public interface IBasUserSecurityService {
    public BasUserSecurity queryBasUserSecurityByUserId(Integer userId);

    public ResultInfo userAuthCheck(Integer userId);
    public void doUserAuth(String realname,String idCard,String businessPassword,String confirmPassword,Integer userId);
}
