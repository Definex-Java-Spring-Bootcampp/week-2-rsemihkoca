package com.patika.kredinbizdeservice.model.Loan;



import com.patika.kredinbizdeservice.enums.LoanType;
import com.patika.kredinbizdeservice.factory.BankFactory;
import com.patika.kredinbizdeservice.model.Bank;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class HouseLoan extends Loan {

    @Getter private LoanType loanType = LoanType.KONUT_KREDISI;

    private HouseLoan(Integer id, BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        super(id, amount, installment, interestRate, bank);
    }


    @Override
    void calculate(BigDecimal amount, int installment) {

    }

    public static HouseLoan create(Integer id, BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        return new HouseLoan(id, amount, installment, interestRate, bank);
    }

    public static HouseLoan createRandom() {
        Random random = new Random();
        Integer id = random.nextInt(1, 1_000_000);
        BigDecimal amount = new BigDecimal(random.nextInt(10_000, 10_000_000));
        int installment = random.nextInt(1, 120);
        double interestRate = random.nextDouble();
        Bank bank = BankFactory.getInstance().createRandom();
        return new HouseLoan(id, amount, installment, interestRate, bank);
    }
}
