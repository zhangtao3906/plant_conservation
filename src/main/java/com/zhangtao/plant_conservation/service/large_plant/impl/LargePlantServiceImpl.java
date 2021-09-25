package com.zhangtao.plant_conservation.service.large_plant.impl;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.mapper.LargePlantMapper;
import com.zhangtao.plant_conservation.pojo.LargePlant;
import com.zhangtao.plant_conservation.service.large_plant.LargePlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
@Service
public class LargePlantServiceImpl implements LargePlantService {

    @Autowired
    private LargePlantMapper largePlantMapper;

    /**
     * 大型植物新增接口
     * @param largePlant
     * @return
     */
    @Override
    public CommonResult<Integer> insLargePlant(LargePlant largePlant) {
        //判断多肉植物编号是否重复--如果编号重复，则code不为null
        if(largePlantMapper.checkLargePlantCode(largePlant)!=null){
            return CommonResult.failed("大型植物编号largePlantCode重复");
        }

        //TODO:判断用户是否是管理员
        return CommonResult.success(largePlantMapper.insLargePlant(largePlant));
    }

    /**
     * 大型植物禁用接口
     * @param largePlant
     * @return
     */
    @Override
    public CommonResult<Integer> deleteLargePlant(LargePlant largePlant) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(largePlantMapper.deleteLargePlant(largePlant));
    }

    /**
     * 大型植物重启接口
     * @param largePlant
     * @return
     */
    @Override
    public CommonResult<Integer> restartLargePlant(LargePlant largePlant) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(largePlantMapper.restartLargePlant(largePlant));
    }

    /**
     * 根据大型植物编号修改信息
     * @param largePlant
     * @return
     */
    @Override
    public CommonResult<Integer> updateLargePlant(LargePlant largePlant) {
        return CommonResult.success(largePlantMapper.updateLargePlant(largePlant));
    }

    /**
     * 查询大型植物信息所有数据
     * @return
     */
    @Override
    public CommonResult<List<LargePlant>> selLargePlantList() {
        return CommonResult.success(largePlantMapper.selLargePlantList());
    }

    /**
     * 根据编号查询大型植物相关信息
     * @param largePlant
     * @return
     */
    @Override
    public CommonResult<List<LargePlant>> selLargePlantByCodeList(LargePlant largePlant) {
        return CommonResult.success(largePlantMapper.selLargePlantByCodeList(largePlant));
    }
}
