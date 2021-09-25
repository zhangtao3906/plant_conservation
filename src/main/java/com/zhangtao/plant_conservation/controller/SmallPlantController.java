package com.zhangtao.plant_conservation.controller;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.SmallPlant;
import com.zhangtao.plant_conservation.service.small_plant.SmallPlantService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29 11:05
 */
@Slf4j
@RestController
@RequestMapping("/smallPlant")

public class SmallPlantController {

    @Autowired
    private SmallPlantService smallPlantService;

    /**
     * 小型植物新增接口
     * @param smallPlant
     * @return
     */
    @ApiOperation("小型植物新增")
    @PostMapping(value = "/insSmallPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> insSmallPlant(@RequestBody SmallPlant smallPlant){
        log.info("返回的json报文[{}]" + smallPlant.toString());
        return smallPlantService.insSmallPlant(smallPlant);
    }

    /**
     * 小型植物删除接口
     * @param smallPlant
     * @return
     */
    @ApiOperation("小型植物删除")
    @PostMapping(value = "deleteSmallPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> deleteSmallPlant(@RequestBody SmallPlant smallPlant){
        log.info("返回的json报文[{}]" + smallPlant.toString());
        return smallPlantService.deleteSmallPlant(smallPlant);
    }

    /**
     * 小型植物重启接口
     * @param smallPlant
     * @return
     */
    @ApiOperation("小型植物重启")
    @PostMapping(value = "restartSmallPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> restartSmallPlant(@RequestBody SmallPlant smallPlant){
        log.info("返回的json报文[{}]" + smallPlant.toString());
        return smallPlantService.restartSmallPlant(smallPlant);
    }

    /**
     * 根据小型植物编号修改信息
     * @param smallPlant
     * @return
     */
    @ApiOperation("小型植物修改")
    @PostMapping(value = "updateSmallPlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> updateSmallPlant(@RequestBody SmallPlant smallPlant){
        log.info("返回的json报文[{}]" + smallPlant.toString());
        return smallPlantService.updateSmallPlant(smallPlant);
    }

    /**
     * 展示所有的多肉植物信息
     * @return
     */
    @ApiOperation("查询多肉植物信息列表")
    @PostMapping(value = "selSmallPlantList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<SmallPlant>> selSmallPlantList(){
        return smallPlantService.selSmallPlantList();
    }

    /**
     * 根据条件查询多肉植物信息
     * @param smallPlant
     * @return
     */
    @ApiOperation("根据条件查询多肉植物信息列表")
    @PostMapping(value = "selSmallPlantByCodeList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<SmallPlant>> selSmallPlantByCodeList(@RequestBody SmallPlant smallPlant){
        log.info("返回的json报文[{}]" + smallPlant.toString());
        return smallPlantService.selSmallPlantByCodeList(smallPlant);
    }

    @ApiOperation("修改小型植物列表")
    @PostMapping(value = "updateSmallPlantList" , produces = "application/json;character=UTF-8")
    public Integer updateSmallPlantList(@RequestBody SmallPlant smallPlant){
        log.info("返回的json报文[{}]"+smallPlant.toString());
        return smallPlantService.updateSmallPlantList(smallPlant);
    }
}
