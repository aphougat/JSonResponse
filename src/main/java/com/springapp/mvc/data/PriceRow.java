package com.springapp.mvc.data;

import java.util.Currency;
import java.util.Date;

/**
 * Created by abhayphougat on 28/03/15.
 */

public class PriceRow {

    private int code;

    private Date startDate;

    private Date endDate;

    private Currency currency;

    private double amount;

    @Override
    public String toString() {
        return "PriceRow{" +
                "code=" + code +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", currency=" + currency +
                ", amount=" + amount +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
