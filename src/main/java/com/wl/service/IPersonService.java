package com.wl.service;

import com.wl.entity.Person;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WL
 * @since 2019-11-18
 */
public interface IPersonService extends IService<Person> {
    void getOneData();

    void getList();

    void getAll();

    void selectByMap();

    List<Person> selectPerson();

    int updatePerson();

    int deletePerson();
}
