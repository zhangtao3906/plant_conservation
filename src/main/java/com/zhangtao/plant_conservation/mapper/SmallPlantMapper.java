package com.zhangtao.plant_conservation.mapper;

import com.zhangtao.plant_conservation.pojo.SmallPlant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */

@Mapper
@Repository
public interface SmallPlantMapper {
    /**
     * 小型植物新增接口
     * @param smallPlant
     * @return
     */
    int insSmallPlant(@Param("smallPlant") SmallPlant smallPlant);

    /**
     * 检查小型植物编号是否重复
     * @param smallPlant
     * @return
     */
    SmallPlant checkSmallPlantCode(@Param("smallPlant") SmallPlant smallPlant);

    /**
     * 小型植物禁用接口
     * @param smallPlant
     * @return
     */
    int deleteSmallPlant(@Param("smallPlant") SmallPlant smallPlant);

    /**
     * 小型植物重启接口
     * @param smallPlant
     * @return
     */
    int restartSmallPlant(@Param("smallPlant") SmallPlant smallPlant);

    /**
     * 根据小型植物编号修改信息
     * @param smallPlant
     * @return
     */
    int updateSmallPlant(@Param("smallPlant") SmallPlant smallPlant);

    /**
     * 查询小型植物的所有信息
     * @return
     */
    List<SmallPlant> selSmallPlantList();

    /**
     * 根据小型植物编号查询植物所有信息
     * @param smallPlant
     * @return
     */
    List<SmallPlant> selSmallPlantByCodeList(@Param("smallPlant") SmallPlant smallPlant);

    /**
     * 添加小型植物列表
     * @param smallPlant
     * @return
     */
    int updateSmallPlantList(@Param("smallPlant") SmallPlant smallPlant);
}
