package com.leon.dbbatchdeal.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * (JyTunitstock)实体类
 *
 * @author makejava
 * @since 2022-11-07 20:21:25
 */
public class JyTunitstock implements Serializable {

    private static final long serialVersionUID = 973199750301945465L;

    private Integer businessDate;

    private Integer companyId;

    private Integer fundId;

    private Integer assetId;

    private Integer combiId;

    private String investType;

    private String positionType;

    private Integer marketNo;

    private String bindSeat;

    private String stockholderId;

    private Integer interCode;

    private BigDecimal beginAmount;

    private BigDecimal currentAmount;

    private BigDecimal enableAmount;

    private BigDecimal uncirculatedAmount;

    private BigDecimal dividendRightAmount;

    private BigDecimal yjuncirculatedAmount;

    private BigDecimal totalShareout;

    private BigDecimal prebuyAmount;

    private BigDecimal presaleAmount;

    private BigDecimal buyAmount;

    private BigDecimal saleAmount;

    private BigDecimal buyBalance;

    private BigDecimal saleBalance;

    private BigDecimal buyFee;

    private BigDecimal saleFee;

    private BigDecimal realBuyFee;

    private BigDecimal realSaleFee;

    private BigDecimal beginOriginalCost;

    private BigDecimal beginCarryoverCost;

    private BigDecimal beginOriginalInterestCost;

    private BigDecimal beginCarryoverInterestCost;

    private BigDecimal beginCarryoverRealCost;

    private BigDecimal beginOriginalRealCost;

    private BigDecimal originalCost;

    private BigDecimal carryoverCost;

    private BigDecimal originalInterestCost;

    private BigDecimal carryoverInterestCost;

    private BigDecimal carryoverRealCost;

    private BigDecimal originalRealCost;

    private BigDecimal beginOriginalProfit;

    private BigDecimal beginCarryoverProfit;

    private BigDecimal beginOriginalRealProfit;

    private BigDecimal beginCarryoverRealProfit;

    private BigDecimal beginOriginalIntProfit;

    private BigDecimal beginCarryoverIntProfit;

    private BigDecimal originalProfit;

    private BigDecimal carryoverProfit;

    private BigDecimal originalRealProfit;

    private BigDecimal carryoverRealProfit;

    private BigDecimal originalInterestProfit;

    private BigDecimal carryoverInterestProfit;

    private BigDecimal onthewayDividend;

    private BigDecimal uncarryoverDividend;

    private BigDecimal dividend;

    private String assetType;

    private BigDecimal optionOccupyDeposit;

    private BigDecimal releasableAmount;

    private BigDecimal lockableAmount;

    private BigDecimal originalCostTrade;

    private BigDecimal carryoverCostTrade;

    private BigDecimal originalProfitTrade;

    private BigDecimal carryoverProfitTrade;

    private BigDecimal originalRealCostTrade;

    private BigDecimal carryoverRealCostTrade;

    private BigDecimal originalRealProfitTrade;

    private BigDecimal carryoverRealProfitTrade;

    private BigDecimal strategyPlacingAmount;

    private BigDecimal straPlacFrzAmt;


