package com.wl.controller;


import com.wl.service.IPersonService;
import com.wl.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WL
 * @since 2019-11-18
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @RequestMapping("/getOne")
    @ResponseBody
    public void getOne(){
        personService.getOneData();
    }

    @RequestMapping("/getList")
    @ResponseBody
    public void getList(){
        personService.getList();
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public void getAll(){
        personService.getAll();
    }

    @RequestMapping("/insertOne")
    @ResponseBody
    public void insertOne(){

    }

    @RequestMapping("/getByMap")
    @ResponseBody
    public void getByMap(){
        personService.selectByMap();
    }

}
