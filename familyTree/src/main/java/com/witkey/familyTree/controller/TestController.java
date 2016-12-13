package com.witkey.familyTree.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.witkey.familyTree.service.TestService;

/**
 * Created by Administrator on 2016/12/12 0012.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

	@Autowired
	private TestService testService;
	
    @RequestMapping(value = "/testA")
    public ModelAndView testA(Model model){
    	
    	List<Map<String,Object>> list = testService.testA();
    	
        model.addAttribute("test","这是测试testA的");
        model.addAttribute("testList", list);
        return new ModelAndView("/testA");
    }

}
