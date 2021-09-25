package com.zhangtao.plant_conservation.service.medium_plant;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.MediumPlant;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
public interface MediumPlantService {

    /**
     * 单数据创建中型植物信息                insMediumPlant
     * 确保植物编号没有重复                  checkMediumPlant
     * 确保操作人员是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param mediumPlant
     * @return
     */
    CommonResult<Integer> insMediumPlant(MediumPlant mediumPlant);

    /**
     * 根据编号删除中型植物信息，修改enable和activity字段为false   deleteMediumPlant
     * 判断是否是manager       // TODO: 2021/4/28  判断是否是管理员
     * @param mediumPlant
     * @return
     */
    CommonResult<Integer> deleteMediumPlant(MediumPlant mediumPlant);

    /**
     * 根据编号重启中型植物信息，修改enable和activity字段为true   restartMediumPlant
     * 判断是否是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param mediumPlant
     * @return
     */
    CommonResult<Integer> restartMediumPlant(MediumPlant mediumPlant);

    /**
     * 根据编号修改中型植物信息      updateMediumPlant
     * 判断是否是manager     // TODO: 2021/4/28  判断是否是管理员
     * @param mediumPlant
     * @return
     */
    CommonResult<Integer> updateMediumPlant(MediumPlant mediumPlant);

    /**
     * 查询中型植物表中的所有信息
     * @return
     */
    CommonResult<List<MediumPlant>> selMediumPlantList();

    /**
     * 通过编号查询中型信息
     * @param mediumPlant
     * @return
     */
    CommonResult<List<MediumPlant>> selMediumPlantByCodeList(MediumPlant mediumPlant);
}
