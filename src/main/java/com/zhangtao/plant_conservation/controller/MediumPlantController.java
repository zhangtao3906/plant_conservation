package com.zhangtao.plant_conservation.controller;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.MediumPlant;
import com.zhangtao.plant_conservation.service.medium_plant.MediumPlantService;
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
 * @date 2021-4-29 13:08
 */
@Slf4j
@RestController
@RequestMapping("/mediumPlant")
public class MediumPlantController {

    @Autowired
    private MediumPlantService mediumPlantService;

    /**
     * 中型植物新增接口
     * @param mediumPlant
     * @return
     */
    @ApiOperation("中型植物新增")
    @PostMapping(value = "/insMediumPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> insMediumPlant(@RequestBody MediumPlant mediumPlant){
        log.info("返回的json报文[{}]" + mediumPlant.toString());
        return mediumPlantService.insMediumPlant(mediumPlant);
    }

    /**
     * 中型植物删除接口
     * @param mediumPlant
     * @return
     */
    @ApiOperation("中型植物删除")
    @PostMapping(value = "deleteMediumPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> deleteMediumPlant(@RequestBody MediumPlant mediumPlant){
        log.info("返回的json报文[{}]" + mediumPlant.toString());
        return mediumPlantService.deleteMediumPlant(mediumPlant);
    }

    /**
     * 中型植物重启接口
     * @param mediumPlant
     * @return
     */
    @ApiOperation("中型植物重启")
    @PostMapping(value = "restartMediumPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> restartMediumPlant(@RequestBody MediumPlant mediumPlant){
        log.info("返回的json报文[{}]" + mediumPlant.toString());
        return mediumPlantService.restartMediumPlant(mediumPlant);
    }

    /**
     * 根据中型植物编号修改信息
     * @param mediumPlant
     * @return
     */
    @ApiOperation("中型植物修改")
    @PostMapping(value = "updateMediumPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> updateMediumPlant(@RequestBody MediumPlant mediumPlant){
        log.info("返回的json报文[{}]" + mediumPlant.toString());
        return mediumPlantService.updateMediumPlant(mediumPlant);
    }

    /**
     * 展示所有的中型植物信息
     * @return
     */
    @ApiOperation("查询中型植物信息列表")
    @PostMapping(value = "selMediumPlantList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<MediumPlant>> selSmallPlantList(){
        return mediumPlantService.selMediumPlantList();
    }

    /**
     * 根据条件查询中型植物信息
     * @param mediumPlant
     * @return
     */
    @ApiOperation("根据条件查询多肉植物信息列表")
    @PostMapping(value = "selMediumPlantByCodeList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<MediumPlant>> selMediumPlantByCodeList(@RequestBody MediumPlant mediumPlant){
        log.info("返回的json报文[{}]" + mediumPlant.toString());
        return mediumPlantService.selMediumPlantByCodeList(mediumPlant);
    }

}
