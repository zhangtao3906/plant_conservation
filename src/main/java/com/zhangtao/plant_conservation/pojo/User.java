package com.zhangtao.plant_conservation.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangtao
 * @date 2021-4-23 23:39
 */
@Data
public class User {

  @ApiModelProperty(value = "ID")
  private long id;
  @ApiModelProperty(value = "用户编号")
  private String userCode;
  @ApiModelProperty(value = "用户姓名")
  private String userName;
  @ApiModelProperty(value = "用户性别：0是女生，1是男生")
  private long sex;
  @ApiModelProperty(value = "用户头像")
  private String userAvatar;
  @ApiModelProperty(value = "联系方式")
  private String phone;
  @ApiModelProperty(value = "用户收货地址")
  private String address;
  @ApiModelProperty(value = "小程序唯一标识符")
  private String miniOpenId;
  @ApiModelProperty(value = "微信公众号唯一识别号")
  private String wxOpenId;
  @ApiModelProperty(value = "是否启用 true-启用  false-禁用")
  private boolean enable;
  @ApiModelProperty(value = "是否删除  True-未删除  False-已删除")
  private boolean activity;
  @ApiModelProperty(value = "创建人编号")
  private String createrCode;
  @ApiModelProperty(value = "创建时间")
  private java.sql.Timestamp addTime;
  @ApiModelProperty(value = "最近修改时间")
  private java.sql.Timestamp updateTime;

}
