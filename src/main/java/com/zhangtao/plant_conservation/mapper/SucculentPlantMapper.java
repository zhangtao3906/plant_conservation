package com.zhangtao.plant_conservation.mapper;

import com.zhangtao.plant_conservation.pojo.SucculentPlant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-27 21:06
 */
@Mapper
@Repository
public interface SucculentPlantMapper {

    /**
     * 多肉植物新增接口
     * @param succulentPlant
     * @return
     */
    int insSucculentPlant(@Param("succulentPlant") SucculentPlant succulentPlant);

    /**
     * 检查多肉植物编号是否重复
     * @param succulentPlant
     * @return
     */
    SucculentPlant checkSucculentPlantCode(@Param("succulentPlant") SucculentPlant succulentPlant);

    /**
     * 多肉植物禁用接口
     * @param succulentPlant
     * @return
     */
    int deleteSucculentPlant(@Param("succulentPlant") SucculentPlant succulentPlant);

    /**
     * 多肉植物重启接口
     * @param succulentPlant
     * @return
     */
    int restartSucculentPlant(@Param("succulentPlant") SucculentPlant succulentPlant);

    /**
     * 根据多肉植物编号修改信息
     * @param succulentPlant
     * @return
     */
    int updateSucculentPlant(@Param("succulentPlant") SucculentPlant succulentPlant);

    /**
     * 查询多肉植物的所有信息
     * @return
     */
    List<SucculentPlant> selSucculentPlantList();

    /**
     * 根据多肉植物编号查询植物所有信息
     * @param succulentPlant
     * @return
     */
    List<SucculentPlant> selSucculentPlantByCodeList(@Param("succulentPlant") SucculentPlant succulentPlant);

}
