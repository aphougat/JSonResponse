package com.springapp.mvc.convertors.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springapp.mvc.convertors.FormatConvertor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by abhayphougat on 28/03/15.
 */
@Service
public class DefaultJsonConvertor<V> implements FormatConvertor<String,V>{


    @Override
    public String convert(V source) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        String jsonResponse = mapper.writeValueAsString(source);
        return jsonResponse;
    }

    @Override
    public String convert(List<V> source) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        String jsonResponse = mapper.writeValueAsString(source);
        return jsonResponse;

    }
}
