package com.zhangtao.plant_conservation.mapper;

import com.zhangtao.plant_conservation.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangtao
 * :@date 2021-4-29
 */
@Mapper
@Repository
public interface ManagerMapper {

    /**
     * 管理员新增接口
     * @param manager
     * @return
     */
    int insManager(@Param("manager") Manager manager);

    /**
     * 检查管理员编号是否重复
     * @param manager
     * @return
     */
    Manager checkManagerCode(@Param("manager") Manager manager);

    /**
     * 管理员禁用接口
     * @param manager
     * @return
     */
    int deleteManager(@Param("manager") Manager manager);

    /**
     * 管理员重启接口
     * @param manager
     * @return
     */
    int restartManager(@Param("manager") Manager manager);

    /**
     * 根据管理员编号修改信息
     * @param manager
     * @return
     */
    int updateManager(@Param("manager") Manager manager);

    /**
     * 查询管理员的所有信息
     * @return
     */
    List<Manager> selManagerList();

    /**
     * 根据管理员编号查询用户所有信息
     * @param manager
     * @return
     */
    List<Manager> selManagerByCodeList(@Param("Manager") Manager manager);
}
