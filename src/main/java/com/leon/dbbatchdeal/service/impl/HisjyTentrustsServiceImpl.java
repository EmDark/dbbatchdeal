package com.leon.dbbatchdeal.service.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.leon.dbbatchdeal.dao.HisjyTentrustsDao;
import com.leon.dbbatchdeal.dto.ThreadInsertDataDto;
import com.leon.dbbatchdeal.entity.HisjyTentrusts;
import com.leon.dbbatchdeal.service.HisjyTentrustsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * (HisjyTentrusts)表服务实现类
 *
 * @author makejava
 * @since 2022-08-25 10:50:45
 */
@Service("hisjyTentrustsService")
public class HisjyTentrustsServiceImpl implements HisjyTentrustsService {
    private static final Logger logger = LoggerFactory.getLogger(HisjyTentrustsServiceImpl.class);
    @Resource
    private HisjyTentrustsDao hisjyTentrustsDao;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    @Resource(name = "SpExecutor")
    private ThreadPoolExecutor executorService;

    @Override
    public void insertDatas(Integer threadSize, Integer batchNum, Integer num) {
        String modelEntityJson = " {\n" +
                "            \"businessDate\": 20160627,\n" +
                "            \"entrustSerialNo\": 11,\n" +
                "            \"batchSerialNo\": 10,\n" +
                "            \"reportSerialNo\": 5,\n" +
                "            \"companyId\": 100004,\n" +
                "            \"fundId\": 15,\n" +
                "            \"confirmCodeno\": \" \",\n" +
                "            \"assetId\": 34,\n" +
                "            \"combiId\": 34,\n" +
                "            \"marketNo\": 1,\n" +
                "            \"reportCode\": \"600000\",\n" +
                "            \"interCode\": 600000001,\n" +
                "            \"bindSeat\": \"V_2\",\n" +
                "            \"stockholderId\": \"A520000010\",\n" +
                "            \"tradeSeat\": \"V_2\",\n" +
                "            \"investType\": \"1\",\n" +
                "            \"entrustDirection\": 1,\n" +
                "            \"reportDirection\": \"B\",\n" +
                "            \"entrustPriceType\": \"H\",\n" +
                "            \"entrustPrice\": 7.12,\n" +
                "            \"entrustAmount\": 500000,\n" +
                "            \"entrustBalance\": 3560000,\n" +
                "            \"cancelAmount\": 0,\n" +
                "            \"businAmount\": 0,\n" +
                "            \"businBalance\": 0,\n" +
                "            \"totalDealAmount\": 0,\n" +
                "            \"totalDealBalance\": 0,\n" +
                "            \"prebuyFrozenBalance\": 3560000,\n" +
                "            \"entrustStatus\": \"5\",\n" +
                "            \"entrustLaunchType\": \"1\",\n" +
                "            \"businTimes\": 0,\n" +
                "            \"entrustTime\": 100826,\n" +
                "            \"lastDealTime\": 0,\n" +
                "            \"operatorNo\": 1006,\n" +
                "            \"revokeCause\": \"不支持的业务\",\n" +
                "            \"reportSerialNoBranch\": \" \",\n" +
                "            \"recNum\": 0,\n" +
                "            \"tranReff\": \" \",\n" +
                "            \"tradePlatformId\": 2,\n" +
                "            \"cancelFlag\": \"0\",\n" +
                "            \"cancelSerialNo\": 0,\n" +
                "            \"appendEntrustXhFlag\": \"0\",\n" +
                "            \"mac\": \"14857F1657D8\",\n" +
                "            \"ipAddress\": \"172.24.11.221\",\n" +
                "            \"volserialNo\": \"_000000_00_1C83E8_1E_000703_17.7\",\n" +
                "            \"wsCpu\": \"BFEBFBFF000806C1\",\n" +
                "            \"schemeCode\": \" \",\n" +
                "            \"schemeInsCode\": \" \",\n" +
                "            \"algoOrdid\": \" \",\n" +
                "            \"insId\": 0,\n" +
                "            \"indexDailyModify\": 0,\n" +
                "            \"insStockId\": 0,\n" +
                "            \"capitalAccountNo\": \"520000010\",\n" +
                "            \"branchCode\": \"18918\",\n" +
                "            \"sysBranchCode\": \"18918\",\n" +
                "            \"tradeInterfaceType\": 64,\n" +
                "            \"arbitrageSerialNo\": 0,\n" +
                "            \"engagedNo\": \" \",\n" +
                "            \"rivalSeat\": \" \",\n" +
                "            \"rivalStockholderId\": \" \",\n" +
                "            \"sysDate\": 20220521,\n" +
                "            \"sysTime\": 100826,\n" +
                "            \"externalOrdid\": 1,\n" +
                "            \"thirdRemark\": \"trade_interface_type=64\",\n" +
                "            \"voteSenateNo\": \" \",\n" +
                "            \"stockName\": \"浦发银行\",\n" +
                "            \"tradeCurrencyNo\": \"CNY\",\n" +
                "            \"fundName\": \"GFLPTRADE\",\n" +
                "            \"assetName\": \"大宗单元\",\n" +
                "            \"combiName\": \"3组合\",\n" +
                "            \"capitalAccountType\": \"5\",\n" +
                "            \"positionStr\": \"201606270000150000000011\",\n" +
                "            \"traceFlag\": \"2\",\n" +
                "            \"closeDirection\": \"0\",\n" +
                "            \"optionCoveredFlag\": \"\",\n" +
                "            \"linkman\": \"GFL\",\n" +
                "            \"phoneNo\": \"123456\",\n" +
                "            \"clearSpeed\": 0,\n" +
                "            \"validFlag\": \"1\",\n" +
                "            \"rivalTradercode\": \" \",\n" +
                "            \"hgDealDate\": 0,\n" +
                "            \"quoterRequestNo\": \"\",\n" +
                "            \"originalDealNo\": \"0\",\n" +
                "            \"contractNo\": \"\",\n" +
                "            \"hgDays\": 0,\n" +
                "            \"reportFlag\": \"\",\n" +
                "            \"legalGhDate\": 0,\n" +
                "            \"actualGhDate\": 0,\n" +
                "            \"hgInterest\": 0,\n" +
                "            \"hgcontinueFlag\": \"\",\n" +
                "            \"thirdFlag\": \"\",\n" +
                "            \"firstSettleDate\": 0,\n" +
                "            \"useDays\": 0,\n" +
                "            \"boardType\": \"\",\n" +
                "            \"terminalInfoSlitExt\": \"BFEBFBFF000806C1|172.24.11.221|||WINDOWS-QRUH9QB|C^NTFS^120G|OPLUSV202201.00.000|ows 10 企业版|GFL|172.24.11.221|5CG1259X8W|HP|k 830 G8 Notebook PC|||]172.24.11.221:50330|^E828-6A3D|50330\",\n" +
                "            \"orderId\": 0,\n" +
                "            \"dfdStatus\": \"\",\n" +
                "            \"autoDropFlag\": \"\",\n" +
                "            \"reportStatus\": \"\",\n" +
                "            \"bulkunderweightFlag\": \"0\",\n" +
                "            \"cashgroupProp\": \"\",\n" +
                "            \"minVolume\": 0,\n" +
                "            \"compactId\": \" \",\n" +
                "            \"stockType\": 1,\n" +
                "            \"restrictedFlag\": \"\",\n" +
                "            \"inReportCode\": \"-\",\n" +
                "            \"inStockName\": \"-\"\n" +
                "        }";

        Integer max = hisjyTentrustsDao.getMaxEntrustSerialNo();
        List<HisjyTentrusts> datas = new ArrayList<>();

        Integer entrust_serial_no = max + 1;
        Integer dateInt = 20220315;
        Integer company_id = 100008;
        Integer fund_id = 15;
        Integer asset_id = 34;
        Integer combi_id = 34;
        List<ThreadInsertDataDto> list = Lists.newLinkedList();


        for (int i = 0; i < num; i++) {
            HisjyTentrusts hisjyTentrusts = JSON.parseObject(modelEntityJson, HisjyTentrusts.class);
            hisjyTentrusts.setAssetId(asset_id);
            hisjyTentrusts.setCombiId(combi_id);
            hisjyTentrusts.setFundId(fund_id);
            hisjyTentrusts.setCompanyId(company_id);
            hisjyTentrusts.setBatchSerialNo(entrust_serial_no);
            hisjyTentrusts.setEntrustSerialNo(entrust_serial_no);
            hisjyTentrusts.setBusinessDate(dateInt);
            datas.add(hisjyTentrusts);
            entrust_serial_no += 1;
            if (i % 1000 == 0) {
                fund_id += 1;
                asset_id += 1;
                combi_id += 1;
            }
            if (i % 10000 == 0) {
                LocalDate localDateTime = LocalDate.parse(dateInt.toString(), dateTimeFormatter);
                localDateTime = localDateTime.minusDays(1L);
                dateInt = Integer.valueOf(localDateTime.format(dateTimeFormatter));
                company_id += 1;
            }
            if (datas.size() >= batchNum) {
                //list.add(new ThreadInsertDataDto(hisjyTentrustsDao, datas));
                executorService.submit(new ThreadInsertDataDto(hisjyTentrustsDao, datas));
                logger.info("submit");
                datas = new ArrayList<>();
            }
        }
        if (datas.size() > 0) {
            //list.add(new ThreadInsertDataDto(hisjyTentrustsDao, datas));
            executorService.submit(new ThreadInsertDataDto(hisjyTentrustsDao, datas));
            logger.info("submit last size:{}", datas.size());
        }
        //try {
        //    executorService.invokeAll(list);
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}
        logger.info("task done :{} ", executorService.getCompletedTaskCount());
        ;

    }

    /**
     * 通过ID查询单条数据
     *
     * @param businessDate 主键
     * @return 实例对象
     */
    @Override
    public HisjyTentrusts queryById(Integer businessDate) {
        return this.hisjyTentrustsDao.queryById(businessDate);
    }

    /**
     * 分页查询
     *
     * @param hisjyTentrusts 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @Override
    public Page<HisjyTentrusts> queryByPage(HisjyTentrusts hisjyTentrusts, PageRequest pageRequest) {
        if (pageRequest == null) {
            pageRequest = PageRequest.of(0, 10);
        }
        long total = this.hisjyTentrustsDao.count(hisjyTentrusts);
        return new PageImpl<>(this.hisjyTentrustsDao.queryAllByLimit(hisjyTentrusts, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param hisjyTentrusts 实例对象
     * @return 实例对象
     */
    @Override
    public HisjyTentrusts insert(HisjyTentrusts hisjyTentrusts) {
        this.hisjyTentrustsDao.insert(hisjyTentrusts);
        return hisjyTentrusts;
    }

    /**
     * 修改数据
     *
     * @param hisjyTentrusts 实例对象
     * @return 实例对象
     */
    @Override
    public HisjyTentrusts update(HisjyTentrusts hisjyTentrusts) {
        this.hisjyTentrustsDao.update(hisjyTentrusts);
        return this.queryById(hisjyTentrusts.getBusinessDate());
    }

    /**
     * 通过主键删除数据
     *
     * @param businessDate 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer businessDate) {
        return this.hisjyTentrustsDao.deleteById(businessDate) > 0;
    }
}
