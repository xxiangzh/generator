package com.xzh.generator.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper
 * @author 向振华
 * @date 2018/9/21 13:02
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
