package com.leon.dbbatchdeal.controller;

import com.leon.dbbatchdeal.dto.BaseResponse;
import com.leon.dbbatchdeal.dto.StatusCode;
import com.leon.dbbatchdeal.entity.JyTrealdeal;
import com.leon.dbbatchdeal.service.JyTrealdealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (JyTrealdeal)表控制层
 *
 * @author makejava
 * @since 2022-09-09 17:37:29
 */
@RestController
@RequestMapping("jyTrealdeal")
@Slf4j
public class JyTrealdealController {

    /**
     * 服务对象
     */
    @Resource
    private JyTrealdealService jyTrealdealService;

    @RequestMapping(value = "all/insert/data", method = RequestMethod.GET)
    public BaseResponse insertAllData(@RequestParam(name = "num") Integer num,
                                      @RequestParam(name = "type") Integer type,
                                      @RequestParam(name = "threadSize", defaultValue = "4") Integer threadSize,
                                      @RequestParam(name = "batchNum", defaultValue = "500") Integer batchNum) {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        long s = System.currentTimeMillis();
        try {
            jyTrealdealService.insertDatas(type, threadSize, batchNum, num);
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
     * @param jyTrealdeal 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<JyTrealdeal>> queryByPage(JyTrealdeal jyTrealdeal,  @RequestParam(required = false)PageRequest pageRequest) {
        return ResponseEntity.ok(this.jyTrealdealService.queryByPage(jyTrealdeal, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<JyTrealdeal> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.jyTrealdealService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param jyTrealdeal 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<JyTrealdeal> add(JyTrealdeal jyTrealdeal) {
        return ResponseEntity.ok(this.jyTrealdealService.insert(jyTrealdeal));
    }

    /**
     * 编辑数据
     *
     * @param jyTrealdeal 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<JyTrealdeal> edit(JyTrealdeal jyTrealdeal) {
        return ResponseEntity.ok(this.jyTrealdealService.update(jyTrealdeal));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.jyTrealdealService.deleteById(id));
    }

}

