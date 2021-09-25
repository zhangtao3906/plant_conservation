package com.zhangtao.plant_conservation.mapper;

import com.zhangtao.plant_conservation.pojo.MediumPlant;
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
public interface MediumPlantMapper {
    /**
     * 中型植物新增接口
     * @param mediumPlant
     * @return
     */
    int insMediumPlant(@Param("mediumPlant") MediumPlant mediumPlant);

    /**
     * 检查中型植物编号是否重复
     * @param mediumPlant
     * @return
     */
    MediumPlant checkMediumPlantCode(@Param("mediumPlant") MediumPlant mediumPlant);

    /**
     * 中型植物禁用接口
     * @param mediumPlant
     * @return
     */
    int deleteMediumPlant(@Param("mediumPlant") MediumPlant mediumPlant);

    /**
     * 中型植物重启接口
     * @param mediumPlant
     * @return
     */
    int restartMediumPlant(@Param("mediumPlant") MediumPlant mediumPlant);

    /**
     * 根据中型植物编号修改信息
     * @param mediumPlant
     * @return
     */
    int updateMediumPlant(@Param("mediumPlant") MediumPlant mediumPlant);

    /**
     * 查询中型植物的所有信息
     * @return
     */
    List<MediumPlant> selMediumPlantList();

    /**
     * 根据中型植物编号查询植物所有信息
     * @param mediumPlant
     * @return
     */
    List<MediumPlant> selMediumPlantByCodeList(@Param("mediumPlant") MediumPlant mediumPlant);
}
