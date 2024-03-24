package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.factory.BankFactory;
import com.patika.kredinbizdeservice.factory.CampaignFactory;
import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CampaignWithCC;

import java.util.List;
import java.util.Set;

public class CampaignRepository {

    private final List<Campaign> campaignList = CampaignFactory.getInstance().getCampaignList();
    private final Set<Bank> bankList = BankFactory.getInstance().getBankList();

    public List<CampaignWithCC> getCampaignsWithCreditCards() {
        return bankList.stream()
                .flatMap(bank -> bank.getCreditCardList().stream()
                        .flatMap(creditCard -> bank.getCampaignList().stream()
                                .map(campaign -> new CampaignWithCC(campaign, creditCard))))
                .toList();
    }


    public List<Campaign> getAllOrderedWithoutCreditCard() {
        return campaignList.stream()
                .sorted((c1, c2) -> c2.getCreateDate().compareTo(c1.getCreateDate()))
                .toList();
    }

}
