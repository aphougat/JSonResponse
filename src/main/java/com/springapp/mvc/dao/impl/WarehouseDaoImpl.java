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

import com.mongodb.WriteResult;
import com.springapp.mvc.dao.WarehouseDao;
import com.springapp.mvc.data.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by abhayphougat on 02/04/15.
 */
@Repository
public class WarehouseDaoImpl implements WarehouseDao {

    @Autowired
    private MongoOperations mongoOperations;


    private static final String WAREHOUSE_COLLECIONS="warehouse";

    @Override
    public void create(Warehouse warehouse) {

        this.mongoOperations.insert(warehouse,WAREHOUSE_COLLECIONS);
    }

    @Override
    public List<Warehouse> getAll() {

      return  this.mongoOperations.findAll(Warehouse.class,WAREHOUSE_COLLECIONS);

    }

    @Override
    public Warehouse getById(int code) {

        Query select = new Query(Criteria.where("_code").is(code));

        return mongoOperations.findOne(select,Warehouse.class,WAREHOUSE_COLLECIONS);
    }

    @Override
    public int deleteById(int code) {

        Query remove = new Query(Criteria.where("_code").is(code));

        WriteResult result = mongoOperations.remove(remove, Warehouse.class, WAREHOUSE_COLLECIONS);

        return result.getN();
    }
}
