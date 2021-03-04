/**
 * Copyright (C) 2018-2020
 * All rights reserved, Designed By www.yixiang.co
 * 注意：
 * 本软件为www.yixiang.co开发研制
 */
package co.yixiang.modules.shop.domain;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author hupeng
 * @date 2020-05-12
 */

@Data
@TableName("yx_system_user_level")
public class YxSystemUserLevel implements Serializable {

    @TableId
    private Integer id;


    /** 会员名称 */
    @NotBlank(message = "名称必填")
    private String name;


    /** 购买金额 */
    @NotNull(message = "请输入充值金额")
    private BigDecimal money;


    /** 会员等级 */
    @NotNull(message = "请输入会员等级")
    private Integer level;


    /** 享受折扣 */
    @NotNull(message = "请输入会员折扣")
    private BigDecimal discount;


    /** 说明 */
    @TableField(value = "`explain`")
    private String explain;


    /** 添加时间 */
    @TableField(fill = FieldFill.INSERT)
    private Integer addTime;


    public void copy(YxSystemUserLevel source) {
        BeanUtil.copyProperties(source, this, CopyOptions.create().setIgnoreNullValue(true));
    }
}
