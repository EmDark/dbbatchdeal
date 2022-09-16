package com.leon.dbbatchdeal.controller;

import com.leon.dbbatchdeal.dto.BaseResponse;
import com.leon.dbbatchdeal.dto.StatusCode;
import com.leon.dbbatchdeal.entity.HisjyTrealdeal;
import com.leon.dbbatchdeal.service.HisjyTrealdealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (HisjyTrealdeal)表控制层
 *
 * @author makejava
 * @since 2022-09-09 17:39:02
 */
@RestController
@RequestMapping("hisjyTrealdeal")
@Slf4j
public class HisjyTrealdealController {
    /**
     * 服务对象
     */
    @Resource
    private HisjyTrealdealService hisjyTrealdealService;

    @RequestMapping(value = "all/insert/data", method = RequestMethod.GET)
    public BaseResponse insertAllData(@RequestParam(name = "num") Integer num,
                                      @RequestParam(name = "threadSize", defaultValue = "4") Integer threadSize,
                                      @RequestParam(name = "batchNum", defaultValue = "500") Integer batchNum) {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        long s = System.currentTimeMillis();
        try {
            hisjyTrealdealService.insertDatas(threadSize, batchNum, num);
        } catch (Exception e) {
            response = new BaseResponse(StatusCode.Fail, e.getMessage());
            e.printStackTrace();
        }
        long e = System.currentTimeMillis();
        log.info("cost :{} ms", e - s);
        response.setMessage("ok");
        response.setSuccess(0);
        return response;
    }
    /**
     * 分页查询
     *
     * @param hisjyTrealdeal 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<HisjyTrealdeal>> queryByPage(HisjyTrealdeal hisjyTrealdeal,  @RequestParam(required = false)PageRequest pageRequest) {
        return ResponseEntity.ok(this.hisjyTrealdealService.queryByPage(hisjyTrealdeal, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<HisjyTrealdeal> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.hisjyTrealdealService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param hisjyTrealdeal 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<HisjyTrealdeal> add(HisjyTrealdeal hisjyTrealdeal) {
        return ResponseEntity.ok(this.hisjyTrealdealService.insert(hisjyTrealdeal));
    }

    /**
     * 编辑数据
     *
     * @param hisjyTrealdeal 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<HisjyTrealdeal> edit(HisjyTrealdeal hisjyTrealdeal) {
        return ResponseEntity.ok(this.hisjyTrealdealService.update(hisjyTrealdeal));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.hisjyTrealdealService.deleteById(id));
    }

}

