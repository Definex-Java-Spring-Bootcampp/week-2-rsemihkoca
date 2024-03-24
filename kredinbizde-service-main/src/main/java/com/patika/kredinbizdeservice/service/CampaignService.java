package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.CampaignWithCC;
import com.patika.kredinbizdeservice.repository.CampaignRepository;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CampaignService implements ICampaignService{
//   - C) Bankaların kredi kartlarını ve bu kartların kampanyalarını listeleyen end-point’i yazın.
//   - D) Sistemdeki bütün kampanyaları en güncelden eski tarihe doğru listeleyen end-point’i yazın.

    private final CampaignRepository campaignRepository = new CampaignRepository();

    @Override
    public List<CampaignWithCC> getAllCampaigns() {
        return campaignRepository.getCampaignsWithCreditCards();
    }

    @Override
    public List<Campaign> getAllCampaignsOrdered() {
        return campaignRepository.getAllOrderedWithoutCreditCard();
    }
}
