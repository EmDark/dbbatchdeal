package com.leon.dbbatchdeal.service.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.leon.dbbatchdeal.dto.ThreadInsertDataDto;
import com.leon.dbbatchdeal.entity.HisjyTrealdeal;
import com.leon.dbbatchdeal.dao.HisjyTrealdealDao;
import com.leon.dbbatchdeal.entity.JyTentrusts;
import com.leon.dbbatchdeal.entity.JyTrealdeal;
import com.leon.dbbatchdeal.service.HisjyTrealdealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * (HisjyTrealdeal)表服务实现类
 *
 * @author makejava
 * @since 2022-09-09 17:39:16
 */
@Service("hisjyTrealdealService")
@Slf4j
public class HisjyTrealdealServiceImpl implements HisjyTrealdealService {
    @Resource
    private HisjyTrealdealDao hisjyTrealdealDao;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    @Resource(name = "SpExecutor")
    private ThreadPoolExecutor executorService;
    @Override
    public void insertDatas(Integer threadSize, Integer batchNum, Integer num) {
        String modelEntityJson = "{\n" +
                "    \"businessDate\": 20120228,\n" +
                "    \"companyId\": 301001,\n" +
                "    \"realdealSerialNo\": 118,\n" +
                "    \"entrustSerialNo\": 4,\n" +
                "    \"batchSerialNo\": 3,\n" +
                "    \"reportSerialNo\": 1,\n" +
                "    \"fundId\": 124,\n" +
                "    \"assetId\": 218,\n" +
                "    \"combiId\": 472,\n" +
                "    \"marketNo\": 1,\n" +
                "    \"reportCode\": \"600570\",\n" +
                "    \"interCode\": 600570001,\n" +
                "    \"stockholderId\": \"gyxh199101\",\n" +
                "    \"tradeSeat\": \"V_9\",\n" +
                "    \"investType\": \"1\",\n" +
                "    \"entrustDirection\": 1,\n" +
                "    \"dealAmount\": 38900,\n" +
                "    \"dealPrice\": 77.5125,\n" +
                "    \"dealBalance\": 3015236.25,\n" +
                "    \"dealTime\": 0,\n" +
                "    \"operatorNo\": 113,\n" +
                "    \"timeStamp\": 600570001,\n" +
                "    \"dealNo\": \"XTCJDR_20120228_20120228_60000028\",\n" +
                "    \"totalFee\": 2110.67,\n" +
                "    \"feeJy\": 0,\n" +
                "    \"feeYh\": 0,\n" +
                "    \"feeGh\": 603.05,\n" +
                "    \"feeCommission\": 1507.62,\n" +
                "    \"feeJs\": 0,\n" +
                "    \"feeZg\": 0,\n" +
                "    \"feeQt\": 0,\n" +
                "    \"feeSx\": 0,\n" +
                "    \"feeRisk\": 0,\n" +
                "    \"feeJsfw\": 0,\n" +
                "    \"feeJg\": 0,\n" +
                "    \"tradePlatformId\": 1,\n" +
                "    \"schemeCode\": \" \",\n" +
                "    \"capitalAccountNo\": \"gyxh1001\",\n" +
                "    \"tradeInterfaceType\": 51,\n" +
                "    \"insId\": 0,\n" +
                "    \"indexDailyModify\": 0,\n" +
                "    \"externalOrdid\": 0,\n" +
                "    \"thirdRemark\": \" \",\n" +
                "    \"stockName\": \"恒生电子\",\n" +
                "    \"fundName\": \"高毅1号（同单元多资金账号）\",\n" +
                "    \"assetName\": \"高毅1号（同单元多资金账号）\",\n" +
                "    \"combiName\": \"0001组合\",\n" +
                "    \"tradeCurrencyNo\": \"CNY\",\n" +
                "    \"rivalTradercode\": \"\",\n" +
                "    \"closeType\": \"\",\n" +
                "    \"capitalAccountType\": \"1\",\n" +
                "    \"positionStr\": \"201202280001240000000118\",\n" +
                "    \"contractNo\": \"\",\n" +
                "    \"hgcontinueFlag\": \"\",\n" +
                "    \"hgDays\": 0,\n" +
                "    \"useDays\": 0,\n" +
                "    \"firstSettleDate\": 0,\n" +
                "    \"expireSettleDate\": 0,\n" +
                "    \"expireSettleBalance\": 0,\n" +
                "    \"legalGhDate\": 0,\n" +
                "    \"tradeRivalNo\": 0,\n" +
                "    \"contactId\": 0,\n" +
                "    \"bondInterest\": 0,\n" +
                "    \"optionCoveredFlag\": \"\",\n" +
                "    \"boardType\": \"\",\n" +
                "    \"msgSendStatus\": 0,\n" +
                "    \"mxddbh\": \"0\",\n" +
                "    \"cashSettleDate\": 20120229,\n" +
                "    \"stockSettleDate\": 20120228,\n" +
                "    \"isinCode\": \"CNE000001GD5\",\n" +
                "    \"engName\": \"Hundsun Technologies Inc.\",\n" +
                "    \"reportDirection\": \"B\",\n" +
                "    \"foreignOrgFlag\": \"\",\n" +
                "    \"bankSubAccount\": \" \",\n" +
                "    \"bankSerialNo\": 0,\n" +
                "    \"bankName\": \"\",\n" +
                "    \"qfiiSubAccountTag\": \"\",\n" +
                "    \"validFlag\": \"\",\n" +
                "    \"blockId\": 0,\n" +
                "    \"cashgroupProp\": \"\",\n" +
                "    \"compactId\": \"\",\n" +
                "    \"stockType\": 1,\n" +
                "    \"midPrice\": 0,\n" +
                "    \"inReportCode\": \"\",\n" +
                "    \"inStockName\": \"\",\n" +
                "    \"nicked\": \"\",\n" +
                "    \"szBondTradeMethod\": 0,\n" +
                "    \"operFlag\": \"\",\n" +
                "    \"rivalTradeParty\": \"\",\n" +
                "    \"entrustTableType\": 0,\n" +
                "    \"bonusType\": \"\",\n" +
                "    \"openfundExceedType\": \"\",\n" +
                "    \"rivalTradePartyType\": \"\",\n" +
                "    \"rivalCompanycode\": \"\",\n" +
                "    \"assetType\": \"\",\n" +
                "    \"applyDescribe\": \"\",\n" +
                "    \"fixedCompanyName\": \"\",\n" +
                "    \"entrustLaunchType\": null\n" +
                "" +
                "}";

        Integer max=hisjyTrealdealDao.getMaxrealdeal_serial_no();
        List<HisjyTrealdeal> datas = new ArrayList<>();

        Integer realdeal_serial_no = max+1;
        Integer dateInt = 20220315;
        Integer company_id = 100008;
        Integer fund_id = 15;
        Integer asset_id = 34;
        Integer combi_id = 34;
        List<ThreadInsertDataDto> list = Lists.newLinkedList();


        for (int i = 0; i < num; i++) {
            HisjyTrealdeal hisjyTentrusts = JSON.parseObject(modelEntityJson, HisjyTrealdeal.class);
            hisjyTentrusts.setAssetId(asset_id);
            hisjyTentrusts.setCombiId(combi_id);
            hisjyTentrusts.setFundId(fund_id);
            hisjyTentrusts.setCompanyId(company_id);
            hisjyTentrusts.setBatchSerialNo(realdeal_serial_no);
            hisjyTentrusts.setRealdealSerialNo(realdeal_serial_no);
            hisjyTentrusts.setBusinessDate(dateInt);
            datas.add(hisjyTentrusts);
            realdeal_serial_no+=1;
            if (i % 1000 == 0) {
                fund_id+=1;
                asset_id+=1;
                combi_id+=1;
            }
            if (i % 10000 == 0) {
                LocalDate localDateTime = LocalDate.parse(dateInt.toString(), dateTimeFormatter);
                localDateTime = localDateTime.minusDays(1L);
                dateInt = Integer.valueOf(localDateTime.format(dateTimeFormatter));
                company_id+=1;
            }
            if (datas.size() >= batchNum) {
                //list.add(new ThreadInsertDataDto(hisjyTentrustsDao, datas));
                executorService.submit(new ThreadInsertDataDto(hisjyTrealdealDao, datas));
                log.info("submit");
                datas = new ArrayList<>();
            }
        }
        if (datas.size() > 0) {
            //list.add(new ThreadInsertDataDto(jyTentrustsDao, datas));
            executorService.submit(new ThreadInsertDataDto(hisjyTrealdealDao, datas));
            log.info("submit last size:{}",datas.size());
        }
        //try {
        //    executorService.invokeAll(list);
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}
        log.info("task done :{} ",executorService.getCompletedTaskCount());;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param businessDate 主键
     * @return 实例对象
     */
    @Override
    public HisjyTrealdeal queryById(Integer businessDate) {
        return this.hisjyTrealdealDao.queryById(businessDate);
    }

