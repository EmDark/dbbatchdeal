package com.leon.dbbatchdeal.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (HisjyTrealdeal)实体类
 *
 * @author makejava
 * @since 2022-09-09 17:39:02
 */
public class HisjyTrealdeal implements Serializable {
    private static final long serialVersionUID = -30076336471177951L;

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

    private String stockName;

    private String fundName;

    private String assetName;

    private String combiName;

    private String tradeCurrencyNo;

    private String rivalTradercode;

    private String closeType;

    private String capitalAccountType;

    private String positionStr;

    private String contractNo;

    private String hgcontinueFlag;

    private Double hgDays;

    private Integer useDays;

    private Integer firstSettleDate;

    private Integer expireSettleDate;

    private Double expireSettleBalance;

    private Integer legalGhDate;

    private Integer tradeRivalNo;

    private Integer contactId;

    private Double bondInterest;

    private String optionCoveredFlag;

    private String boardType;

    private Integer msgSendStatus;

    private String mxddbh;

    private Integer cashSettleDate;

    private Integer stockSettleDate;

    private String isinCode;

    private String engName;

    private String reportDirection;

    private String foreignOrgFlag;

    private String bankSubAccount;

    private Integer bankSerialNo;

    private String bankName;

    private String qfiiSubAccountTag;

    private String validFlag;

    private Integer blockId;

    private String cashgroupProp;

    private String compactId;

    private Integer stockType;

    private Double midPrice;

    private String inReportCode;

    private String inStockName;

    private String nicked;

    private Integer szBondTradeMethod;

    private String operFlag;

    private String rivalTradeParty;

    private Integer entrustTableType;

    private String bonusType;

    private String openfundExceedType;

    private String rivalTradePartyType;

    private String rivalCompanycode;

    private String assetType;

    private String applyDescribe;

    private String fixedCompanyName;

    private String entrustLaunchType;


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

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getCombiName() {
        return combiName;
    }

    public void setCombiName(String combiName) {
        this.combiName = combiName;
    }

    public String getTradeCurrencyNo() {
        return tradeCurrencyNo;
    }

    public void setTradeCurrencyNo(String tradeCurrencyNo) {
        this.tradeCurrencyNo = tradeCurrencyNo;
    }

    public String getRivalTradercode() {
        return rivalTradercode;
    }

    public void setRivalTradercode(String rivalTradercode) {
        this.rivalTradercode = rivalTradercode;
    }

    public String getCloseType() {
        return closeType;
    }

    public void setCloseType(String closeType) {
        this.closeType = closeType;
    }

    public String getCapitalAccountType() {
        return capitalAccountType;
    }

    public void setCapitalAccountType(String capitalAccountType) {
        this.capitalAccountType = capitalAccountType;
    }

    public String getPositionStr() {
        return positionStr;
    }

