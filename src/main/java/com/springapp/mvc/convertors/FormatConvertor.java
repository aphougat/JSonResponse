package com.springapp.mvc.convertors;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

/**
 * Created by abhayphougat on 28/03/15.
 */
public interface FormatConvertor<K,V> {

    public K convert(V source) throws JsonProcessingException;

    public K convert (List<V> source) throws JsonProcessingException;
}
