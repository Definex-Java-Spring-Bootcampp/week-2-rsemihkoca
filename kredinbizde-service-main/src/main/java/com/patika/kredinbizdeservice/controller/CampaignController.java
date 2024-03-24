package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CampaignWithCC;
import com.patika.kredinbizdeservice.service.ICampaignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/campaigns")
public class CampaignController {

    private final ICampaignService campaignService;

    public CampaignController(ICampaignService campaignService) {
        this.campaignService = campaignService;
    }

    //   - C) Bankaların kredi kartlarını ve bu kartların kampanyalarını listeleyen end-point’i yazın.
    //   - D) Sistemdeki bütün kampanyaları en güncelden eski tarihe doğru listeleyen end-point’i yazın.

    @GetMapping("/WithCC")
    public List<CampaignWithCC> getAllCampaigns() {
        return campaignService.getAllCampaigns();
    }

    @GetMapping("/All")
    public List<Campaign> getAllCampaignsOrdered() {
        return campaignService.getAllCampaignsOrdered();
    }



}


