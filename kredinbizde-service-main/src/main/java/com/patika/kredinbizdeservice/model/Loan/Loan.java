package com.patika.kredinbizdeservice.model.Loan;

import com.patika.kredinbizdeservice.model.Bank;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public abstract class Loan {

    private Integer id;
    private BigDecimal amount;
    private Integer installment;
    private Bank bank;
    private Double interestRate;

    protected Loan(Integer id, BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        this.id = id;
        this.amount = amount;
        this.installment = installment;
        this.interestRate = interestRate;
        this.bank = bank;
    }

    abstract void calculate(BigDecimal amount, int installment);


    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", installment=" + installment +
                ", bank=" + bank +
                ", interestRate=" + interestRate +
                '}';
    }
}
