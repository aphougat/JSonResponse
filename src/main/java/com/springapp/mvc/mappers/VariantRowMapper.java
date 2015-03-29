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

import com.springapp.mvc.data.Variant;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by abhayphougat on 29/03/15.
 */
@Resource
public class VariantRowMapper implements RowMapper<Variant> {


    @Override
    public Variant mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Variant variant = new Variant();

        variant.setCode(resultSet.getInt("code"));
        variant.setColor(Color.getColor(resultSet.getString("color")));
        variant.setSize(resultSet.getInt("size"));

        return variant;
    }
}
