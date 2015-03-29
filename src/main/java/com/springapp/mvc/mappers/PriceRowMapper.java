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

package com.springapp.mvc.mappers;

import com.springapp.mvc.data.PriceRow;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Currency;
import java.util.Date;

/**
 * Created by abhayphougat on 29/03/15.
 */
@Resource
public class PriceRowMapper implements RowMapper<PriceRow> {

    @Override
    public PriceRow mapRow(ResultSet resultSet, int i) throws SQLException {
        PriceRow priceRow = new PriceRow();

        priceRow.setCode(resultSet.getInt("code"));
        priceRow.setAmount(resultSet.getDouble("amount"));
        priceRow.setStartDate(resultSet.getDate("startdate"));
        priceRow.setEndDate(resultSet.getDate("enddate"));
        priceRow.setCurrency(Currency.getInstance(resultSet.getString("currency")));

        return priceRow;

    }
}
