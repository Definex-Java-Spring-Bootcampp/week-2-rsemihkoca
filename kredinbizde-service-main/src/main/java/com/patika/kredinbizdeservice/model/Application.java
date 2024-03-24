package com.patika.kredinbizdeservice.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.patika.kredinbizdeservice.enums.ApplicationStatus;
import com.patika.kredinbizdeservice.model.Loan.Loan;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.concurrent.ThreadLocalRandom;

public class Application {

    @Getter private Loan loan;
    @JsonIgnore
    @Getter private User user;
    @Getter private LocalDateTime localDateTime;
    private ApplicationStatus applicationStatus;

    private Application(Loan loan, User user, LocalDateTime localDateTime) {
        this.loan = loan;
        this.user = user;
        this.localDateTime = localDateTime;
        this.applicationStatus = ApplicationStatus.INITIAL;

    }

    public static Application create(Loan loan, User user, LocalDateTime localDateTime) {
        return new Application(loan, user, localDateTime);
    }

    public static Application createRandom(Loan loan, User user) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime threeMonthsAgo = currentDateTime.minusMonths(3);
        long minSecond = threeMonthsAgo.atZone(ZoneId.systemDefault()).toEpochSecond();
        long maxSecond = currentDateTime.atZone(ZoneId.systemDefault()).toEpochSecond();
        long randomSecond = ThreadLocalRandom.current().nextLong(minSecond, maxSecond);
        LocalDateTime randomDateTime = LocalDateTime.ofEpochSecond(randomSecond, 0, ZoneOffset.UTC);

        return new Application(loan, user, randomDateTime);

    }


    @Override
    public String toString() {
        return "Application{" +
                "loan=" + loan +
                ", user=" + user +
                ", localDateTime=" + localDateTime +
                ", applicationStatus=" + applicationStatus +
                '}';
    }
}
