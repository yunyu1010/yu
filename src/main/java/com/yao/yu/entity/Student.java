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
@ApiModel(value = "Student对象", description = "")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

//    @TableId(value = "clazz_id")
    private Integer clazzId;

    private String sn;

    private String username;

    private String password;

    private String sex;

    private String photo;

    private String remark;

    public Student() {
    }

    public Student(Integer id, Integer clazzId, String sn, String username, String password, String sex, String photo, String remark) {
        this.id = id;
        this.clazzId = clazzId;
        this.sn = sn;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.photo = photo;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", clazzId=" + clazzId +
                ", sn=" + sn +
                ", username=" + username +
                ", password=" + password +
                ", sex=" + sex +
                ", photo=" + photo +
                ", remark=" + remark +
                "}";
    }
}
