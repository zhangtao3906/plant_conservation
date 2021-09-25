package com.zhangtao.plant_conservation.mapper;

import com.zhangtao.plant_conservation.pojo.User;
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
public interface UserMapper {
    /**
     * 用户新增接口
     * @param user
     * @return
     */
    int insUser(@Param("user") User user);

    /**
     * 检查用户编号是否重复
     * @param user
     * @return
     */
    User checkUserCode(@Param("user") User user);

    /**
     * 用户禁用接口
     * @param user
     * @return
     */
    int deleteUser(@Param("user") User user);

    /**
     * 用户重启接口
     * @param user
     * @return
     */
    int restartUser(@Param("user") User user);

    /**
     * 根据用户编号修改信息
     * @param user
     * @return
     */
    int updateUser(@Param("user") User user);

    /**
     * 查询所有用户的所有信息
     * @return
     */
    List<User> selUserList();

    /**
     * 根据用户编号查询用户所有信息
     * @param user
     * @return
     */
    List<User> selUserByCodeList(@Param("user") User user);
}
