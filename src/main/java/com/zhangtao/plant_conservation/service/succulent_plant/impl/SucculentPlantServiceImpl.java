package com.zhangtao.plant_conservation.service.succulent_plant.impl;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.mapper.SucculentPlantMapper;
import com.zhangtao.plant_conservation.pojo.SucculentPlant;
import com.zhangtao.plant_conservation.service.succulent_plant.SucculentPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-27 22:52
 */
@Service
public class SucculentPlantServiceImpl implements SucculentPlantService {

    @Autowired
    private SucculentPlantMapper succulentPlantMapper;

    /**
     * 多肉植物新增接口
     * @param succulentPlant
     * @return
     */
    @Override
    public CommonResult<Integer> insSucculentPlant(SucculentPlant succulentPlant) {
        //判断多肉植物编号是否重复--如果编号重复，则code不为null
        if(succulentPlantMapper.checkSucculentPlantCode(succulentPlant)!=null){
            return CommonResult.failed("多肉编号succulentPlantCode重复");
        }

        //TODO:判断用户是否是管理员
        return CommonResult.success(succulentPlantMapper.insSucculentPlant(succulentPlant));
    }

    /**
     * 多肉植物禁用接口
     * @param succulentPlant
     * @return
     */
    @Override
    public CommonResult<Integer> deleteSucculentPlant(SucculentPlant succulentPlant) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(succulentPlantMapper.deleteSucculentPlant(succulentPlant));
    }

    /**
     * 植物类型重启接口
     * @param succulentPlant
     * @return
     */
    @Override
    public CommonResult<Integer> restartSucculentPlant(SucculentPlant succulentPlant) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(succulentPlantMapper.restartSucculentPlant(succulentPlant));
    }

    /**
     * 根据多肉植物编号修改信息
     * @param succulentPlant
     * @return
     */
    @Override
    public CommonResult<Integer> updateSucculentPlant(SucculentPlant succulentPlant) {
        return CommonResult.success(succulentPlantMapper.updateSucculentPlant(succulentPlant));
    }

    /**
     * 查询多肉植物信息所有数据
     * @return
     */
    @Override
    public CommonResult<List<SucculentPlant>> selSucculentPlantList() {
        return CommonResult.success(succulentPlantMapper.selSucculentPlantList());
    }

    /**
     * 根据编号查询多肉植物相关信息
     * @return
     */
    @Override
    public CommonResult<List<SucculentPlant>> selSucculentPlantByCodeList(SucculentPlant succulentPlant) {
        return CommonResult.success(succulentPlantMapper.selSucculentPlantByCodeList(succulentPlant));
    }
}
