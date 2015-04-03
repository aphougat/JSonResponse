package com.springapp.mvc.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springapp.mvc.convertors.FormatConverter;
import com.springapp.mvc.data.Product;
import com.springapp.mvc.data.Warehouse;
import com.springapp.mvc.service.ProductService;
import com.springapp.mvc.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class JsonResponseController {


	@Resource(name="ObjectToJsonConverter")
	FormatConverter<String,Product> jsonConvertor;
	@Resource(name="ObjectToJsonConverter")
	FormatConverter<String,Warehouse> warehouseJsonConverter;
	@Resource(name="JsonToObjectConverter")
	FormatConverter<Warehouse,String> jsonWarehouseConverter;

	@Autowired
	ProductService productService;
	@Autowired
	WarehouseService warehouseService;



	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getProducts() {
		try {
			return jsonConvertor.convert(productService.getProducts()) ;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "error in conversion";
	}

	@RequestMapping(method = RequestMethod.GET,value = "/warehouses")
	public String getWarehouses(Model model)
	{
		try {
			String warehouses=  warehouseJsonConverter.convert(warehouseService.getAllWarehouse());
			model.addAttribute("warehouses",warehouses);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return "warehouses";
	}

	@RequestMapping(method = RequestMethod.POST, value ="/warehouses")
	public String importWarehouses(@RequestParam(value="warehouse") String warehouse, Model model)
	{
		try {
			warehouseService.createWarehouse(jsonWarehouseConverter.convert(warehouse));
			String warehouses=  warehouseJsonConverter.convert(warehouseService.getAllWarehouse());
			model.addAttribute("warehouses", warehouses);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "warehouses";
	}
}