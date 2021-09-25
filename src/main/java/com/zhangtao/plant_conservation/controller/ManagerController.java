package com.zhangtao.plant_conservation.controller;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.LargePlant;
import com.zhangtao.plant_conservation.pojo.Manager;
import com.zhangtao.plant_conservation.service.large_plant.LargePlantService;
import com.zhangtao.plant_conservation.service.manager.ManagerService;
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
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    /**
     * 管理员新增接口
     * @param manager
     * @return
     */
    @ApiOperation("管理员新增")
    @PostMapping(value = "/insManager",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> insManager(@RequestBody Manager manager){
        log.info("返回的json报文[{}]" + manager.toString());
        return managerService.insManager(manager);
    }

    /**
     * 管理员删除接口
     * @param manager
     * @return
     */
    @ApiOperation("管理员删除")
    @PostMapping(value = "/deleteManager",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> deleteManager(@RequestBody Manager manager){
        log.info("返回的json报文[{}]" + manager.toString());
        return managerService.deleteManager(manager);
    }

    /**
     * 管理员重启接口
     * @param manager
     * @return
     */
    @ApiOperation("管理员重启接口")
    @PostMapping(value = "/restartManager",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> restartManager(@RequestBody Manager manager){
        log.info("返回的json报文[{}]" + manager.toString());
        return managerService.restartManager(manager);
    }

    /**
     * 根据管理员编号修改信息
     * @param manager
     * @return
     */
    @ApiOperation("管理员修改")
    @PostMapping(value = "/updateManager",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> updateManager(@RequestBody Manager manager){
        log.info("返回的json报文[{}]" + manager.toString());
        return managerService.updateManager(manager);
    }

    /**
     * 展示管理员信息
     * @return
     */
    @ApiOperation("查询管理员列表")
    @PostMapping(value = "/selManagerList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<Manager>> selManagerList(){
        return managerService.selManagerList();
    }

    /**
     * 根据条件查询管理员信息
     * @param manager
     * @return
     */
    @ApiOperation("根据条件查询管理员信息列表")
    @PostMapping(value = "/selManagerByCodeList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<Manager>> selManagerByCodeList(@RequestBody Manager manager){
        log.info("返回的json报文[{}]" + manager.toString());
        return managerService.selManagerByCodeList(manager);
    }

}
