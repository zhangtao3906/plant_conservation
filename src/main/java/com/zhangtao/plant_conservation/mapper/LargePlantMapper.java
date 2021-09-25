package com.zhangtao.plant_conservation.mapper;

import com.zhangtao.plant_conservation.pojo.LargePlant;
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
public interface LargePlantMapper {
    /**
     * 大型植物新增接口
     * @param largePlant
     * @return
     */
    int insLargePlant(@Param("largePlant") LargePlant largePlant);

    /**
     * 检查大型植物编号是否重复
     * @param largePlant
     * @return
     */
    LargePlant checkLargePlantCode(@Param("largePlant") LargePlant largePlant);

    /**
     * 大型植物禁用接口
     * @param largePlant
     * @return
     */
    int deleteLargePlant(@Param("largePlant") LargePlant largePlant);

    /**
     * 大型植物重启接口
     * @param largePlant
     * @return
     */
    int restartLargePlant(@Param("largePlant") LargePlant largePlant);

    /**
     * 根据大型植物编号修改信息
     * @param largePlant
     * @return
     */
    int updateLargePlant(@Param("largePlant") LargePlant largePlant);

    /**
     * 查询大型植物的所有信息
     * @return
     */
    List<LargePlant> selLargePlantList();

    /**
     * 根据大型植物编号查询植物所有信息
     * @param largePlant
     * @return
     */
    List<LargePlant> selLargePlantByCodeList(@Param("largePlant") LargePlant largePlant);
}
