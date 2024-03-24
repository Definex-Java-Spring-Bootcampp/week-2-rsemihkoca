package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.*;

import java.util.List;

public interface ICampaignService {

    public List<CampaignWithCC> getAllCampaigns();
    public List<Campaign> getAllCampaignsOrdered();


}
