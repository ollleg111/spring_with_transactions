package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class ItemController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String findById(long id){
//    public String findById(){
        return "Helllllo " + id;
    }
}