    public void setPositionStr(String positionStr) {
        this.positionStr = positionStr;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getHgcontinueFlag() {
        return hgcontinueFlag;
    }

    public void setHgcontinueFlag(String hgcontinueFlag) {
        this.hgcontinueFlag = hgcontinueFlag;
    }

    public Double getHgDays() {
        return hgDays;
    }

    public void setHgDays(Double hgDays) {
        this.hgDays = hgDays;
    }

    public Integer getUseDays() {
        return useDays;
    }

    public void setUseDays(Integer useDays) {
        this.useDays = useDays;
    }

    public Integer getFirstSettleDate() {
        return firstSettleDate;
    }

    public void setFirstSettleDate(Integer firstSettleDate) {
        this.firstSettleDate = firstSettleDate;
    }

    public Integer getExpireSettleDate() {
        return expireSettleDate;
    }

    public void setExpireSettleDate(Integer expireSettleDate) {
        this.expireSettleDate = expireSettleDate;
    }

    public Double getExpireSettleBalance() {
        return expireSettleBalance;
    }

    public void setExpireSettleBalance(Double expireSettleBalance) {
        this.expireSettleBalance = expireSettleBalance;
    }

    public Integer getLegalGhDate() {
        return legalGhDate;
    }

    public void setLegalGhDate(Integer legalGhDate) {
        this.legalGhDate = legalGhDate;
    }

    public Integer getTradeRivalNo() {
        return tradeRivalNo;
    }

    public void setTradeRivalNo(Integer tradeRivalNo) {
        this.tradeRivalNo = tradeRivalNo;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Double getBondInterest() {
        return bondInterest;
    }

    public void setBondInterest(Double bondInterest) {
        this.bondInterest = bondInterest;
    }

    public String getOptionCoveredFlag() {
        return optionCoveredFlag;
    }

    public void setOptionCoveredFlag(String optionCoveredFlag) {
        this.optionCoveredFlag = optionCoveredFlag;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public Integer getMsgSendStatus() {
        return msgSendStatus;
    }

    public void setMsgSendStatus(Integer msgSendStatus) {
        this.msgSendStatus = msgSendStatus;
    }

    public String getMxddbh() {
        return mxddbh;
    }

    public void setMxddbh(String mxddbh) {
        this.mxddbh = mxddbh;
    }

    public Integer getCashSettleDate() {
        return cashSettleDate;
    }

    public void setCashSettleDate(Integer cashSettleDate) {
        this.cashSettleDate = cashSettleDate;
    }

    public Integer getStockSettleDate() {
        return stockSettleDate;
    }

    public void setStockSettleDate(Integer stockSettleDate) {
        this.stockSettleDate = stockSettleDate;
    }

    public String getIsinCode() {
        return isinCode;
    }

    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getReportDirection() {
        return reportDirection;
    }

    public void setReportDirection(String reportDirection) {
        this.reportDirection = reportDirection;
    }

    public String getForeignOrgFlag() {
        return foreignOrgFlag;
    }

    public void setForeignOrgFlag(String foreignOrgFlag) {
        this.foreignOrgFlag = foreignOrgFlag;
    }

    public String getBankSubAccount() {
        return bankSubAccount;
    }

    public void setBankSubAccount(String bankSubAccount) {
        this.bankSubAccount = bankSubAccount;
    }

    public Integer getBankSerialNo() {
        return bankSerialNo;
    }

    public void setBankSerialNo(Integer bankSerialNo) {
        this.bankSerialNo = bankSerialNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getQfiiSubAccountTag() {
        return qfiiSubAccountTag;
    }

    public void setQfiiSubAccountTag(String qfiiSubAccountTag) {
        this.qfiiSubAccountTag = qfiiSubAccountTag;
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

    public String getCashgroupProp() {
        return cashgroupProp;
    }

    public void setCashgroupProp(String cashgroupProp) {
        this.cashgroupProp = cashgroupProp;
    }

    public String getCompactId() {
        return compactId;
    }

    public void setCompactId(String compactId) {
        this.compactId = compactId;
    }

    public Integer getStockType() {
        return stockType;
    }

    public void setStockType(Integer stockType) {
        this.stockType = stockType;
    }

    public Double getMidPrice() {
        return midPrice;
    }

    public void setMidPrice(Double midPrice) {
        this.midPrice = midPrice;
    }

    public String getInReportCode() {
        return inReportCode;
    }

    public void setInReportCode(String inReportCode) {
        this.inReportCode = inReportCode;
    }

    public String getInStockName() {
        return inStockName;
    }

    public void setInStockName(String inStockName) {
        this.inStockName = inStockName;
    }

    public String getNicked() {
        return nicked;
    }

    public void setNicked(String nicked) {
        this.nicked = nicked;
    }

    public Integer getSzBondTradeMethod() {
        return szBondTradeMethod;
    }

    public void setSzBondTradeMethod(Integer szBondTradeMethod) {
        this.szBondTradeMethod = szBondTradeMethod;
    }

    public String getOperFlag() {
        return operFlag;
    }

    public void setOperFlag(String operFlag) {
        this.operFlag = operFlag;
    }

    public String getRivalTradeParty() {
        return rivalTradeParty;
    }

    public void setRivalTradeParty(String rivalTradeParty) {
        this.rivalTradeParty = rivalTradeParty;
    }

    public Integer getEntrustTableType() {
        return entrustTableType;
    }

    public void setEntrustTableType(Integer entrustTableType) {
        this.entrustTableType = entrustTableType;
    }

    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType;
    }

    public String getOpenfundExceedType() {
        return openfundExceedType;
    }

    public void setOpenfundExceedType(String openfundExceedType) {
        this.openfundExceedType = openfundExceedType;
    }

    public String getRivalTradePartyType() {
        return rivalTradePartyType;
    }

    public void setRivalTradePartyType(String rivalTradePartyType) {
        this.rivalTradePartyType = rivalTradePartyType;
    }

    public String getRivalCompanycode() {
        return rivalCompanycode;
    }

    public void setRivalCompanycode(String rivalCompanycode) {
        this.rivalCompanycode = rivalCompanycode;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getApplyDescribe() {
        return applyDescribe;
    }

    public void setApplyDescribe(String applyDescribe) {
        this.applyDescribe = applyDescribe;
    }

    public String getFixedCompanyName() {
        return fixedCompanyName;
    }

    public void setFixedCompanyName(String fixedCompanyName) {
        this.fixedCompanyName = fixedCompanyName;
    }

    public String getEntrustLaunchType() {
        return entrustLaunchType;
    }

    public void setEntrustLaunchType(String entrustLaunchType) {
        this.entrustLaunchType = entrustLaunchType;
    }

}

