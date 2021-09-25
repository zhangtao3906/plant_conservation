package com.zhangtao.plant_conservation.service.plant_type;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.PlantType;

import java.util.List;

/**
 * @author zhangtao
 * @date
 */
public interface PlantTypeService {

    /**
     * 向植物类型表中插入数据           insPlantType
     * 判断植物类型编号是否重复         checkPlantTypeCode
     * 判断是否是manager         // TODO: 2021/4/28  判断是否是管理员
     * @param plantType
     * @return
     */
    CommonResult<Integer> insPlantType(PlantType plantType);

    /**
     * 根据编号删除植物类型信息，修改enable和activity字段为false   deletePlantType
     * 判断是否是manager       // TODO: 2021/4/28  判断是否是管理员
     * @param plantType
     * @return
     */
    CommonResult<Integer> deletePlantType(PlantType plantType);

    /**
     * 根据编号重启植物类型信息，修改enable和activity字段为true   restartPlantType
     * 判断是否是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param plantType
     * @return
     */
    CommonResult<Integer> restartPlantType(PlantType plantType);

    /**
     * 根据编号修改植物信息       updatePlantType
     * 判断是否是manager     // TODO: 2021/4/28  判断是否是管理员
     * @param plantType
     * @return
     */
    CommonResult<Integer> updatePlantType(PlantType plantType);

    /**
     * 查询植物分类信息表中的所有信息
     * @return
     */
    CommonResult<List<PlantType>> selPlantTypeList();

    /**
     * 通过编号查询植物分类信息
     * @param plantType
     * @return
     */
    CommonResult<List<PlantType>> selPlantTypeByCodeList(PlantType plantType);
}
