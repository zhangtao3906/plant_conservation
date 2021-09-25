package com.zhangtao.plant_conservation.service.medium_plant.impl;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.mapper.MediumPlantMapper;
import com.zhangtao.plant_conservation.pojo.MediumPlant;
import com.zhangtao.plant_conservation.service.medium_plant.MediumPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
@Service
public class MediumPlantServiceImpl implements MediumPlantService {

    @Autowired
    private MediumPlantMapper mediumPlantMapper;

    /**
     * 中型植物新增接口
     * @param mediumPlant
     * @return
     */
    @Override
    public CommonResult<Integer> insMediumPlant(MediumPlant mediumPlant) {
        //判断多肉植物编号是否重复--如果编号重复，则code不为null
        if(mediumPlantMapper.checkMediumPlantCode(mediumPlant)!=null){
            return CommonResult.failed("中型植物编号mediumPlantCode重复");
        }

        //TODO:判断用户是否是管理员
        return CommonResult.success(mediumPlantMapper.insMediumPlant(mediumPlant));
    }

    /**
     * 中型植物禁用接口
     * @param mediumPlant
     * @return
     */
    @Override
    public CommonResult<Integer> deleteMediumPlant(MediumPlant mediumPlant) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(mediumPlantMapper.deleteMediumPlant(mediumPlant));
    }

    /**
     * 中型植物重启接口
     * @param mediumPlant
     * @return
     */
    @Override
    public CommonResult<Integer> restartMediumPlant(MediumPlant mediumPlant) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(mediumPlantMapper.restartMediumPlant(mediumPlant));
    }

    /**
     * 根据中型植物编号修改信息
     * @param mediumPlant
     * @return
     */
    @Override
    public CommonResult<Integer> updateMediumPlant(MediumPlant mediumPlant) {
        return CommonResult.success(mediumPlantMapper.updateMediumPlant(mediumPlant));
    }

    /**
     * 查询中型植物信息所有数据
     * @return
     */
    @Override
    public CommonResult<List<MediumPlant>> selMediumPlantList() {
        return CommonResult.success(mediumPlantMapper.selMediumPlantList());
    }

    /**
     * 根据编号查询中型植物相关信息
     * @param mediumPlant
     * @return
     */
    @Override
    public CommonResult<List<MediumPlant>> selMediumPlantByCodeList(MediumPlant mediumPlant) {
        return CommonResult.success(mediumPlantMapper.selMediumPlantByCodeList(mediumPlant));
    }
}
