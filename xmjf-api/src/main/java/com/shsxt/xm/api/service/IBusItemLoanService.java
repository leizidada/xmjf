package com.shsxt.xm.api.service;

import com.shsxt.xm.api.po.BusItemLoan;

/**
 * Created by leizidada on 2017/12/16.
 */
public interface IBusItemLoanService {
    public BusItemLoan queryBusItemLoanByItemId(Integer itemId);
}
