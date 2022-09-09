package com.leon.dbbatchdeal.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (JyTrealdeal)实体类
 *
 * @author makejava
 * @since 2022-09-09 17:37:30
 */
public class JyTrealdeal implements Serializable {
    private static final long serialVersionUID = 514210177948085588L;

    private Integer businessDate;

    private Integer companyId;

    private Integer realdealSerialNo;

    private Integer entrustSerialNo;

    private Integer batchSerialNo;

    private Integer reportSerialNo;

    private Integer fundId;

    private Integer assetId;

    private Integer combiId;

    private Integer marketNo;

    private String reportCode;

    private Integer interCode;

    private String stockholderId;

    private String tradeSeat;

    private String investType;

    private Integer entrustDirection;

    private Double dealAmount;

    private Double dealPrice;

    private Double dealBalance;

    private Integer dealTime;

    private Integer operatorNo;

    private Date timeStamp;

    private String dealNo;

    private Double totalFee;

    private Double feeJy;

    private Double feeYh;

    private Double feeGh;

    private Double feeCommission;

    private Double feeJs;

    private Double feeZg;

    private Double feeQt;

    private Double feeSx;

    private Double feeRisk;

    private Double feeJsfw;

    private Double feeJg;

    private Integer tradePlatformId;

    private String schemeCode;

    private String capitalAccountNo;

    private Integer tradeInterfaceType;

    private Integer insId;

    private Integer indexDailyModify;

    private Integer externalOrdid;

    private String thirdRemark;

    private Integer msgSendStatus;

    private String validFlag;

    private Integer blockId;


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

    public Integer getRealdealSerialNo() {
        return realdealSerialNo;
    }

    public void setRealdealSerialNo(Integer realdealSerialNo) {
        this.realdealSerialNo = realdealSerialNo;
    }

    public Integer getEntrustSerialNo() {
        return entrustSerialNo;
    }

    public void setEntrustSerialNo(Integer entrustSerialNo) {
        this.entrustSerialNo = entrustSerialNo;
    }

    public Integer getBatchSerialNo() {
        return batchSerialNo;
    }

    public void setBatchSerialNo(Integer batchSerialNo) {
        this.batchSerialNo = batchSerialNo;
    }

    public Integer getReportSerialNo() {
        return reportSerialNo;
    }

    public void setReportSerialNo(Integer reportSerialNo) {
        this.reportSerialNo = reportSerialNo;
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

    public Integer getMarketNo() {
        return marketNo;
    }

    public void setMarketNo(Integer marketNo) {
        this.marketNo = marketNo;
    }

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }

    public Integer getInterCode() {
        return interCode;
    }

    public void setInterCode(Integer interCode) {
        this.interCode = interCode;
    }

    public String getStockholderId() {
        return stockholderId;
    }

    public void setStockholderId(String stockholderId) {
        this.stockholderId = stockholderId;
    }

    public String getTradeSeat() {
        return tradeSeat;
    }

    public void setTradeSeat(String tradeSeat) {
        this.tradeSeat = tradeSeat;
    }

    public String getInvestType() {
        return investType;
    }

    public void setInvestType(String investType) {
        this.investType = investType;
    }

    public Integer getEntrustDirection() {
        return entrustDirection;
    }

    public void setEntrustDirection(Integer entrustDirection) {
        this.entrustDirection = entrustDirection;
    }

    public Double getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(Double dealAmount) {
        this.dealAmount = dealAmount;
    }

    public Double getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(Double dealPrice) {
        this.dealPrice = dealPrice;
    }

    public Double getDealBalance() {
        return dealBalance;
    }

    public void setDealBalance(Double dealBalance) {
        this.dealBalance = dealBalance;
    }

    public Integer getDealTime() {
        return dealTime;
    }

    public void setDealTime(Integer dealTime) {
        this.dealTime = dealTime;
    }

    public Integer getOperatorNo() {
        return operatorNo;
    }

    public void setOperatorNo(Integer operatorNo) {
        this.operatorNo = operatorNo;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDealNo() {
        return dealNo;
    }

    public void setDealNo(String dealNo) {
        this.dealNo = dealNo;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public Double getFeeJy() {
        return feeJy;
    }

    public void setFeeJy(Double feeJy) {
        this.feeJy = feeJy;
    }

    public Double getFeeYh() {
        return feeYh;
    }

    public void setFeeYh(Double feeYh) {
        this.feeYh = feeYh;
    }

    public Double getFeeGh() {
        return feeGh;
    }

    public void setFeeGh(Double feeGh) {
        this.feeGh = feeGh;
    }

    public Double getFeeCommission() {
        return feeCommission;
    }

    public void setFeeCommission(Double feeCommission) {
        this.feeCommission = feeCommission;
    }

    public Double getFeeJs() {
        return feeJs;
    }

    public void setFeeJs(Double feeJs) {
        this.feeJs = feeJs;
    }

    public Double getFeeZg() {
        return feeZg;
    }

    public void setFeeZg(Double feeZg) {
        this.feeZg = feeZg;
    }

    public Double getFeeQt() {
        return feeQt;
    }

    public void setFeeQt(Double feeQt) {
        this.feeQt = feeQt;
    }

    public Double getFeeSx() {
        return feeSx;
    }

    public void setFeeSx(Double feeSx) {
        this.feeSx = feeSx;
    }

    public Double getFeeRisk() {
        return feeRisk;
    }

    public void setFeeRisk(Double feeRisk) {
        this.feeRisk = feeRisk;
    }

    public Double getFeeJsfw() {
        return feeJsfw;
    }

    public void setFeeJsfw(Double feeJsfw) {
        this.feeJsfw = feeJsfw;
    }

    public Double getFeeJg() {
        return feeJg;
    }

    public void setFeeJg(Double feeJg) {
        this.feeJg = feeJg;
    }

    public Integer getTradePlatformId() {
        return tradePlatformId;
    }

    public void setTradePlatformId(Integer tradePlatformId) {
        this.tradePlatformId = tradePlatformId;
    }

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    public String getCapitalAccountNo() {
        return capitalAccountNo;
    }

    public void setCapitalAccountNo(String capitalAccountNo) {
        this.capitalAccountNo = capitalAccountNo;
    }

    public Integer getTradeInterfaceType() {
        return tradeInterfaceType;
    }

    public void setTradeInterfaceType(Integer tradeInterfaceType) {
        this.tradeInterfaceType = tradeInterfaceType;
    }

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    public Integer getIndexDailyModify() {
        return indexDailyModify;
    }

    public void setIndexDailyModify(Integer indexDailyModify) {
        this.indexDailyModify = indexDailyModify;
    }

    public Integer getExternalOrdid() {
        return externalOrdid;
    }

    public void setExternalOrdid(Integer externalOrdid) {
        this.externalOrdid = externalOrdid;
    }

    public String getThirdRemark() {
        return thirdRemark;
    }

    public void setThirdRemark(String thirdRemark) {
        this.thirdRemark = thirdRemark;
    }

    public Integer getMsgSendStatus() {
        return msgSendStatus;
    }

    public void setMsgSendStatus(Integer msgSendStatus) {
        this.msgSendStatus = msgSendStatus;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

}

