package com.zhangtao.plant_conservation.controller;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.PlantType;
import com.zhangtao.plant_conservation.service.plant_type.PlantTypeService;
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
 */
@Slf4j
@RestController
@RequestMapping("/plantType")
public class PlantTypeController {

    @Autowired
    private PlantTypeService plantTypeService;

    /**
     * 植物类型新增接口
     * @param plantType
     * @return
     */
    @ApiOperation("植物类型新增")
    @PostMapping(value = "insPlantType",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> insPlantType(@RequestBody PlantType plantType){
        log.info("返回的json报文[{}]" + plantType.toString());
        return plantTypeService.insPlantType(plantType);
    }

    /**
     * 植物类型删除接口
     * @param plantType
     * @return
     */
    @ApiOperation("植物类型删除")
    @PostMapping(value = "deletePlantType",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> deletePlantType(@RequestBody PlantType plantType){
        log.info("返回的json报文[{}]" + plantType.toString());
        return plantTypeService.deletePlantType(plantType);
    }

    /**
     * 植物类型重启接口
     * @param plantType
     * @return
     */
    @ApiOperation("植物类型重启")
    @PostMapping(value = "restartPlantType",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> restartPlantType(@RequestBody PlantType plantType){
        log.info("返回的json报文[{}]" + plantType.toString());
        return plantTypeService.restartPlantType(plantType);
    }

    /**
     * 根据植物类型编号修改信息
     * @param plantType
     * @return
     */
    @ApiOperation("植物类型修改")
    @PostMapping(value = "updatePlantType",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> updatePlantType(@RequestBody PlantType plantType){
        log.info("返回的json报文[{}]" + plantType.toString());
        return plantTypeService.restartPlantType(plantType);
    }

    /**
     * 展示所有的植物类型信息
     * @return
     */
    @ApiOperation("查询植物分类信息列表")
    @PostMapping(value = "selPlantTypeList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<PlantType>> selPlantTypeList(){
        return plantTypeService.selPlantTypeList();
    }

    /**
     * 根据条件查询植物类型信息
     * @param plantType
     * @return
     */
    @ApiOperation("根据条件查询植物分类信息列表")
    @PostMapping(value = "selPlantTypeByCodeList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<PlantType>> selPlantTypeByCodeList(@RequestBody PlantType plantType){
        log.info("返回的json报文[{}]" + plantType.toString());
        return plantTypeService.selPlantTypeByCodeList(plantType);
    }


}
