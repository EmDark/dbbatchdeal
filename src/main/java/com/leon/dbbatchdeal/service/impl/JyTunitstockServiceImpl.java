package com.leon.dbbatchdeal.service.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.leon.dbbatchdeal.dao.JyTunitstockDao;
import com.leon.dbbatchdeal.dto.JyTunitstock;
import com.leon.dbbatchdeal.dto.ThreadInsertDataDto;
import com.leon.dbbatchdeal.service.JyTunitstockService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * (JyTunitstock)表服务实现类
 *
 * @author makejava
 * @date 2022-11-07 20:21:39
 */
@Repository
public class JyTunitstockServiceImpl implements JyTunitstockService {

    @Resource
    private JyTunitstockDao jyTunitstockDao;

    /**
     * 通过ID查询单条数据
     *
     * @param combiId 主键
     * @return 实例对象
     */
    @Override
    public JyTunitstock queryByPk(Integer combiId) {
        return this.jyTunitstockDao.queryByPk(combiId);
    }

    /**
     * 分页查询
     *
     * @param jyTunitstock 筛选条件
     * @param offset       位移
     * @param pageSize     页面大小
     * @return 查询结果
     */
    @Override
    public List<JyTunitstock> queryByPage(JyTunitstock jyTunitstock, Integer offset, Integer pageSize) {
        return this.jyTunitstockDao.queryAllByLimit(jyTunitstock, offset, pageSize);
    }

    /**
     * 新增数据
     *
     * @param jyTunitstock 实例对象
     * @return 实例对象
     */
    @Override
    public JyTunitstock insert(JyTunitstock jyTunitstock) {
        this.jyTunitstockDao.insert(jyTunitstock);
        return jyTunitstock;
    }

    /**
     * 修改数据
     *
     * @param jyTunitstock 实例对象
     * @return 实例对象
     */
    @Override
    public JyTunitstock update(JyTunitstock jyTunitstock) {
        this.jyTunitstockDao.update(jyTunitstock);
        return this.queryByPk(jyTunitstock.getCombiId());
    }

