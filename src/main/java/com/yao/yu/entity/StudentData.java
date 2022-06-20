package com.yao.yu.entity;

import lombok.Data;

import java.util.List;

/**
 * @author yaozhan
 */
@Data
public class StudentData {

    private Integer code;

    private String msg;

    private Integer count;

    private List<Student> data;
}
