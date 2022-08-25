package com.leon.dbbatchdeal.entity;

import java.io.Serializable;

/**
 * (HisjyTentrusts)实体类
 *
 * @author makejava
 * @since 2022-08-25 10:50:37
 */
public class HisjyTentrusts implements Serializable {
    private static final long serialVersionUID = 245598400651577071L;

    private Integer businessDate;

    private Integer entrustSerialNo;

    private Integer batchSerialNo;

    private Integer reportSerialNo;

    private Integer companyId;

    private Integer fundId;

    private String confirmCodeno;

    private Integer assetId;

    private Integer combiId;

    private Integer marketNo;

    private String reportCode;

    private Integer interCode;

    private String bindSeat;

    private String stockholderId;

    private String tradeSeat;

    private String investType;

    private Integer entrustDirection;

    private String reportDirection;

    private String entrustPriceType;

    private Double entrustPrice;

    private Double entrustAmount;

    private Double entrustBalance;

    private Double cancelAmount;

    private Double businAmount;

    private Double businBalance;

    private Double totalDealAmount;

    private Double totalDealBalance;

    private Double prebuyFrozenBalance;

    private String entrustStatus;

    private String entrustLaunchType;

    private Integer businTimes;

    private Integer entrustTime;

    private Integer lastDealTime;

    private Integer operatorNo;

    private String revokeCause;

    private String reportSerialNoBranch;

    private Integer recNum;

    private String tranReff;

    private Integer tradePlatformId;

    private String cancelFlag;

    private Integer cancelSerialNo;

    private String appendEntrustXhFlag;

    private String mac;

    private String ipAddress;

    private String volserialNo;

    private String wsCpu;

    private String schemeCode;

    private String schemeInsCode;

    private String algoOrdid;

    private Integer insId;

    private Integer indexDailyModify;

    private Integer insStockId;

    private String capitalAccountNo;

    private String branchCode;

    private String sysBranchCode;

    private Integer tradeInterfaceType;

    private Integer arbitrageSerialNo;

    private String engagedNo;

    private String rivalSeat;

    private String rivalStockholderId;

    private Integer sysDate;

    private Integer sysTime;

    private Integer externalOrdid;

    private String thirdRemark;

    private String voteSenateNo;

    private String stockName;

    private String tradeCurrencyNo;

    private String fundName;

    private String assetName;

    private String combiName;

    private String capitalAccountType;

    private String positionStr;

    private String traceFlag;

    private String closeDirection;

    private String optionCoveredFlag;

    private String linkman;

    private String phoneNo;

    private Integer clearSpeed;

    private String validFlag;

    private String rivalTradercode;

    private Integer hgDealDate;

    private String quoterRequestNo;

    private String originalDealNo;

    private String contractNo;

    private Double hgDays;

    private String reportFlag;

    private Integer legalGhDate;

    private Integer actualGhDate;

    private Double hgInterest;

    private String hgcontinueFlag;

    private String thirdFlag;

    private Integer firstSettleDate;

    private Integer useDays;

    private String boardType;

    private String terminalInfoSlitExt;

    private Double orderId;

    private String dfdStatus;

    private String autoDropFlag;

    private String reportStatus;

    private String bulkunderweightFlag;

    private String cashgroupProp;

    private Double minVolume;

    private String compactId;

    private Integer stockType;

    private String restrictedFlag;

    private String inReportCode;

    private String inStockName;


