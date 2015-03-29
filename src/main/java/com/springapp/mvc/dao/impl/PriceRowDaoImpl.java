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

import com.springapp.mvc.dao.PriceRowDao;
import com.springapp.mvc.data.PriceList;
import com.springapp.mvc.data.PriceRow;
import com.springapp.mvc.mappers.PriceRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by abhayphougat on 29/03/15.
 */
@Repository
public class PriceRowDaoImpl implements PriceRowDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final String GET_PRICE_QUERY="Select * from pricerows where code=? and productcode=?";

    private static final String UPDATE_PRICE_QUERY="Update pricerows set startdate=?, enddate=?,currency=?,amount=? where code=? and productcode=?";

    private static final String GET_PRICE_LIST_QUERY="Select * from pricerows where productcode=?";

    @Override
    public PriceRow getPrice(String productCode, String priceRowCode) {
        return jdbcTemplate.query(GET_PRICE_QUERY, new Object[]{priceRowCode,productCode}, new PriceRowMapper()).get(0);
    }

    @Override
    public int updatePrice(String productCode, PriceRow priceRow) {
        return jdbcTemplate.update(UPDATE_PRICE_QUERY,priceRow.getStartDate(),priceRow.getEndDate(),priceRow.getCurrency().getCurrencyCode(),priceRow.getCode(), productCode);
    }

    @Override
    public PriceList getPrice(String productCode) {

        PriceList prices = new PriceList();
        prices.setPriceRows(jdbcTemplate.query(GET_PRICE_QUERY, new Object[]{productCode}, new PriceRowMapper()));
        return prices;
    }

    @Override
    public boolean updatePrices(String productCode, PriceList priceList) {
        for(PriceRow price : priceList.getPriceRows())
        {
            int response = updatePrice(productCode,price);
            if(response <=0)
                return false;
        }

        return true;
    }
}
