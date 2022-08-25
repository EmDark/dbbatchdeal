package com.leon.dbbatchdeal.controller;

import com.leon.dbbatchdeal.dto.BaseResponse;
import com.leon.dbbatchdeal.dto.StatusCode;
import com.leon.dbbatchdeal.entity.HisjyTentrusts;
import com.leon.dbbatchdeal.service.HisjyTentrustsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (HisjyTentrusts)表控制层
 *
 * @author makejava
 * @since 2022-08-25 10:50:37
 */
@RestController
@RequestMapping("hisjyTentrusts")
public class HisjyTentrustsController {
    /**
     * 服务对象
     */
    @Resource
    private HisjyTentrustsService hisjyTentrustsService;


    @RequestMapping(value = "all/insert/data",method = RequestMethod.GET)
    public BaseResponse insertAllData(){
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try {
            hisjyTentrustsService.insertDatas();
        }catch (Exception e){
            response=new BaseResponse(StatusCode.Fail,e.getMessage());
            e.printStackTrace();
        }
        return response;
    }
    /**
     * 分页查询
     *
     * @param hisjyTentrusts 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<HisjyTentrusts>> queryByPage(HisjyTentrusts hisjyTentrusts, @RequestParam(required = false) PageRequest pageRequest) {
        return ResponseEntity.ok(this.hisjyTentrustsService.queryByPage(hisjyTentrusts, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<HisjyTentrusts> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.hisjyTentrustsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param hisjyTentrusts 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<HisjyTentrusts> add(HisjyTentrusts hisjyTentrusts) {
        return ResponseEntity.ok(this.hisjyTentrustsService.insert(hisjyTentrusts));
    }

    /**
     * 编辑数据
     *
     * @param hisjyTentrusts 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<HisjyTentrusts> edit(HisjyTentrusts hisjyTentrusts) {
        return ResponseEntity.ok(this.hisjyTentrustsService.update(hisjyTentrusts));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.hisjyTentrustsService.deleteById(id));
    }

}
