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

import com.springapp.mvc.dao.ProductDao;
import com.springapp.mvc.data.Product;
import com.springapp.mvc.mappers.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by abhayphougat on 29/03/15.
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private static final String GET_PRODUCT_QUERY="Select * from products where code=?";

    private static final String UPDATE_PRODUCT_QUERY="Update products set name=?, description=? where code=?";

    private static final String GET_PRODUCTS_QUERY="Select * from products";

    @Override
    public Product getProduct(String productCode) {
        List<Product> products = jdbcTemplate.query(GET_PRODUCT_QUERY,new Object[]{productCode},new ProductRowMapper());

        return products.get(0);
    }

    @Override
    public int updateProduct(Product product) {
        return jdbcTemplate.update(UPDATE_PRODUCT_QUERY,product.getName(), product.getDesc(), product.getCode());
    }

    @Override
    public boolean deleteProduct(String productCode) {
        return false;
    }

    @Override
    public List<Product> getProducts() {

        return jdbcTemplate.query(GET_PRODUCTS_QUERY,new ProductRowMapper());
    }
}
