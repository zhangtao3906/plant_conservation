package com.zhangtao.plant_conservation.service.manager.impl;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.mapper.ManagerMapper;
import com.zhangtao.plant_conservation.pojo.Manager;
import com.zhangtao.plant_conservation.service.manager.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    /**
     * 管理员信息新增
     * @param manager
     * @return
     */
    @Override
    public CommonResult<Integer> insManager(Manager manager) {
        //判断用户编号是否重复--如果编号重复，则code不为null
        if(managerMapper.checkManagerCode(manager)!=null){
            return CommonResult.failed("管理员编号managerCode重复");
        }

        //TODO:判断用户是否是管理员
        return CommonResult.success(managerMapper.insManager(manager));
    }

    /**
     * 管理员禁用接口
     * @param manager
     * @return
     */
    @Override
    public CommonResult<Integer> deleteManager(Manager manager) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(managerMapper.deleteManager(manager));
    }

    /**
     * 管理员重启接口
     * @param manager
     * @return
     */
    @Override
    public CommonResult<Integer> restartManager(Manager manager) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(managerMapper.restartManager(manager));
    }

    /**
     * 管理员修改接口
     * @param manager
     * @return
     */
    @Override
    public CommonResult<Integer> updateManager(Manager manager) {
        return CommonResult.success(managerMapper.updateManager(manager));
    }

    /**
     * 管理员查询接口
     * @return
     */
    @Override
    public CommonResult<List<Manager>> selManagerList() {
        return CommonResult.success(managerMapper.selManagerList());
    }

    /**
     * 根据管理员编号查询接口
     * @param manager
     * @return
     */
    @Override
    public CommonResult<List<Manager>> selManagerByCodeList(Manager manager) {
        return CommonResult.success(managerMapper.selManagerByCodeList(manager));
    }
}
