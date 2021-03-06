package com.shsxt.xm.api.service;

import com.shsxt.xm.api.dto.BasItemDto;
import com.shsxt.xm.api.query.BasItemQuery;
import com.shsxt.xm.api.utils.PageList;

/**
 * Created by leizidada on 2017/12/12.
 */

public interface IBasItemService {
        public PageList queryBasItemsByParams(BasItemQuery basItemQuery);


    public void updateBasItemStatusToOpen(Integer itemId);

    public BasItemDto queryBasItemByItemId(Integer itemId);
}
