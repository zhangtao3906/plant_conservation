package com.zhangtao.plant_conservation.service.succulent_plant;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.SucculentPlant;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-27 22:49
 */
public interface SucculentPlantService {

    /**
     * 单数据创建多肉植物信息                insSucculentPlant
     * 确保植物编号没有重复                  checkSucculentPlant
     * 确保操作人员是manager   // TODO: 2021/4/28  判断是否是管理员 
     * @param succulentPlant
     * @return
     */
    CommonResult<Integer> insSucculentPlant(SucculentPlant succulentPlant);

    /**
     * 根据编号删除多肉植物信息，修改enable和activity字段为false   deleteSucculentPlant
     * 判断是否是manager       // TODO: 2021/4/28  判断是否是管理员
     * @param succulentPlant
     * @return
     */
    CommonResult<Integer> deleteSucculentPlant(SucculentPlant succulentPlant);

    /**
     * 根据编号重启多肉植物信息，修改enable和activity字段为true   restartSucculentPlant
     * 判断是否是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param succulentPlant
     * @return
     */
    CommonResult<Integer> restartSucculentPlant(SucculentPlant succulentPlant);

    /**
     * 根据编号修改多肉植物信息      updateSucculentPlant
     * 判断是否是manager     // TODO: 2021/4/28  判断是否是管理员
     * @param succulentPlant
     * @return
     */
    CommonResult<Integer> updateSucculentPlant(SucculentPlant succulentPlant);

    /**
     * 查询多肉植物表中的所有信息
     * @return
     */
    CommonResult<List<SucculentPlant>> selSucculentPlantList();

    /**
     * 通过编号查询多肉信息
     * @param succulentPlant
     * @return
     */
    CommonResult<List<SucculentPlant>> selSucculentPlantByCodeList(SucculentPlant succulentPlant);

}
