package com.springapp.mvc.data;

import java.util.List;

/**
 * Created by abhayphougat on 28/03/15.
 */

public class Product {

    private int code;

    private String name;

    private String desc;

    private PriceList priceList;

    private Stock stock;

    private List<Variant> variants;

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", priceList=" + priceList +
                ", stock=" + stock +
                ", variants=" + variants +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PriceList getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }
}
