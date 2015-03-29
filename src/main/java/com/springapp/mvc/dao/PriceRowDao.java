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

package com.springapp.mvc.dao;

import com.springapp.mvc.data.PriceList;
import com.springapp.mvc.data.PriceRow;

import java.util.List;

/**
 * Created by abhayphougat on 29/03/15.
 */
public interface PriceRowDao {


    public PriceRow getPrice(String productCode, String priceRowCode);

    public int updatePrice(String productCode, PriceRow priceRow);

    public PriceList getPrice(String productCode);

    public boolean updatePrices(String productCode, PriceList priceList);


}
