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

import com.springapp.mvc.data.Variant;

import java.util.List;

/**
 * Created by abhayphougat on 29/03/15.
 */
public interface VariantDao {

    public Variant getVariant(String productCode, String variantCode);

    public int updateVariant(String productCode, Variant variant);

    public List<Variant> getVariants(String productCode);

    public boolean updateVariants(String productCode, List<Variant> variants);
}
