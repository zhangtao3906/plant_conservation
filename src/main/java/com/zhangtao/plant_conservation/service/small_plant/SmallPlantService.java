package com.zhangtao.plant_conservation.service.small_plant;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.SmallPlant;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
public interface SmallPlantService {

    /**
     * 单数据创建小型植物信息                insSmallPlant
     * 确保植物编号没有重复                  checkSmallPlant
     * 确保操作人员是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param smallPlant
     * @return
     */
    CommonResult<Integer> insSmallPlant(SmallPlant smallPlant);

    /**
     * 根据编号删除小型植物信息，修改enable和activity字段为false   deleteSmallPlant
     * 判断是否是manager       // TODO: 2021/4/28  判断是否是管理员
     * @param smallPlant
     * @return
     */
    CommonResult<Integer> deleteSmallPlant(SmallPlant smallPlant);

    /**
     * 根据编号重启小型植物信息，修改enable和activity字段为true   restartSmallPlant
     * 判断是否是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param smallPlant
     * @return
     */
    CommonResult<Integer> restartSmallPlant(SmallPlant smallPlant);

    /**
     * 根据编号修改小型植物信息      updateSmallPlant
     * 判断是否是manager     // TODO: 2021/4/28  判断是否是管理员
     * @param smallPlant
     * @return
     */
    CommonResult<Integer> updateSmallPlant(SmallPlant smallPlant);

    /**
     * 查询小型植物表中的所有信息
     * @return
     */
    CommonResult<List<SmallPlant>> selSmallPlantList();

    /**
     * 通过编号查询小型信息
     * @param smallPlant
     * @return
     */
    CommonResult<List<SmallPlant>> selSmallPlantByCodeList(SmallPlant smallPlant);

    /**
     * 修改小型植物列表
     * @param smallPlant
     * @return
     */
    Integer updateSmallPlantList(SmallPlant smallPlant);
}