    public Integer getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Integer businessDate) {
        this.businessDate = businessDate;
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

    public String getConfirmCodeno() {
        return confirmCodeno;
    }

    public void setConfirmCodeno(String confirmCodeno) {
        this.confirmCodeno = confirmCodeno;
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

    public String getReportDirection() {
        return reportDirection;
    }

    public void setReportDirection(String reportDirection) {
        this.reportDirection = reportDirection;
    }

    public String getEntrustPriceType() {
        return entrustPriceType;
    }

    public void setEntrustPriceType(String entrustPriceType) {
        this.entrustPriceType = entrustPriceType;
    }

    public Double getEntrustPrice() {
        return entrustPrice;
    }

    public void setEntrustPrice(Double entrustPrice) {
        this.entrustPrice = entrustPrice;
    }

    public Double getEntrustAmount() {
        return entrustAmount;
    }

    public void setEntrustAmount(Double entrustAmount) {
        this.entrustAmount = entrustAmount;
    }

    public Double getEntrustBalance() {
        return entrustBalance;
    }

    public void setEntrustBalance(Double entrustBalance) {
        this.entrustBalance = entrustBalance;
    }

    public Double getCancelAmount() {
        return cancelAmount;
    }

    public void setCancelAmount(Double cancelAmount) {
        this.cancelAmount = cancelAmount;
    }

    public Double getBusinAmount() {
        return businAmount;
    }

    public void setBusinAmount(Double businAmount) {
        this.businAmount = businAmount;
    }

    public Double getBusinBalance() {
        return businBalance;
    }

    public void setBusinBalance(Double businBalance) {
        this.businBalance = businBalance;
    }

    public Double getTotalDealAmount() {
        return totalDealAmount;
    }

    public void setTotalDealAmount(Double totalDealAmount) {
        this.totalDealAmount = totalDealAmount;
    }

    public Double getTotalDealBalance() {
        return totalDealBalance;
    }

    public void setTotalDealBalance(Double totalDealBalance) {
        this.totalDealBalance = totalDealBalance;
    }

    public Double getPrebuyFrozenBalance() {
        return prebuyFrozenBalance;
    }

    public void setPrebuyFrozenBalance(Double prebuyFrozenBalance) {
        this.prebuyFrozenBalance = prebuyFrozenBalance;
    }

    public String getEntrustStatus() {
        return entrustStatus;
    }

    public void setEntrustStatus(String entrustStatus) {
        this.entrustStatus = entrustStatus;
    }

    public String getEntrustLaunchType() {
        return entrustLaunchType;
    }

    public void setEntrustLaunchType(String entrustLaunchType) {
        this.entrustLaunchType = entrustLaunchType;
    }

    public Integer getBusinTimes() {
        return businTimes;
    }

    public void setBusinTimes(Integer businTimes) {
        this.businTimes = businTimes;
    }

    public Integer getEntrustTime() {
        return entrustTime;
    }

    public void setEntrustTime(Integer entrustTime) {
        this.entrustTime = entrustTime;
    }

    public Integer getLastDealTime() {
        return lastDealTime;
    }

    public void setLastDealTime(Integer lastDealTime) {
        this.lastDealTime = lastDealTime;
    }

    public Integer getOperatorNo() {
        return operatorNo;
    }

    public void setOperatorNo(Integer operatorNo) {
        this.operatorNo = operatorNo;
    }

    public String getRevokeCause() {
        return revokeCause;
    }

    public void setRevokeCause(String revokeCause) {
        this.revokeCause = revokeCause;
    }

    public String getReportSerialNoBranch() {
        return reportSerialNoBranch;
    }

    public void setReportSerialNoBranch(String reportSerialNoBranch) {
        this.reportSerialNoBranch = reportSerialNoBranch;
    }

    public Integer getRecNum() {
        return recNum;
    }

    public void setRecNum(Integer recNum) {
        this.recNum = recNum;
    }

    public String getTranReff() {
        return tranReff;
    }

    public void setTranReff(String tranReff) {
        this.tranReff = tranReff;
    }

    public Integer getTradePlatformId() {
        return tradePlatformId;
    }

    public void setTradePlatformId(Integer tradePlatformId) {
        this.tradePlatformId = tradePlatformId;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public Integer getCancelSerialNo() {
        return cancelSerialNo;
    }

    public void setCancelSerialNo(Integer cancelSerialNo) {
        this.cancelSerialNo = cancelSerialNo;
    }

    public String getAppendEntrustXhFlag() {
        return appendEntrustXhFlag;
    }

    public void setAppendEntrustXhFlag(String appendEntrustXhFlag) {
        this.appendEntrustXhFlag = appendEntrustXhFlag;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getVolserialNo() {
        return volserialNo;
    }

    public void setVolserialNo(String volserialNo) {
        this.volserialNo = volserialNo;
    }

    public String getWsCpu() {
        return wsCpu;
    }

    public void setWsCpu(String wsCpu) {
        this.wsCpu = wsCpu;
    }

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    public String getSchemeInsCode() {
        return schemeInsCode;
    }

    public void setSchemeInsCode(String schemeInsCode) {
        this.schemeInsCode = schemeInsCode;
    }

    public String getAlgoOrdid() {
        return algoOrdid;
    }

    public void setAlgoOrdid(String algoOrdid) {
        this.algoOrdid = algoOrdid;
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

    public Integer getInsStockId() {
        return insStockId;
    }

    public void setInsStockId(Integer insStockId) {
        this.insStockId = insStockId;
    }

    public String getCapitalAccountNo() {
        return capitalAccountNo;
    }

    public void setCapitalAccountNo(String capitalAccountNo) {
        this.capitalAccountNo = capitalAccountNo;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getSysBranchCode() {
        return sysBranchCode;
    }

    public void setSysBranchCode(String sysBranchCode) {
        this.sysBranchCode = sysBranchCode;
    }

    public Integer getTradeInterfaceType() {
        return tradeInterfaceType;
    }

    public void setTradeInterfaceType(Integer tradeInterfaceType) {
        this.tradeInterfaceType = tradeInterfaceType;
    }

    public Integer getArbitrageSerialNo() {
        return arbitrageSerialNo;
    }

    public void setArbitrageSerialNo(Integer arbitrageSerialNo) {
        this.arbitrageSerialNo = arbitrageSerialNo;
    }

    public String getEngagedNo() {
        return engagedNo;
    }

    public void setEngagedNo(String engagedNo) {
        this.engagedNo = engagedNo;
    }

    public String getRivalSeat() {
        return rivalSeat;
    }

    public void setRivalSeat(String rivalSeat) {
        this.rivalSeat = rivalSeat;
    }

    public String getRivalStockholderId() {
        return rivalStockholderId;
    }

    public void setRivalStockholderId(String rivalStockholderId) {
        this.rivalStockholderId = rivalStockholderId;
    }

    public Integer getSysDate() {
        return sysDate;
    }

    public void setSysDate(Integer sysDate) {
        this.sysDate = sysDate;
    }

    public Integer getSysTime() {
        return sysTime;
    }

    public void setSysTime(Integer sysTime) {
        this.sysTime = sysTime;
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

    public String getVoteSenateNo() {
        return voteSenateNo;
    }

    public void setVoteSenateNo(String voteSenateNo) {
        this.voteSenateNo = voteSenateNo;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getTradeCurrencyNo() {
        return tradeCurrencyNo;
    }

    public void setTradeCurrencyNo(String tradeCurrencyNo) {
        this.tradeCurrencyNo = tradeCurrencyNo;
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

    public String getTraceFlag() {
        return traceFlag;
    }

    public void setTraceFlag(String traceFlag) {
        this.traceFlag = traceFlag;
    }

    public String getCloseDirection() {
        return closeDirection;
    }

    public void setCloseDirection(String closeDirection) {
        this.closeDirection = closeDirection;
    }

    public String getOptionCoveredFlag() {
        return optionCoveredFlag;
    }

    public void setOptionCoveredFlag(String optionCoveredFlag) {
        this.optionCoveredFlag = optionCoveredFlag;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getClearSpeed() {
        return clearSpeed;
    }

    public void setClearSpeed(Integer clearSpeed) {
        this.clearSpeed = clearSpeed;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }

    public String getRivalTradercode() {
        return rivalTradercode;
    }

    public void setRivalTradercode(String rivalTradercode) {
        this.rivalTradercode = rivalTradercode;
    }

    public Integer getHgDealDate() {
        return hgDealDate;
    }

    public void setHgDealDate(Integer hgDealDate) {
        this.hgDealDate = hgDealDate;
    }

    public String getQuoterRequestNo() {
        return quoterRequestNo;
    }

    public void setQuoterRequestNo(String quoterRequestNo) {
        this.quoterRequestNo = quoterRequestNo;
    }

    public String getOriginalDealNo() {
        return originalDealNo;
    }

    public void setOriginalDealNo(String originalDealNo) {
        this.originalDealNo = originalDealNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Double getHgDays() {
        return hgDays;
    }

    public void setHgDays(Double hgDays) {
        this.hgDays = hgDays;
    }

    public String getReportFlag() {
        return reportFlag;
    }

    public void setReportFlag(String reportFlag) {
        this.reportFlag = reportFlag;
    }

    public Integer getLegalGhDate() {
        return legalGhDate;
    }

    public void setLegalGhDate(Integer legalGhDate) {
        this.legalGhDate = legalGhDate;
    }

    public Integer getActualGhDate() {
        return actualGhDate;
    }

    public void setActualGhDate(Integer actualGhDate) {
        this.actualGhDate = actualGhDate;
    }

    public Double getHgInterest() {
        return hgInterest;
    }

    public void setHgInterest(Double hgInterest) {
        this.hgInterest = hgInterest;
    }

    public String getHgcontinueFlag() {
        return hgcontinueFlag;
    }

    public void setHgcontinueFlag(String hgcontinueFlag) {
        this.hgcontinueFlag = hgcontinueFlag;
    }

    public String getThirdFlag() {
        return thirdFlag;
    }

    public void setThirdFlag(String thirdFlag) {
        this.thirdFlag = thirdFlag;
    }

    public Integer getFirstSettleDate() {
        return firstSettleDate;
    }

    public void setFirstSettleDate(Integer firstSettleDate) {
        this.firstSettleDate = firstSettleDate;
    }

    public Integer getUseDays() {
        return useDays;
    }

    public void setUseDays(Integer useDays) {
        this.useDays = useDays;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public String getTerminalInfoSlitExt() {
        return terminalInfoSlitExt;
    }

    public void setTerminalInfoSlitExt(String terminalInfoSlitExt) {
        this.terminalInfoSlitExt = terminalInfoSlitExt;
    }

    public Double getOrderId() {
        return orderId;
    }

    public void setOrderId(Double orderId) {
        this.orderId = orderId;
    }

    public String getDfdStatus() {
        return dfdStatus;
    }

    public void setDfdStatus(String dfdStatus) {
        this.dfdStatus = dfdStatus;
    }

    public String getAutoDropFlag() {
        return autoDropFlag;
    }

    public void setAutoDropFlag(String autoDropFlag) {
        this.autoDropFlag = autoDropFlag;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getBulkunderweightFlag() {
        return bulkunderweightFlag;
    }

    public void setBulkunderweightFlag(String bulkunderweightFlag) {
        this.bulkunderweightFlag = bulkunderweightFlag;
    }

    public String getCashgroupProp() {
        return cashgroupProp;
    }

    public void setCashgroupProp(String cashgroupProp) {
        this.cashgroupProp = cashgroupProp;
    }

    public Double getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(Double minVolume) {
        this.minVolume = minVolume;
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

    public String getRestrictedFlag() {
        return restrictedFlag;
    }

    public void setRestrictedFlag(String restrictedFlag) {
        this.restrictedFlag = restrictedFlag;
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

}

