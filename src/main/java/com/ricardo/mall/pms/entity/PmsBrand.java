package com.ricardo.mall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author Dawson·Ricardo
 * @since 2021-03-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("pms_brand")
public class PmsBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    /**
     * 首字母
     */
    @TableField("first_letter")
    private String firstLetter;

    @TableField("sort")
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @TableField("factory_status")
    private Integer factoryStatus;

    @TableField("show_status")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @TableField("product_count")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @TableField("product_comment_count")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    @TableField("logo")
    private String logo;

    /**
     * 专区大图
     */
    @TableField("big_pic")
    private String bigPic;

    /**
     * 品牌故事
     */
    @TableField("brand_story")
    private String brandStory;


}
