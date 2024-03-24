package com.patika.kredinbizdeservice.model.Loan;

import com.patika.kredinbizdeservice.factory.BankFactory;
import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.enums.LoanType;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class ConsumerLoan extends Loan {

    @Getter private LoanType loanType = LoanType.IHTIYAC_KREDISI;
    private List<Integer> installmentOptions;

    private ConsumerLoan(Integer id, BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        super(id, amount, installment, interestRate, bank);
    }


    @Override
    void calculate(BigDecimal amount, int installment) {
        //tc bul, maaşı bul
    }

    public static ConsumerLoan create(Integer id, BigDecimal amount, Integer installment, Double interestRate, Bank bank) {
        return new ConsumerLoan(id, amount, installment, interestRate, bank);
    }

    public static ConsumerLoan createRandom() {
        Random random = new Random();
        int id = random.nextInt(1, 1_000_000);
        BigDecimal amount = new BigDecimal(random.nextInt(50_000, 200_000));
        int installment = random.nextInt(1, 120);
        double interestRate = random.nextDouble();
        Bank bank = BankFactory.getInstance().createRandom();
        return new ConsumerLoan(id, amount, installment, interestRate, bank);
    }

}
