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

package com.springapp.mvc.service;

import com.springapp.mvc.data.Warehouse;

import java.util.List;

/**
 * Created by abhayphougat on 02/04/15.
 */
public interface WarehouseService {

    public List<Warehouse> getAllWarehouse();

    public void createWarehouse(Warehouse warehouse);

    public int deleteWarehouse(int code);

    public Warehouse getWarehouse(int code);
}
