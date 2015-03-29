package com.springapp.mvc.data;

import java.util.List;

/**
 * Created by abhayphougat on 28/03/15.
 */

public class PriceList {

private List<PriceRow> priceRows;

    @Override
    public String toString() {
        return "PriceList{" +
                "priceRows=" + priceRows +
                '}';
    }

    public List<PriceRow> getPriceRows() {
        return priceRows;
    }

    public void setPriceRows(List<PriceRow> priceRows) {
        this.priceRows = priceRows;
    }
}
