package com.zhangtao.plant_conservation.service.user.impl;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.mapper.UserMapper;
import com.zhangtao.plant_conservation.pojo.User;
import com.zhangtao.plant_conservation.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户新增接口
     * @param user
     * @return
     */
    @Override
    public CommonResult<Integer> insUser(User user) {
        //判断用户编号是否重复--如果编号重复，则code不为null
        if(userMapper.checkUserCode(user)!=null){
            return CommonResult.failed("用户编号userCode重复");
        }

        //TODO:判断用户是否是管理员
        return CommonResult.success(userMapper.insUser(user));
    }

    /**
     * 用户删除接口
     * @param user
     * @return
     */
    @Override
    public CommonResult<Integer> deleteUser(User user) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(userMapper.deleteUser(user));
    }

    /**
     * 用户重启接口
     * @param user
     * @return
     */
    @Override
    public CommonResult<Integer> restartUser(User user) {
        //TODO:判断用户是否是管理员
        return CommonResult.success(userMapper.restartUser(user));
    }

    /**
     * 用户修改接口
     * @param user
     * @return
     */
    @Override
    public CommonResult<Integer> updateUser(User user) {
        return CommonResult.success(userMapper.updateUser(user));
    }

    /**
     * 用户查询接口
     * @return
     */
    @Override
    public CommonResult<List<User>> selUserList() {
        return CommonResult.success(userMapper.selUserList());
    }

    /**
     * 用户编号查询接口
     * @param user
     * @return
     */
    @Override
    public CommonResult<List<User>> selUserByCodeList(User user) {
        return CommonResult.success(userMapper.selUserByCodeList(user));
    }
}
