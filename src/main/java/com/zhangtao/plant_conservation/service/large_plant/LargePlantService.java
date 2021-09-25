package com.zhangtao.plant_conservation.service.large_plant;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.LargePlant;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
public interface LargePlantService {

    /**
     * 单数据创建大型植物信息                insLargePlant
     * 确保植物编号没有重复                  checkLargePlant
     * 确保操作人员是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param largePlant
     * @return
     */
    CommonResult<Integer> insLargePlant(LargePlant largePlant);

    /**
     * 根据编号删除大型植物信息，修改enable和activity字段为false   deleteLargePlant
     * 判断是否是manager       // TODO: 2021/4/28  判断是否是管理员
     * @param largePlant
     * @return
     */
    CommonResult<Integer> deleteLargePlant(LargePlant largePlant);

    /**
     * 根据编号重启大型植物信息，修改enable和activity字段为true   restartLargePlant
     * 判断是否是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param largePlant
     * @return
     */
    CommonResult<Integer> restartLargePlant(LargePlant largePlant);

    /**
     * 根据编号修改大型植物信息      updateLargePlant
     * 判断是否是manager     // TODO: 2021/4/28  判断是否是管理员
     * @param largePlant
     * @return
     */
    CommonResult<Integer> updateLargePlant(LargePlant largePlant);

    /**
     * 查询大型植物表中的所有信息    selLargePlantList
     * @return
     */
    CommonResult<List<LargePlant>> selLargePlantList();

    /**
     * 通过编号查询大型植物信息     selLargePlantByCodeList
     * @param largePlant
     * @return
     */
    CommonResult<List<LargePlant>> selLargePlantByCodeList(LargePlant largePlant);
}
