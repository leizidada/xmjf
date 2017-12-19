package com.shsxt.xm.api.service;

import com.shsxt.xm.api.po.BasUser;

/**
 * Created by leizidada on 2017/12/7.
 */
public interface IBasUserService {
     public BasUser queryBasUserById(Integer id);
     public BasUser queryBasUserByPhone(String phone);

    /**
     *
     *
     * @param phone
     * @param password
     */

      public void saveBasUser(String phone,String password);

      public  BasUser userLogin(String phone,String password);
         public BasUser quickLogin(String phone);



}
