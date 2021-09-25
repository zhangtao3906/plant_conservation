package com.zhangtao.plant_conservation.service.user;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.mapper.UserMapper;
import com.zhangtao.plant_conservation.pojo.SucculentPlant;
import com.zhangtao.plant_conservation.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
public interface UserService {

    /**
     * 单数据创建用户信息                    insUser
     * 确保用户编号没有重复                  checkUser
     * 确保操作人员是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param user
     * @return
     */
    CommonResult<Integer> insUser(User user);

    /**
     * 根据编号删除用户，修改enable和activity字段为false   deleteUser
     * 判断是否是manager       // TODO: 2021/4/28  判断是否是管理员
     * @param user
     * @return
     */
    CommonResult<Integer> deleteUser(User user);

    /**
     * 根据编号重启用户，修改enable和activity字段为true   restartUser
     * 判断是否是manager   // TODO: 2021/4/28  判断是否是管理员
     * @param user
     * @return
     */
    CommonResult<Integer> restartUser(User user);

    /**
     * 根据编号修改用户信息      updateUser
     * 判断是否是manager     // TODO: 2021/4/28  判断是否是管理员
     * @param user
     * @return
     */
    CommonResult<Integer> updateUser(User user);

    /**
     * 查询用户中的所有信息
     * @return
     */
    CommonResult<List<User>> selUserList();

    /**
     * 通过编号查询用户
     * @param user
     * @return
     */
    CommonResult<List<User>> selUserByCodeList(User user);

}
