package com.zhangtao.plant_conservation.controller;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.LargePlant;
import com.zhangtao.plant_conservation.service.large_plant.LargePlantService;
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
 * @date 2021-4-29 13:46
 */
@Slf4j
@RestController
@RequestMapping("/largePlant")
public class LargePlantController {

    @Autowired
    private LargePlantService largePlantService;

    /**
     * 大型植物新增接口
     * @param largePlant
     * @return
     */
    @ApiOperation("大型植物新增")
    @PostMapping(value = "/insLargePlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> insLargePlant(@RequestBody LargePlant largePlant){
        log.info("返回的json报文[{}]" + largePlant.toString());
        return largePlantService.insLargePlant(largePlant);
    }

    /**
     * 大型植物删除接口
     * @param largePlant
     * @return
     */
    @ApiOperation("大型植物删除")
    @PostMapping(value = "/deleteLargePlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> deleteLargePlant(@RequestBody LargePlant largePlant){
        log.info("返回的json报文[{}]" + largePlant.toString());
        return largePlantService.deleteLargePlant(largePlant);
    }

    /**
     * 大型植物重启接口
     * @param largePlant
     * @return
     */
    @ApiOperation("大型植物重启")
    @PostMapping(value = "/restartLargePlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> restartMediumPlant(@RequestBody LargePlant largePlant){
        log.info("返回的json报文[{}]" + largePlant.toString());
        return largePlantService.restartLargePlant(largePlant);
    }

    /**
     * 根据大型植物编号修改信息
     * @param largePlant
     * @return
     */
    @ApiOperation("大型植物修改")
    @PostMapping(value = "/updateLargePlant",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> updateLargePlant(@RequestBody LargePlant largePlant){
        log.info("返回的json报文[{}]" + largePlant.toString());
        return largePlantService.updateLargePlant(largePlant);
    }

    /**
     * 展示所有的大型植物信息
     * @return
     */
    @ApiOperation("查询大型植物信息列表")
    @PostMapping(value = "/selLargePlantList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<LargePlant>> selLargePlantList(){
        return largePlantService.selLargePlantList();
    }

    /**
     * 根据条件查询大型植物信息
     * @param largePlant
     * @return
     */
    @ApiOperation("根据条件查询大型植物信息列表")
    @PostMapping(value = "/selLargePlantByCodeList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<LargePlant>> selLargePlantByCodeList(@RequestBody LargePlant largePlant){
        log.info("返回的json报文[{}]" + largePlant.toString());
        return largePlantService.selLargePlantByCodeList(largePlant);
    }

}
