package com.patika.kredinbizdeservice.model;

import lombok.Getter;

@Getter
public class CampaignWithCC {

    private Campaign campaign;
    private CreditCard creditCard;

    public CampaignWithCC(Campaign campaign, CreditCard creditCard) {
        this.campaign = campaign;
        this.creditCard = creditCard;
    }
}
