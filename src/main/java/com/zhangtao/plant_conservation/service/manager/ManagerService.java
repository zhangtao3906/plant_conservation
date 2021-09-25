package com.zhangtao.plant_conservation.service.manager;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.Manager;
import com.zhangtao.plant_conservation.pojo.User;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
public interface ManagerService {

    /**
     * 单数据创建管理员信息                    insManager
     * 确保管理员编号没有重复                  checkManager
     * 确保操作人员是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param manager
     * @return
     */
    CommonResult<Integer> insManager(Manager manager);

    /**
     * 根据编号删除管理员，修改enable和activity字段为false   deleteManager
     * 判断是否是manager       // TODO: 2021/4/28  判断是否是管理员
     * @param manager
     * @return
     */
    CommonResult<Integer> deleteManager(Manager manager);

    /**
     * 根据编号重启管理员，修改enable和activity字段为true   restartManager
     * 判断是否是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param manager
     * @return
     */
    CommonResult<Integer> restartManager(Manager manager);

    /**
     * 根据编号修改管理员信息      updateManager
     * 判断是否是manager     // TODO: 2021/4/28  判断是否是管理员
     * @param manager
     * @return
     */
    CommonResult<Integer> updateManager(Manager manager);

    /**
     * 查询管理员中的所有信息
     * @return
     */
    CommonResult<List<Manager>> selManagerList();

    /**
     * 通过编号查询管理员
     * @param manager
     * @return
     */
    CommonResult<List<Manager>> selManagerByCodeList(Manager manager);
}