    /**
     * 分页查询
     *
     * @param hisjyTrealdeal 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @Override
    public Page<HisjyTrealdeal> queryByPage(HisjyTrealdeal hisjyTrealdeal, PageRequest pageRequest) {
        long total = this.hisjyTrealdealDao.count(hisjyTrealdeal);
        return new PageImpl<>(this.hisjyTrealdealDao.queryAllByLimit(hisjyTrealdeal, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param hisjyTrealdeal 实例对象
     * @return 实例对象
     */
    @Override
    public HisjyTrealdeal insert(HisjyTrealdeal hisjyTrealdeal) {
        this.hisjyTrealdealDao.insert(hisjyTrealdeal);
        return hisjyTrealdeal;
    }

    /**
     * 修改数据
     *
     * @param hisjyTrealdeal 实例对象
     * @return 实例对象
     */
    @Override
    public HisjyTrealdeal update(HisjyTrealdeal hisjyTrealdeal) {
        this.hisjyTrealdealDao.update(hisjyTrealdeal);
        return this.queryById(hisjyTrealdeal.getBusinessDate());
    }

    /**
     * 通过主键删除数据
     *
     * @param businessDate 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer businessDate) {
        return this.hisjyTrealdealDao.deleteById(businessDate) > 0;
    }
}
