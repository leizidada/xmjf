package com.shsxt.xm.api.service;

import com.shsxt.xm.api.po.BusItemInvest;
import com.shsxt.xm.api.query.BusItemInvestQuery;
import com.shsxt.xm.api.utils.PageList;

/**
 * Created by leizidada on 2017/12/16.
 */
public interface IBusItemInvestService {
    public PageList queryBusItemInvestsByParams(BusItemInvestQuery busItemInvestQuery);

}
