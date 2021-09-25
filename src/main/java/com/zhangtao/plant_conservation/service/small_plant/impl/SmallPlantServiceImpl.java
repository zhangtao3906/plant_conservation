package com.zhangtao.plant_conservation.service.small_plant.impl;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.mapper.SmallPlantMapper;
import com.zhangtao.plant_conservation.pojo.SmallPlant;
import com.zhangtao.plant_conservation.service.small_plant.SmallPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
@Service
public class SmallPlantServiceImpl implements SmallPlantService {

    @Autowired
    private SmallPlantMapper smallPlantMapper;

    /**
     * 小型植物新增接口
     * @param smallPlant
     * @return
     */
    @Override
    public CommonResult<Integer> insSmallPlant(SmallPlant smallPlant) {
        //判断多肉植物编号是否重复--如果编号重复，则code不为null
        if(smallPlantMapper.checkSmallPlantCode(smallPlant)!=null){
            return CommonResult.failed("多肉编号smallPlantCode重复");
        }

        //TODO:判断用户是否是管理员
        return CommonResult.success(smallPlantMapper.insSmallPlant(smallPlant));
    }

    /**
     * 小型植物禁用接口
     * @param smallPlant
     * @return
     */
    @Override
    public CommonResult<Integer> deleteSmallPlant(SmallPlant smallPlant) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(smallPlantMapper.deleteSmallPlant(smallPlant));
    }

    /**
     * 小型植物重启接口
     * @param smallPlant
     * @return
     */
    @Override
    public CommonResult<Integer> restartSmallPlant(SmallPlant smallPlant) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(smallPlantMapper.restartSmallPlant(smallPlant));
    }

    /**
     * 根据小型植物编号修改信息
     * @param smallPlant
     * @return
     */
    @Override
    public CommonResult<Integer> updateSmallPlant(SmallPlant smallPlant) {
        return CommonResult.success(smallPlantMapper.updateSmallPlant(smallPlant));
    }

    /**
     * 查询小型植物信息所有数据
     * @return
     */
    @Override
    public CommonResult<List<SmallPlant>> selSmallPlantList() {
        return CommonResult.success(smallPlantMapper.selSmallPlantList());
    }

    /**
     * 根据编号查询小型植物相关信息
     * @param smallPlant
     * @return
     */
    @Override
    public CommonResult<List<SmallPlant>> selSmallPlantByCodeList(SmallPlant smallPlant) {
        return CommonResult.success(smallPlantMapper.selSmallPlantByCodeList(smallPlant));
    }

    @Override
    public Integer updateSmallPlantList(SmallPlant smallPlant) {
        return smallPlantMapper.updateSmallPlantList(smallPlant);
    }
}
