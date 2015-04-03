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

package com.springapp.mvc.convertors.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springapp.mvc.convertors.FormatConverter;
import com.springapp.mvc.data.Warehouse;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/**
 * Created by abhayphougat on 03/04/15.
 */
@Service("JsonToObjectConverter")
public class JsonToObjectConverter implements FormatConverter<Warehouse, String> {


    @Override
    public Warehouse convert(String source) throws IOException,ClassNotFoundException {



        ObjectMapper mapper = new ObjectMapper();
        Warehouse value=  mapper.readValue(source,Warehouse.class);



        return value;
    }

    @Override
    public Warehouse convert(List<String> source) throws JsonProcessingException {
        return null;
    }


}
