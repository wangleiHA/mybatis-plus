package com.wl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wl.entity.Person;
import com.wl.mapper.PersonMapper;
import com.wl.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WL
 * @since 2019-11-18
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public void getOneData(){
        String id = "01";

        Person person = personMapper.selectById(id);
        System.out.println(person);
    }

    @Override
    public void getList() {
        List<String> idList = new ArrayList<>();
        idList.add("01");
        idList.add("02");
        List<Person> personList = personMapper.selectBatchIds(idList);
        System.out.println(personList);
    }

    @Override
    public void getAll() {
        List<Person> personList = personMapper.selectAll();
        System.out.println(personList);
    }

    @Override
    public void selectByMap() {
        Map<String, Object> map = new HashMap<>();

        //这里map的key是数据库中的字段的名称，不是javabean中的属性名称
        map.put("t_id", "02");
        map.put("t_name", "钱电");
        List<Person> personList = personMapper.selectByMap(map);
        System.out.println(personList);
    }

    /*
    * 查询年龄在21到24之间，并且salary在4000以上的人
    * */
    @Override
    public List<Person> selectPerson() {
        List<Person> personList = personMapper.selectList(new QueryWrapper<Person>()
                .between("t_age", 21, 24)
                .gt("t_salary", 4000));
        return personList;
    }

    /*
    * 更新数据库中，性别为女，年龄为19的数据
    * */
    @Override
    public int updatePerson() {
        Person person = new Person();
        person.setT_password("nv");
        int update = personMapper.update(person, new UpdateWrapper<Person>().eq("t_sex", "女").eq("t_age", 19));
        return update;
    }

    /*
    * 删除id为09的人
    * */
    @Override
    public int deletePerson() {

        int delete = personMapper.delete(new QueryWrapper<Person>().lambda().eq(Person::getT_id, "09"));

        return delete;
    }

}
