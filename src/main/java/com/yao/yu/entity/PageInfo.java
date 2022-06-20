package com.yao.yu.entity;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @author yaozhan
 */
@Data
public class PageInfo{

    private long current;

    private long size;




    public PageInfo(Integer current, Integer size) {
        this.current = current;
        this.size = size;
    }
}
