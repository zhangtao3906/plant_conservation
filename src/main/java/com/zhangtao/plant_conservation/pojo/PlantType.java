package com.zhangtao.plant_conservation.pojo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangtao
 * @date 2021-4-23 23:39
 */
@Data
public class PlantType {

  @ApiModelProperty(value = "ID编号")
  private long id;
  @ApiModelProperty(value = "植物种类编号：0是多肉植物，1是小型植物，2是中型植物，3是大型植物")
  private int plantTypeCode;
  @ApiModelProperty(value = "植物种类名称")
  private String plantTypeName;
  @ApiModelProperty(value = "是否启用 true-启用  false-禁用")
  private boolean enable;
  @ApiModelProperty(value = "是否删除  True-未删除  False-已删除")
  private boolean activity;
  @ApiModelProperty(value = "创建人编号")
  private String createrCode;
  @ApiModelProperty(value = "创建时间")
  private String addTime;
  @ApiModelProperty(value = "最近修改时间")
  private String updateTime;

}
