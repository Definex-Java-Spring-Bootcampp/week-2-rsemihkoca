package com.patika.kredinbizdeservice;

import com.patika.kredinbizdeservice.factory.*;
import com.patika.kredinbizdeservice.model.*;
import com.patika.kredinbizdeservice.enums.*;
import com.patika.kredinbizdeservice.model.Loan.Loan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class KredinbizdeServiceApplication {

    public static void main(String[] args) {


        UserFactory userFactory = UserFactory.getInstance();
        UserFactory userFactory2 = UserFactory.getInstance();
        System.out.printf("userFactory == userFactory2: %b%n", userFactory == userFactory2);

        LoanFactory loanFactory = LoanFactory.getInstance();
        LoanFactory loanFactory2 = LoanFactory.getInstance();
        System.out.printf("loanFactory == loanFactory2: %b%n", loanFactory == loanFactory2);

        BankFactory bankFactory = BankFactory.getInstance();
        BankFactory bankFactory2 = BankFactory.getInstance();
        System.out.printf("bankFactory == bankFactory2: %b%n", bankFactory == bankFactory2);

        ApplicationFactory applicationFactory = ApplicationFactory.getInstance();
        ApplicationFactory applicationFactory2 = ApplicationFactory.getInstance();
        System.out.printf("applicationFactory == applicationFactory2: %b%n", applicationFactory == applicationFactory2);

        CampaignFactory campaignFactory = CampaignFactory.getInstance();
        CampaignFactory campaignFactory2 = CampaignFactory.getInstance();
        System.out.printf("campaignFactory == campaignFactory2: %b%n", campaignFactory == campaignFactory2);

        CreditCardFactory creditCardFactory = CreditCardFactory.getInstance();
        CreditCardFactory creditCardFactory2 = CreditCardFactory.getInstance();
        System.out.printf("creditCardFactory == creditCardFactory2: %b%n", creditCardFactory == creditCardFactory2);


        User ali = userFactory.create("Ali", "Veli", LocalDate.of(1990, 1, 1), "aliveli@outlook.com", "123456", "1234567890", true);
        User cem = userFactory.create("Cem", "Dırman", LocalDate.of(1973, 1, 1), "cemdrman@gmail.com", "5d5d5", "5569987562", true);
        User zeynep = userFactory.create("Zeynep", "Yılmaz", LocalDate.of(1990, 1, 1), "zeynepyilmaz@example.com", "123456", "1234567890", true);


        List<Application> applications = new ArrayList<>();

        User[] users = {ali, cem, zeynep};
        LoanType[] loans = {LoanType.IHTIYAC_KREDISI, LoanType.KONUT_KREDISI, LoanType.ARAC_KREDISI};


        for (User user : users) {
            for (LoanType loanType : loans) {
                Random random = new Random();
                int randInt = random.nextInt(3) + 1;
                for (int i = 0; i < randInt; i++) {
                    Loan loan = loanFactory.createRandom(loanType);
                    applicationFactory.createRandom(loan, user);
                }
            }
        }

        // Aşağıdaki loanlar ApplicationController için.
        Loan testloan = loanFactory.create(1, LoanType.IHTIYAC_KREDISI, BigDecimal.valueOf(110.01), 1, 1.1, bankFactory.createRandom());
        Loan testloan1 = loanFactory.create(2, LoanType.ARAC_KREDISI, BigDecimal.valueOf(10.01), 1, 1.1, bankFactory.createRandom());
        System.out.println("Test Loans Created!");


        campaignFactory.createRandomCampaigns(5);

        creditCardFactory.createRandomCreditCards(10);

        SpringApplication.run(KredinbizdeServiceApplication.class, args);

        System.out.println("Data Generated Successfully!");


    }

}