    /**
     * 通过主键删除数据
     *
     * @param combiId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteByPk(Integer combiId) {
        return this.jyTunitstockDao.deleteByPk(combiId) > 0;
    }

    public static final Logger LOGGER = LoggerFactory.getLogger(JyTunitstockServiceImpl.class);

    @Resource(name = "SpExecutor")
    private ThreadPoolExecutor executorService;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    @Override
    public void insertDatas(Integer type, Integer threadSize, Integer batchNum, Integer num) {
        String modelEntityJson = "{\n"
            + "    \"businessDate\": 20210303,\n"
            + "    \"companyId\": 301795,\n"
            + "    \"fundId\": 1133,\n"
            + "    \"assetId\": 2225,\n"
            + "    \"combiId\": 2647,\n"
            + "    \"investType\": \"1\",\n"
            + "    \"positionType\": \"1\",\n"
            + "    \"marketNo\": 2,\n"
            + "    \"bindSeat\": \"V_88\",\n"
            + "    \"stockholderId\": \"0720002465\",\n"
            + "    \"interCode\": 131990002,\n"
            + "    \"beginAmount\": 0.0000,\n"
            + "    \"currentAmount\": -10000.0000,\n"
            + "    \"enableAmount\": 0.0000,\n"
            + "    \"uncirculatedAmount\": 0.0000,\n"
            + "    \"dividendRightAmount\": 0.0000,\n"
            + "    \"yjuncirculatedAmount\": 0.0000,\n"
            + "    \"totalShareout\": 0.0000,\n"
            + "    \"prebuyAmount\": 0.0000,\n"
            + "    \"presaleAmount\": 0.0000,\n"
            + "    \"buyAmount\": 0.0000,\n"
            + "    \"saleAmount\": 0.0000,\n"
            + "    \"buyBalance\": 0.00,\n"
            + "    \"saleBalance\": 0.00,\n"
            + "    \"buyFee\": 0.00,\n"
            + "    \"saleFee\": 0.00,\n"
            + "    \"realBuyFee\": 0.00,\n"
            + "    \"realSaleFee\": 0.00,\n"
            + "    \"beginOriginalCost\": 0.00,\n"
            + "    \"beginCarryoverCost\": 0.00,\n"
            + "    \"beginOriginalInterestCost\": 0.00,\n"
            + "    \"beginCarryoverInterestCost\": 0.00,\n"
            + "    \"beginCarryoverRealCost\": 0.00,\n"
            + "    \"beginOriginalRealCost\": 0.00,\n"
            + "    \"originalCost\": 0.00,\n"
            + "    \"carryoverCost\": 0.00,\n"
            + "    \"originalInterestCost\": 0.00,\n"
            + "    \"carryoverInterestCost\": 0.00,\n"
            + "    \"carryoverRealCost\": 0.00,\n"
            + "    \"originalRealCost\": 0.00,\n"
            + "    \"beginOriginalProfit\": 0.00,\n"
            + "    \"beginCarryoverProfit\": 0.00,\n"
            + "    \"beginOriginalRealProfit\": 0.00,\n"
            + "    \"beginCarryoverRealProfit\": 0.00,\n"
            + "    \"beginOriginalIntProfit\": 0.00,\n"
            + "    \"beginCarryoverIntProfit\": 0.00,\n"
            + "    \"originalProfit\": 0.00,\n"
            + "    \"carryoverProfit\": 0.00,\n"
            + "    \"originalRealProfit\": 0.00,\n"
            + "    \"carryoverRealProfit\": 0.00,\n"
            + "    \"originalInterestProfit\": 0.00,\n"
            + "    \"carryoverInterestProfit\": 0.00,\n"
            + "    \"onthewayDividend\": 0.00,\n"
            + "    \"uncarryoverDividend\": 0.00,\n"
            + "    \"dividend\": 0.00,\n"
            + "    \"assetType\": \" \",\n"
            + "    \"optionOccupyDeposit\": 0.00,\n"
            + "    \"releasableAmount\": 0.0000,\n"
            + "    \"lockableAmount\": 0.0000,\n"
            + "    \"originalCostTrade\": 0.00,\n"
            + "    \"carryoverCostTrade\": 0.00,\n"
            + "    \"originalProfitTrade\": 0.00,\n"
            + "    \"carryoverProfitTrade\": 0.00,\n"
            + "    \"originalRealCostTrade\": 0.00,\n"
            + "    \"carryoverRealCostTrade\": 0.00,\n"
            + "    \"originalRealProfitTrade\": 0.00,\n"
            + "    \"carryoverRealProfitTrade\": 0.00,\n"
            + "    \"strategyPlacingAmount\": 0.0000,\n"
            + "    \"straPlacFrzAmt\": 0.0000\n"
            + "  }";

        Integer max = jyTunitstockDao.getCombiId();
        List<JyTunitstock> datas = new ArrayList<>();

        Integer combi_id = max + 1;
        Integer dateInt = 20220315;
        Integer company_id = 100008;
        Integer fund_id = 1500;
        Integer asset_id = 3400;
        List<ThreadInsertDataDto> list = Lists.newLinkedList();

        for (int i = 0; i < num; i++) {
            JyTunitstock jyTunitstock = JSON.parseObject(modelEntityJson, JyTunitstock.class);
            jyTunitstock.setAssetId(asset_id);
            jyTunitstock.setCombiId(combi_id);
            jyTunitstock.setFundId(fund_id);
            jyTunitstock.setCompanyId(company_id);
            jyTunitstock.setBusinessDate(dateInt);
//            LOGGER.info("combi:{} invsert:{} position:{} bind_seat:{} stockholder:{} inter_code:{}",jyTunitstock.getCombiId(),jyTunitstock.getInvestType(),jyTunitstock.getPositionType(),jyTunitstock.getBindSeat(),jyTunitstock.getStockholderId(),jyTunitstock.getInterCode());
            datas.add(jyTunitstock);
            combi_id += 1;
            if (i % 1000 == 0) {
                fund_id += 1;
                asset_id += 1;
            }
            if (i % 10000 == 0) {
                LocalDate localDateTime = LocalDate.parse(dateInt.toString(), dateTimeFormatter);
                localDateTime = localDateTime.minusDays(1L);
                dateInt = Integer.valueOf(localDateTime.format(dateTimeFormatter));
                company_id += 1;
            }
            if (datas.size() >= batchNum) {
                //list.add(new ThreadInsertDataDto(hisjyTentrustsDao, datas));
                executorService.submit(new ThreadInsertDataDto(jyTunitstockDao, datas));
                LOGGER.info("submit");
                datas = new ArrayList<>();
            }
        }
        if (datas.size() > 0) {
            //list.add(new ThreadInsertDataDto(jyTentrustsDao, datas));
            executorService.submit(new ThreadInsertDataDto(jyTunitstockDao, datas));
            LOGGER.info("submit last size:{}", datas.size());
        }

        LOGGER.info("task done :{} ", executorService.getCompletedTaskCount());
        ;
    }
}
