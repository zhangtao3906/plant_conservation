package com.zhangtao.plant_conservation.mapper;

import com.zhangtao.plant_conservation.pojo.PlantType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-15 18:01
 */
@Mapper
@Repository
public interface PlantTypeMapper {

    /**
     * 植物类型新增接口
     * @param plantType
     * @return
     */
    int insPlantType(@Param("plantType") PlantType plantType);

    /**
     * 检查植物类型编号是否重复
     * @param plantType
     * @return
     */
    PlantType checkPlantTypeCode(@Param("plantType") PlantType plantType);

    /**
     * 植物类型禁用接口
     * @param plantType
     * @return
     */
    int deletePlantType(@Param("plantType") PlantType plantType);

    /**
     * 植物类型重启接口
     * @param plantType
     * @return
     */
    int restartPlantType(@Param("plantType") PlantType plantType);

    /**
     * 植物类型根据编号修改接口
     * @param plantType
     * @return
     */
    int updatePlantType(@Param("plantType") PlantType plantType);

    /**
     * 查询植物分类的所有信息
     * @return
     */
    List<PlantType> selPlantTypeList();

    /**
     * 根据植物相关信息查询植物所有信息
     * plantCode,plantType,plantName,plantVarietyName,plantVarietyCode）
     * @param plantType
     * @return
     */
    List<PlantType> selPlantTypeByCodeList(@Param("plantType") PlantType plantType);

}
