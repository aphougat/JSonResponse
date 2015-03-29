package com.springapp.mvc.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springapp.mvc.convertors.FormatConvertor;
import com.springapp.mvc.data.Product;
import com.springapp.mvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class JsonResponseController {

	@Autowired
	FormatConvertor<String,Product> jsonConvertor;
	@Autowired
	ProductService productService;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getProducts() {
		try {
			return jsonConvertor.convert(productService.getProducts()) ;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "hello";
	}
}