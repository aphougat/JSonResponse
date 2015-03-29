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

import com.springapp.mvc.data.Product;

import java.util.List;

/**
 * Created by abhayphougat on 29/03/15.
 */
public interface ProductService {

    public Product getProduct(String code);

    public List<Product> getProducts ();


}
