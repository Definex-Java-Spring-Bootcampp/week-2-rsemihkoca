package com.patika.kredinbizdeservice.model.Loan;

import com.patika.kredinbizdeservice.enums.LoanType;
import com.patika.kredinbizdeservice.factory.BankFactory;
import com.patika.kredinbizdeservice.model.Bank;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Random;

@Getter
public class VehicleLoan extends Loan {

    private final LoanType loanType = LoanType.ARAC_KREDISI;

    private VehicleLoan(Integer id, BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        super(id, amount, installment, interestRate, bank);
    }

    @Override
    void calculate(BigDecimal amount, int installment) {
    }

    public static VehicleLoan create(Integer id, BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        return new VehicleLoan(id, amount, installment, interestRate, bank);
    }

    public static VehicleLoan createRandom() {
        Random random = new Random();
        int id = random.nextInt(1, 1_000_000);
        BigDecimal amount = new BigDecimal(random.nextInt(50_000, 200_000));
        int installment = random.nextInt(1, 120);
        double interestRate = random.nextDouble();
        Bank bank = BankFactory.getInstance().createRandom();
        return new VehicleLoan(id, amount, installment, interestRate, bank);
    }
}
