package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.*;

import java.util.List;

public interface ICampaignService {

    List<CampaignWithCC> getAllCampaigns();
    List<Campaign> getAllCampaignsOrdered();


}
