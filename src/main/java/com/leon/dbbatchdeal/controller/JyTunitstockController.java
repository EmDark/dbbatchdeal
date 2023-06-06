package com.leon.dbbatchdeal.controller;

import com.leon.dbbatchdeal.dto.BaseResponse;
import com.leon.dbbatchdeal.dto.JyTunitstock;
import com.leon.dbbatchdeal.dto.StatusCode;
import com.leon.dbbatchdeal.service.JyTunitstockService;
import java.util.List;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * (JyTunitstock)表控制层
 *
 * @author makejava
 * @since 2022-11-07 20:21:25
 */
@RestController
@RequestMapping("jyTunitstock")
public class JyTunitstockController {

    public static final Logger LOGGER = LoggerFactory.getLogger(JyTunitstockController.class);

    /**
     * 服务对象
     */
    @Resource
    private JyTunitstockService jyTunitstockService;

    @RequestMapping(value = "all/insert/data", method = RequestMethod.GET)
    public BaseResponse insertAllData(@RequestParam(name = "num") Integer num,
        @RequestParam(name = "type") Integer type,
        @RequestParam(name = "threadSize", defaultValue = "4") Integer threadSize,
        @RequestParam(name = "batchNum", defaultValue = "500") Integer batchNum) {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        long s = System.currentTimeMillis();
        try {
            jyTunitstockService.insertDatas(type, threadSize, batchNum, num);
        } catch (Exception e) {
            response = new BaseResponse(StatusCode.Fail, e.getMessage());
            e.printStackTrace();
        }
        long e = System.currentTimeMillis();
        LOGGER.info("cost :{} ms", e - s);
        response.setMessage("ok");
        response.setSuccess(0);
        return response;
    }

    @GetMapping
    public ResponseEntity<List<JyTunitstock>> get(Integer offset, Integer pageSize) {
        return ResponseEntity.ok(this.jyTunitstockService.queryByPage(new JyTunitstock(), offset, pageSize));
    }

    /**
     * 新增数据
     *
     * @param jyTunitstock 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<JyTunitstock> add(JyTunitstock jyTunitstock) {
        return ResponseEntity.ok(this.jyTunitstockService.insert(jyTunitstock));
    }

    /**
     * 编辑数据
     *
     * @param jyTunitstock 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<JyTunitstock> edit(JyTunitstock jyTunitstock) {
        return ResponseEntity.ok(this.jyTunitstockService.update(jyTunitstock));
    }


}

