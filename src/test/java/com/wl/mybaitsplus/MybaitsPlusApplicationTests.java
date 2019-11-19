package com.wl.mybaitsplus;

import com.wl.entity.Person;
import com.wl.service.IPersonService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MybaitsPlusApplicationTests {

    @Autowired
    private IPersonService personService;

    @Test
    void contextLoads() {
    }

    @Test
    public void getOne(){
        personService.getOneData();
    }

    @Test
    public void getList(){
        List<Person> personList = personService.selectPerson();
        System.out.println(personList);
    }

    @Test
    public void testUpdate(){
        int i = personService.updatePerson();
        System.out.println(i);
    }

    @Test
    public void testDelete(){
        int i = personService.deletePerson();
        System.out.println(i);
    }

}
