package com.patika.kredinbizdeservice.factory;

import com.patika.kredinbizdeservice.enums.LoanType;
import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Loan.ConsumerLoan;
import com.patika.kredinbizdeservice.model.Loan.HouseLoan;
import com.patika.kredinbizdeservice.model.Loan.Loan;
import com.patika.kredinbizdeservice.model.Loan.VehicleLoan;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
public class LoanFactory{

    private static volatile LoanFactory instance;
    private List<Loan> loanList = new ArrayList<>();

    private LoanFactory() {
    }

    public static LoanFactory getInstance() {
        if (instance == null) {
            synchronized (LoanFactory.class) {
                if (instance == null) {
                    instance = new LoanFactory();
                }
            }
        }
        return instance;
    }

    public Loan create(Integer id, LoanType loanType, BigDecimal amount, Integer installment, Double interestRate, Bank bank) {

        Loan loan = switch (loanType) {
            case IHTIYAC_KREDISI -> ConsumerLoan.create(id, amount, installment, interestRate, bank);
            case KONUT_KREDISI -> HouseLoan.create(id, amount, installment, interestRate, bank);
            case ARAC_KREDISI -> VehicleLoan.create(id, amount, installment, interestRate, bank);
        };


        bank.addLoan(loan);
        loanList.add(loan);


        return loan;

    }

    public Loan createRandom(LoanType loanType) {

        Loan loan = switch (loanType) {
            case IHTIYAC_KREDISI -> ConsumerLoan.createRandom();
            case KONUT_KREDISI -> HouseLoan.createRandom();
            case ARAC_KREDISI -> VehicleLoan.createRandom();
        };

        loan.getBank().addLoan(loan);
        loanList.add(loan);

        return loan;

    }
}
