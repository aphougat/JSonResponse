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

import com.springapp.mvc.dao.VariantDao;
import com.springapp.mvc.data.Variant;
import com.springapp.mvc.mappers.VariantRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by abhayphougat on 29/03/15.
 */
@Repository
public class VariantDaoImpl implements VariantDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final String GET_VARIANT_QUERY="Select * from Variants where product=? and code=?";

    private static final String UPDATE_VARIANT_QUERY="Update Variants set color=?, size=? where product=? and code=?";

    private static final String GET_VARIANTS_QUERY="Select * from Variants where product=?";


    @Override
    public Variant getVariant(String productCode, String variantCode) {
        List<Variant> results=  jdbcTemplate.query(GET_VARIANT_QUERY,new Object[] {productCode}, new VariantRowMapper());
        return results.get(0);
    }

    @Override
    public int updateVariant(String productCode, Variant variant) {
        return jdbcTemplate.update(UPDATE_VARIANT_QUERY,variant.getColor(),variant.getSize(),productCode, variant.getCode());


    }

    @Override
    public List<Variant> getVariants(String productCode) {

        return  jdbcTemplate.query(GET_VARIANTS_QUERY,new Object[] {productCode}, new VariantRowMapper());

    }

    @Override
    public boolean updateVariants(String productCode, List<Variant> variants) {
        //ArrayList success = new ArrayList();
        for (Variant variant : variants)
        {
           int returnedValue =  updateVariant(productCode,variant);
            if (returnedValue <= 0) {
                return false;
            }

        }
        return true;
    }
}
