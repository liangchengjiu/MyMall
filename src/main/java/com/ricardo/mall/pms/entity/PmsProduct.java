package com.ricardo.mall.pms.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

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
 * 商品信息
 *
 * @author Dawson·Ricardo
 * @since 2021-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel("商品信息")
@TableName("pms_product")
public class PmsProduct extends Model<PmsProduct> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty("")
    private Long id;

    @TableField("brand_id")
    @ApiModelProperty("")
    private Long brandId;

    @TableField("product_category_id")
    @ApiModelProperty("")
    private Long productCategoryId;

    @TableField("feight_template_id")
    @ApiModelProperty("")
    private Long feightTemplateId;

    @TableField("product_attribute_category_id")
    @ApiModelProperty("")
    private Long productAttributeCategoryId;

    @TableField("name")
    @ApiModelProperty("")
    private String name;

    @TableField("pic")
    @ApiModelProperty("")
    private String pic;

    /**
     * 货号
     */
    @TableField("product_sn")
    @ApiModelProperty("货号")
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @TableField("delete_status")
    @ApiModelProperty("删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    @TableField("publish_status")
    @ApiModelProperty("上架状态：0->下架；1->上架")
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    @TableField("new_status")
    @ApiModelProperty("新品状态:0->不是新品；1->新品")
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    @TableField("recommand_status")
    @ApiModelProperty("推荐状态；0->不推荐；1->推荐")
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    @TableField("verify_status")
    @ApiModelProperty("审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;

    /**
     * 排序
     */
    @TableField("sort")
    @ApiModelProperty("排序")
    private Integer sort;

    /**
     * 销量
     */
    @TableField("sale")
    @ApiModelProperty("销量")
    private Integer sale;

    @TableField("price")
    @ApiModelProperty("")
    private BigDecimal price;

    /**
     * 促销价格
     */
    @TableField("promotion_price")
    @ApiModelProperty("促销价格")
    private BigDecimal promotionPrice;

    /**
     * 赠送的成长值
     */
    @TableField("gift_growth")
    @ApiModelProperty("赠送的成长值")
    private Integer giftGrowth;

    /**
     * 赠送的积分
     */
    @TableField("gift_point")
    @ApiModelProperty("赠送的积分")
    private Integer giftPoint;

    /**
     * 限制使用的积分数
     */
    @TableField("use_point_limit")
    @ApiModelProperty("限制使用的积分数")
    private Integer usePointLimit;

    /**
     * 副标题
     */
    @TableField("sub_title")
    @ApiModelProperty("副标题")
    private String subTitle;

    /**
     * 商品描述
     */
    @TableField("description")
    @ApiModelProperty("商品描述")
    private String description;

    /**
     * 市场价
     */
    @TableField("original_price")
    @ApiModelProperty("市场价")
    private BigDecimal originalPrice;

    /**
     * 库存
     */
    @TableField("stock")
    @ApiModelProperty("库存")
    private Integer stock;

    /**
     * 库存预警值
     */
    @TableField("low_stock")
    @ApiModelProperty("库存预警值")
    private Integer lowStock;

    /**
     * 单位
     */
    @TableField("unit")
    @ApiModelProperty("单位")
    private String unit;

    /**
     * 商品重量，默认为克
     */
    @TableField("weight")
    @ApiModelProperty("商品重量，默认为克")
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    @TableField("preview_status")
    @ApiModelProperty("是否为预告商品：0->不是；1->是")
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    @TableField("service_ids")
    @ApiModelProperty("以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String serviceIds;

    @TableField("keywords")
    @ApiModelProperty("")
    private String keywords;

    @TableField("note")
    @ApiModelProperty("")
    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    @TableField("album_pics")
    @ApiModelProperty("画册图片，连产品图片限制为5张，以逗号分割")
    private String albumPics;

    @TableField("detail_title")
    @ApiModelProperty("")
    private String detailTitle;

    @TableField("detail_desc")
    @ApiModelProperty("")
    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    @TableField("detail_html")
    @ApiModelProperty("产品详情网页内容")
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    @TableField("detail_mobile_html")
    @ApiModelProperty("移动端网页详情")
    private String detailMobileHtml;

    /**
     * 促销开始时间
     */
    @TableField("promotion_start_time")
    @ApiModelProperty("促销开始时间")
    private Date promotionStartTime;

    /**
     * 促销结束时间
     */
    @TableField("promotion_end_time")
    @ApiModelProperty("促销结束时间")
    private Date promotionEndTime;

    /**
     * 活动限购数量
     */
    @TableField("promotion_per_limit")
    @ApiModelProperty("活动限购数量")
    private Integer promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    @TableField("promotion_type")
    @ApiModelProperty("促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotionType;

    /**
     * 品牌名称
     */
    @TableField("brand_name")
    @ApiModelProperty("品牌名称")
    private String brandName;

    /**
     * 商品分类名称
     */
    @TableField("product_category_name")
    @ApiModelProperty("商品分类名称")
    private String productCategoryName;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
