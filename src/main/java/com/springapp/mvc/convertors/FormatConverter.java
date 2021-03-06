package com.springapp.mvc.convertors;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

/**
 * Created by abhayphougat on 28/03/15.
 */
public interface FormatConverter<K,V> {

    public K convert(V source) throws JsonProcessingException,Exception;

    public K convert (List<V> source) throws JsonProcessingException;

}
