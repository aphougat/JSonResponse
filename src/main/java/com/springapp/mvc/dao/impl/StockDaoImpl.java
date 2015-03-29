/*
 *
 *  *
 *  * Copyright (c) 2015 itembryo AG
 *  * All rights reserved.
 *  *
 *  * This software is the confidential and proprietary information of itembryo
 *  * ("Confidential Information"). You shall not disclose such Confidential
 *  * Information and shall use it only in accordance with the terms of the
 *  * license agreement you entered into with itembryo.
 *  *
 *  *
 *
 */

package com.springapp.mvc.dao.impl;

import com.springapp.mvc.dao.StockDao;
import com.springapp.mvc.data.Stock;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by abhayphougat on 29/03/15.
 */
@Repository
public class StockDaoImpl implements StockDao {
    @Override
    public Stock getStock(String productCode) {
        return null;
    }

    @Override
    public boolean updateStock(String productCode, Stock stock) {
        return false;
    }
}
