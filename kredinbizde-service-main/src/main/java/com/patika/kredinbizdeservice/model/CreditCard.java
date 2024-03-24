package com.patika.kredinbizdeservice.model;


import com.patika.kredinbizdeservice.factory.BankFactory;
import lombok.Getter;

import java.math.BigDecimal;

public class CreditCard{

    private BigDecimal fee;
    @Getter private Bank bank;


    private CreditCard(BigDecimal fee, Bank bank) {
        this.fee = fee;
        this.bank = bank;
    }

    public static CreditCard create(BigDecimal fee, Bank bank) {
        return new CreditCard(fee, bank);
    }

    public static CreditCard createRandom() {
        return new CreditCard(BigDecimal.valueOf(100), BankFactory.getInstance().createRandom());
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "fee=" + fee +
                ", campaignList=" + bank.getCampaignList() +
                ", bank=" + bank +
                '}';
    }
}
