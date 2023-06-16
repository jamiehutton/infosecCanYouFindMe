package com.quantexa.infosecCanYouFindMe.scoring.model

import com.quantexa.scoring.framework.model.scoringmodel.ScoringModelProvider
import com.quantexa.bankingdemo.scoring.model.banking.BankingDemoModelDefinition
import com.quantexa.bankingdemo.scoring.model.trade.TradeAMLModelDefinition

class ModelProvider extends ScoringModelProvider {
  def scoringModels = Seq(
    infosecCanYouFindMe
  )
}
