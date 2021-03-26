package com.ricardo.mall.pms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 品牌表
 *
 * @author Dawson·Ricardo
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("品牌表")
@TableName("pms_brand")
public class PmsBrand extends Model<PmsBrand> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("")
    private Long id;

    @TableField("name")
    @ApiModelProperty("")
    private String name;

    /**
     * 首字母
     */
    @TableField("first_letter")
    @ApiModelProperty("首字母")
    private String firstLetter;

    @TableField("sort")
    @ApiModelProperty("")
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @TableField("factory_status")
    @ApiModelProperty("是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    @TableField("show_status")
    @ApiModelProperty("")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @TableField("product_count")
    @ApiModelProperty("产品数量")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @TableField("product_comment_count")
    @ApiModelProperty("产品评论数量")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    @TableField("logo")
    @ApiModelProperty("品牌logo")
    private String logo;

    /**
     * 专区大图
     */
    @TableField("big_pic")
    @ApiModelProperty("专区大图")
    private String bigPic;

    /**
     * 品牌故事
     */
    @TableField("brand_story")
    @ApiModelProperty("品牌故事")
    private String brandStory;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
