package com.yao.yu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;


import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author yao
 * @since 2022-06-16
 */
@ApiModel(value = "Clazz对象", description = "")
public class Clazz implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer gradeId;

    private String name;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", gradeId=" + gradeId +
                ", name=" + name +
                ", remark=" + remark +
                "}";
    }
}
