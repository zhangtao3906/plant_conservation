package com.zhangtao.plant_conservation.controller;

import com.zhangtao.plant_conservation.common.CommonResult;
import com.zhangtao.plant_conservation.pojo.User;
import com.zhangtao.plant_conservation.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangtao
 * @date 2021-4-29 13:46
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户新增接口
     * @param user
     * @return
     */
    @ApiOperation("大型植物新增")
    @PostMapping(value = "/insUser",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> insUser(@RequestBody User user){
        log.info("返回的json报文[{}]" + user.toString());
        return userService.insUser(user);
    }

    /**
     * 用户删除接口
     * @param user
     * @return
     */
    @ApiOperation("用户删除接口")
    @PostMapping(value = "/deleteUser",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> deleteUser(@RequestBody User user){
        log.info("返回的json报文[{}]" + user.toString());
        return userService.deleteUser(user);
    }

    /**
     * 用户重启接口
     * @param user
     * @return
     */
    @ApiOperation("大型植物重启")
    @PostMapping(value = "/restartUser",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> restartUser(@RequestBody User user){
        log.info("返回的json报文[{}]" + user.toString());
        return userService.restartUser(user);
    }

    /**
     * 根据用户编号修改信息
     * @param user
     * @return
     */
    @ApiOperation("大型植物修改")
    @PostMapping(value = "/updateUser",produces = "application/json;charset=UTF-8")
    public CommonResult<Integer> updateUser(@RequestBody User user){
        log.info("返回的json报文[{}]" + user.toString());
        return userService.updateUser(user);
    }

    /**
     * 展示所有的用户信息
     * @return
     */
    @ApiOperation("查询大型植物信息列表")
    @PostMapping(value = "/selUserList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<User>> selLargePlantList(){
        return userService.selUserList();
    }

    /**
     * 根据条件查询用户信息
     * @param user
     * @return
     */
    @ApiOperation("根据条件查询用户信息")
    @PostMapping(value = "/selUserByCodeList",produces = "application/json;charset=UTF-8")
    public CommonResult<List<User>> selUserByCodeList(@RequestBody User user){
        log.info("返回的json报文[{}]" + user.toString());
        return userService.selUserByCodeList(user);
    }

}
