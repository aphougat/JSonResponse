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

package com.springapp.mvc.service.impl;

import com.springapp.mvc.dao.WarehouseDao;
import com.springapp.mvc.data.Warehouse;
import com.springapp.mvc.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by abhayphougat on 02/04/15.
 */
@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseDao warehouseDao;
    @Override
    public List<Warehouse> getAllWarehouse() {
        return warehouseDao.getAll();
    }

    @Override
    public void createWarehouse(Warehouse warehouse) {

        warehouseDao.create(warehouse);
    }

    @Override
    public int deleteWarehouse(int code) {
        return warehouseDao.deleteById(code);

    }

    @Override
    public Warehouse getWarehouse(int code) {
        return warehouseDao.getById(code);
    }
}
