package com.zhangtao.plant_conservation.pojo;


import io.swagger.annotations.ApiModelProperty;

/**
 * @author zhangtao
 * @date 2021-4-29
 */
public class Manager {

  @ApiModelProperty(value = "ID")
  private long id;
  @ApiModelProperty(value = "管理员编号")
  private String managerCode;
  @ApiModelProperty(value = "管理员姓名")
  private String managerName;
  @ApiModelProperty(value = "管理员密码")
  private String managerPassowrd;
  @ApiModelProperty(value = "是否是管理员:true-是，false-不是")
  private String isManager;
  @ApiModelProperty(value = "是否启用：true-启用，false-废弃")
  private boolean enable;
  @ApiModelProperty(value = "是否删除：true-未删除，false=已删除")
  private boolean activity;
  @ApiModelProperty(value = "创建人编号")
  private String createrCode;
  @ApiModelProperty(value = "创建时间")
  private java.sql.Timestamp addTime;
  @ApiModelProperty(value = "最近修改时间")
  private java.sql.Timestamp updateTime;

}