    public Integer getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Integer businessDate) {
        this.businessDate = businessDate;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getFundId() {
        return fundId;
    }

    public void setFundId(Integer fundId) {
        this.fundId = fundId;
    }

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public Integer getCombiId() {
        return combiId;
    }

    public void setCombiId(Integer combiId) {
        this.combiId = combiId;
    }

    public String getInvestType() {
        return investType;
    }

    public void setInvestType(String investType) {
        this.investType = investType;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public Integer getMarketNo() {
        return marketNo;
    }

    public void setMarketNo(Integer marketNo) {
        this.marketNo = marketNo;
    }

    public String getBindSeat() {
        return bindSeat;
    }

    public void setBindSeat(String bindSeat) {
        this.bindSeat = bindSeat;
    }

    public String getStockholderId() {
        return stockholderId;
    }

    public void setStockholderId(String stockholderId) {
        this.stockholderId = stockholderId;
    }

    public Integer getInterCode() {
        return interCode;
    }

    public void setInterCode(Integer interCode) {
        this.interCode = interCode;
    }

    public BigDecimal getBeginAmount() {
        return beginAmount;
    }

    public void setBeginAmount(BigDecimal beginAmount) {
        this.beginAmount = beginAmount;
    }

    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }

    public BigDecimal getEnableAmount() {
        return enableAmount;
    }

    public void setEnableAmount(BigDecimal enableAmount) {
        this.enableAmount = enableAmount;
    }

    public BigDecimal getUncirculatedAmount() {
        return uncirculatedAmount;
    }

    public void setUncirculatedAmount(BigDecimal uncirculatedAmount) {
        this.uncirculatedAmount = uncirculatedAmount;
    }

    public BigDecimal getDividendRightAmount() {
        return dividendRightAmount;
    }

    public void setDividendRightAmount(BigDecimal dividendRightAmount) {
        this.dividendRightAmount = dividendRightAmount;
    }

    public BigDecimal getYjuncirculatedAmount() {
        return yjuncirculatedAmount;
    }

    public void setYjuncirculatedAmount(BigDecimal yjuncirculatedAmount) {
        this.yjuncirculatedAmount = yjuncirculatedAmount;
    }

    public BigDecimal getTotalShareout() {
        return totalShareout;
    }

    public void setTotalShareout(BigDecimal totalShareout) {
        this.totalShareout = totalShareout;
    }

    public BigDecimal getPrebuyAmount() {
        return prebuyAmount;
    }

    public void setPrebuyAmount(BigDecimal prebuyAmount) {
        this.prebuyAmount = prebuyAmount;
    }

    public BigDecimal getPresaleAmount() {
        return presaleAmount;
    }

    public void setPresaleAmount(BigDecimal presaleAmount) {
        this.presaleAmount = presaleAmount;
    }

    public BigDecimal getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(BigDecimal buyAmount) {
        this.buyAmount = buyAmount;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public BigDecimal getBuyBalance() {
        return buyBalance;
    }

    public void setBuyBalance(BigDecimal buyBalance) {
        this.buyBalance = buyBalance;
    }

    public BigDecimal getSaleBalance() {
        return saleBalance;
    }

    public void setSaleBalance(BigDecimal saleBalance) {
        this.saleBalance = saleBalance;
    }

    public BigDecimal getBuyFee() {
        return buyFee;
    }

    public void setBuyFee(BigDecimal buyFee) {
        this.buyFee = buyFee;
    }

    public BigDecimal getSaleFee() {
        return saleFee;
    }

    public void setSaleFee(BigDecimal saleFee) {
        this.saleFee = saleFee;
    }

    public BigDecimal getRealBuyFee() {
        return realBuyFee;
    }

    public void setRealBuyFee(BigDecimal realBuyFee) {
        this.realBuyFee = realBuyFee;
    }

    public BigDecimal getRealSaleFee() {
        return realSaleFee;
    }

    public void setRealSaleFee(BigDecimal realSaleFee) {
        this.realSaleFee = realSaleFee;
    }

    public BigDecimal getBeginOriginalCost() {
        return beginOriginalCost;
    }

    public void setBeginOriginalCost(BigDecimal beginOriginalCost) {
        this.beginOriginalCost = beginOriginalCost;
    }

    public BigDecimal getBeginCarryoverCost() {
        return beginCarryoverCost;
    }

    public void setBeginCarryoverCost(BigDecimal beginCarryoverCost) {
        this.beginCarryoverCost = beginCarryoverCost;
    }

    public BigDecimal getBeginOriginalInterestCost() {
        return beginOriginalInterestCost;
    }

    public void setBeginOriginalInterestCost(BigDecimal beginOriginalInterestCost) {
        this.beginOriginalInterestCost = beginOriginalInterestCost;
    }

    public BigDecimal getBeginCarryoverInterestCost() {
        return beginCarryoverInterestCost;
    }

    public void setBeginCarryoverInterestCost(BigDecimal beginCarryoverInterestCost) {
        this.beginCarryoverInterestCost = beginCarryoverInterestCost;
    }

    public BigDecimal getBeginCarryoverRealCost() {
        return beginCarryoverRealCost;
    }

    public void setBeginCarryoverRealCost(BigDecimal beginCarryoverRealCost) {
        this.beginCarryoverRealCost = beginCarryoverRealCost;
    }

    public BigDecimal getBeginOriginalRealCost() {
        return beginOriginalRealCost;
    }

    public void setBeginOriginalRealCost(BigDecimal beginOriginalRealCost) {
        this.beginOriginalRealCost = beginOriginalRealCost;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    public BigDecimal getCarryoverCost() {
        return carryoverCost;
    }

    public void setCarryoverCost(BigDecimal carryoverCost) {
        this.carryoverCost = carryoverCost;
    }

    public BigDecimal getOriginalInterestCost() {
        return originalInterestCost;
    }

    public void setOriginalInterestCost(BigDecimal originalInterestCost) {
        this.originalInterestCost = originalInterestCost;
    }

    public BigDecimal getCarryoverInterestCost() {
        return carryoverInterestCost;
    }

    public void setCarryoverInterestCost(BigDecimal carryoverInterestCost) {
        this.carryoverInterestCost = carryoverInterestCost;
    }

    public BigDecimal getCarryoverRealCost() {
        return carryoverRealCost;
    }

    public void setCarryoverRealCost(BigDecimal carryoverRealCost) {
        this.carryoverRealCost = carryoverRealCost;
    }

    public BigDecimal getOriginalRealCost() {
        return originalRealCost;
    }

    public void setOriginalRealCost(BigDecimal originalRealCost) {
        this.originalRealCost = originalRealCost;
    }

    public BigDecimal getBeginOriginalProfit() {
        return beginOriginalProfit;
    }

    public void setBeginOriginalProfit(BigDecimal beginOriginalProfit) {
        this.beginOriginalProfit = beginOriginalProfit;
    }

    public BigDecimal getBeginCarryoverProfit() {
        return beginCarryoverProfit;
    }

    public void setBeginCarryoverProfit(BigDecimal beginCarryoverProfit) {
        this.beginCarryoverProfit = beginCarryoverProfit;
    }

    public BigDecimal getBeginOriginalRealProfit() {
        return beginOriginalRealProfit;
    }

    public void setBeginOriginalRealProfit(BigDecimal beginOriginalRealProfit) {
        this.beginOriginalRealProfit = beginOriginalRealProfit;
    }

    public BigDecimal getBeginCarryoverRealProfit() {
        return beginCarryoverRealProfit;
    }

    public void setBeginCarryoverRealProfit(BigDecimal beginCarryoverRealProfit) {
        this.beginCarryoverRealProfit = beginCarryoverRealProfit;
    }

    public BigDecimal getBeginOriginalIntProfit() {
        return beginOriginalIntProfit;
    }

    public void setBeginOriginalIntProfit(BigDecimal beginOriginalIntProfit) {
        this.beginOriginalIntProfit = beginOriginalIntProfit;
    }

    public BigDecimal getBeginCarryoverIntProfit() {
        return beginCarryoverIntProfit;
    }

    public void setBeginCarryoverIntProfit(BigDecimal beginCarryoverIntProfit) {
        this.beginCarryoverIntProfit = beginCarryoverIntProfit;
    }

    public BigDecimal getOriginalProfit() {
        return originalProfit;
    }

    public void setOriginalProfit(BigDecimal originalProfit) {
        this.originalProfit = originalProfit;
    }

    public BigDecimal getCarryoverProfit() {
        return carryoverProfit;
    }

    public void setCarryoverProfit(BigDecimal carryoverProfit) {
        this.carryoverProfit = carryoverProfit;
    }

    public BigDecimal getOriginalRealProfit() {
        return originalRealProfit;
    }

    public void setOriginalRealProfit(BigDecimal originalRealProfit) {
        this.originalRealProfit = originalRealProfit;
    }

    public BigDecimal getCarryoverRealProfit() {
        return carryoverRealProfit;
    }

    public void setCarryoverRealProfit(BigDecimal carryoverRealProfit) {
        this.carryoverRealProfit = carryoverRealProfit;
    }

    public BigDecimal getOriginalInterestProfit() {
        return originalInterestProfit;
    }

    public void setOriginalInterestProfit(BigDecimal originalInterestProfit) {
        this.originalInterestProfit = originalInterestProfit;
    }

    public BigDecimal getCarryoverInterestProfit() {
        return carryoverInterestProfit;
    }

    public void setCarryoverInterestProfit(BigDecimal carryoverInterestProfit) {
        this.carryoverInterestProfit = carryoverInterestProfit;
    }

    public BigDecimal getOnthewayDividend() {
        return onthewayDividend;
    }

    public void setOnthewayDividend(BigDecimal onthewayDividend) {
        this.onthewayDividend = onthewayDividend;
    }

    public BigDecimal getUncarryoverDividend() {
        return uncarryoverDividend;
    }

    public void setUncarryoverDividend(BigDecimal uncarryoverDividend) {
        this.uncarryoverDividend = uncarryoverDividend;
    }

    public BigDecimal getDividend() {
        return dividend;
    }

    public void setDividend(BigDecimal dividend) {
        this.dividend = dividend;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public BigDecimal getOptionOccupyDeposit() {
        return optionOccupyDeposit;
    }

    public void setOptionOccupyDeposit(BigDecimal optionOccupyDeposit) {
        this.optionOccupyDeposit = optionOccupyDeposit;
    }

    public BigDecimal getReleasableAmount() {
        return releasableAmount;
    }

    public void setReleasableAmount(BigDecimal releasableAmount) {
        this.releasableAmount = releasableAmount;
    }

    public BigDecimal getLockableAmount() {
        return lockableAmount;
    }

    public void setLockableAmount(BigDecimal lockableAmount) {
        this.lockableAmount = lockableAmount;
    }

    public BigDecimal getOriginalCostTrade() {
        return originalCostTrade;
    }

    public void setOriginalCostTrade(BigDecimal originalCostTrade) {
        this.originalCostTrade = originalCostTrade;
    }

    public BigDecimal getCarryoverCostTrade() {
        return carryoverCostTrade;
    }

    public void setCarryoverCostTrade(BigDecimal carryoverCostTrade) {
        this.carryoverCostTrade = carryoverCostTrade;
    }

    public BigDecimal getOriginalProfitTrade() {
        return originalProfitTrade;
    }

    public void setOriginalProfitTrade(BigDecimal originalProfitTrade) {
        this.originalProfitTrade = originalProfitTrade;
    }

    public BigDecimal getCarryoverProfitTrade() {
        return carryoverProfitTrade;
    }

    public void setCarryoverProfitTrade(BigDecimal carryoverProfitTrade) {
        this.carryoverProfitTrade = carryoverProfitTrade;
    }

    public BigDecimal getOriginalRealCostTrade() {
        return originalRealCostTrade;
    }

    public void setOriginalRealCostTrade(BigDecimal originalRealCostTrade) {
        this.originalRealCostTrade = originalRealCostTrade;
    }

    public BigDecimal getCarryoverRealCostTrade() {
        return carryoverRealCostTrade;
    }

    public void setCarryoverRealCostTrade(BigDecimal carryoverRealCostTrade) {
        this.carryoverRealCostTrade = carryoverRealCostTrade;
    }

    public BigDecimal getOriginalRealProfitTrade() {
        return originalRealProfitTrade;
    }

    public void setOriginalRealProfitTrade(BigDecimal originalRealProfitTrade) {
        this.originalRealProfitTrade = originalRealProfitTrade;
    }

    public BigDecimal getCarryoverRealProfitTrade() {
        return carryoverRealProfitTrade;
    }

    public void setCarryoverRealProfitTrade(BigDecimal carryoverRealProfitTrade) {
        this.carryoverRealProfitTrade = carryoverRealProfitTrade;
    }

    public BigDecimal getStrategyPlacingAmount() {
        return strategyPlacingAmount;
    }

    public void setStrategyPlacingAmount(BigDecimal strategyPlacingAmount) {
        this.strategyPlacingAmount = strategyPlacingAmount;
    }

    public BigDecimal getStraPlacFrzAmt() {
        return straPlacFrzAmt;
    }

    public void setStraPlacFrzAmt(BigDecimal straPlacFrzAmt) {
        this.straPlacFrzAmt = straPlacFrzAmt;
    }

}

