package com.patika.kredinbizdeservice.model.Loan;

import com.patika.kredinbizdenservice.factory.BankFactory;
import com.patika.kredinbizdenservice.model.Bank;
import com.patika.kredinbizdenservice.enums.LoanType;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class ConsumerLoan extends Loan {

    @Getter private LoanType loanType = LoanType.IHTIYAC_KREDISI;
    private List<Integer> installmentOptions;

    private ConsumerLoan(BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        super(amount, installment, interestRate, bank);
    }


    @Override
    void calculate(BigDecimal amount, int installment) {
        //tc bul, maaşı bul
    }

    public static ConsumerLoan create(BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        return new ConsumerLoan(amount, installment, interestRate, bank);
    }

    public static ConsumerLoan createRandom() {
        Random random = new Random();
        BigDecimal amount = new BigDecimal(random.nextInt(50_000, 200_000));
        int installment = random.nextInt(1, 120);
        double interestRate = random.nextDouble();
        Bank bank = BankFactory.getInstance().createRandom();
        return new ConsumerLoan(amount, installment, interestRate, bank);
    }

}
