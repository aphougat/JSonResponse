package com.springapp.mvc.data;

/**
 * Created by abhayphougat on 28/03/15.
 */
public class Stock {

    private int code;

    private int reservedAmount;

    private int totalStock;

    private int atp;

    @Override
    public String toString() {
        return "Stock{" +
                "code=" + code +
                ", reservedAmount=" + reservedAmount +
                ", totalStock=" + totalStock +
                ", atp=" + atp +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getReservedAmount() {
        return reservedAmount;
    }

    public void setReservedAmount(int reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public int getAtp() {
        return atp;
    }

    public void setAtp(int atp) {
        this.atp = atp;
    }
}
