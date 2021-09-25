package com.zhangtao.plant_conservation.service.plant_type.impl;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.mapper.PlantTypeMapper;
import com.zhangtao.plant_conservation.pojo.PlantType;
import com.zhangtao.plant_conservation.service.plant_type.PlantTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangtao
 * @date
 */
@Service
public class PlantTypeServiceImpl implements PlantTypeService {

    @Autowired
    private PlantTypeMapper plantTypeMapper;

    /**
     * 植物类型新增
     * @param plantType
     * @return
     */
    @Override
    public CommonResult<Integer> insPlantType(PlantType plantType) {
        //判断植物类型编号是否重复
        if(plantTypeMapper.checkPlantTypeCode(plantType) !=null){
            return CommonResult.failed("植物类型编号plantTypeCode重复");
        }

        //TODO:判断用户是否是管理员
        return CommonResult.success(plantTypeMapper.insPlantType(plantType));
    }

    /**
     * 植物类型禁用接口
     * @param plantType
     * @return
     */
    @Override
    public CommonResult<Integer> deletePlantType(PlantType plantType) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(plantTypeMapper.deletePlantType(plantType));
    }

    /**
     * 植物类型重启接口
     * @param plantType
     * @return
     */
    @Override
    public CommonResult<Integer> restartPlantType(PlantType plantType) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(plantTypeMapper.restartPlantType(plantType));
    }

    /**
     * 根据植物类型编号修改信息
     * @param plantType
     * @return
     */
    @Override
    public CommonResult<Integer> updatePlantType(PlantType plantType) {
        return CommonResult.success(plantTypeMapper.updatePlantType(plantType));
    }

    /**
     * 查询植物分类信息所有数据
     * @return
     */
    @Override
    public CommonResult<List<PlantType>> selPlantTypeList() {
        return CommonResult.success(plantTypeMapper.selPlantTypeList());
    }

    /**
     * 根据编号查询植物分类相关信息
     * @return
     */
    @Override
    public CommonResult<List<PlantType>> selPlantTypeByCodeList(PlantType plantType) {
        return CommonResult.success(plantTypeMapper.selPlantTypeByCodeList(plantType));
    }
}
