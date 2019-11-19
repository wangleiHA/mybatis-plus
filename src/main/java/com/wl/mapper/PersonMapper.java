package com.wl.mapper;

import com.wl.entity.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WL
 * @since 2019-11-18
 */
public interface PersonMapper extends BaseMapper<Person> {
    List<Person> selectAll();
}
