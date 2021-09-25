package com.zhangtao.plant_conservation.pojo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangtao
 * @date 2021-4-23 23:39
 */
@Data
public class LargePlant {

  @ApiModelProperty(value = "编号ID")
  private long id;
  @ApiModelProperty(value = "植物种类编号：0是多肉植物，1是小型植物，2是中型植物，3是大型植物")
  private long plantTypeCode;
  @ApiModelProperty(value = "植物种类名称")
  private String plantTypeName;
  @ApiModelProperty(value = "大型植物名称")
  private String largePlantName;
  @ApiModelProperty(value = "大型植物编号")
  private String largePlantCode;
  @ApiModelProperty(value = "大型植物图片")
  private String largePlantImage;
  @ApiModelProperty(value = "植物价格---暂时不启用")
  private double plantPrice;
  @ApiModelProperty(value = "植物的功能，作用，影响")
  private String plantFunction;
  @ApiModelProperty(value = "植物的生长环境：其中0是水生植物，1是土生植物")
  private long growingEnvironment;
  @ApiModelProperty(value = "植物的养护方法")
  private String conservationMethod;
  @ApiModelProperty(value = "是否启用：true-启用，false-废弃")
  private boolean enable;
  @ApiModelProperty(value = "是否删除：true-未删除，false=已删除")
  private boolean activity;
  @ApiModelProperty(value = "创建人编号")
  private String createrCode;
  @ApiModelProperty(value = "创建时间")
  private String addTime;
  @ApiModelProperty(value = "最近修改时间")
  private String updateTime;

}
