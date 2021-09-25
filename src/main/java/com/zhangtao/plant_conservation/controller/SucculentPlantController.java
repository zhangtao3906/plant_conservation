package com.zhangtao.plant_conservation.controller;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.SucculentPlant;
import com.zhangtao.plant_conservation.service.succulent_plant.SucculentPlantService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-27 22:55
 */
@Slf4j
@RestController
@RequestMapping("/succulentPlant")
public class SucculentPlantController {

    @Autowired
    private SucculentPlantService succulentPlantService;

    /**
     * 多肉植物新增接口
     * @param succulentPlant
     * @return
     */
    @ApiOperation("多肉植物新增")
    @PostMapping(value = "/insSucculentPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> insSucculentPlant(@RequestBody SucculentPlant succulentPlant){
        log.info("返回的json报文[{}]" + succulentPlant.toString());
        return succulentPlantService.insSucculentPlant(succulentPlant);
    }

    /**
     * 多肉植物删除接口
     * @param succulentPlant
     * @return
     */
    @ApiOperation("多肉植物删除")
    @PostMapping(value = "deleteSucculentPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> deleteSucculentPlant(@RequestBody SucculentPlant succulentPlant){
        log.info("返回的json报文[{}]" + succulentPlant.toString());
        return succulentPlantService.deleteSucculentPlant(succulentPlant);
    }

    /**
     * 多肉植物重启接口
     * @param succulentPlant
     * @return
     */
    @ApiOperation("多肉植物重启")
    @PostMapping(value = "restartSucculentPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> restartSucculentPlant(@RequestBody SucculentPlant succulentPlant){
        log.info("返回的json报文[{}]" + succulentPlant.toString());
        return succulentPlantService.restartSucculentPlant(succulentPlant);
    }

    /**
     * 根据多肉植物编号修改信息
     * @param succulentPlant
     * @return
     */
    @ApiOperation("多肉植物修改")
    @PostMapping(value = "updateSucculentPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> updateSucculentPlant(@RequestBody SucculentPlant succulentPlant){
        log.info("返回的json报文[{}]" + succulentPlant.toString());
        return succulentPlantService.updateSucculentPlant(succulentPlant);
    }

    /**
     * 展示所有的多肉植物信息
     * @return
     */
    @ApiOperation("查询多肉植物信息列表")
    @PostMapping(value = "selSucculentPlantList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<SucculentPlant>> selSucculentPlantList(){
        return succulentPlantService.selSucculentPlantList();
    }

    /**
     * 根据条件查询多肉植物信息
     * @param succulentPlant
     * @return
     */
    @ApiOperation("根据条件查询多肉植物信息列表")
    @PostMapping(value = "selSucculentPlantByCodeList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<SucculentPlant>> selPlantTypeByCodeList(@RequestBody SucculentPlant succulentPlant){
        log.info("返回的json报文[{}]" + succulentPlant.toString());
        return succulentPlantService.selSucculentPlantByCodeList(succulentPlant);
    }

}
