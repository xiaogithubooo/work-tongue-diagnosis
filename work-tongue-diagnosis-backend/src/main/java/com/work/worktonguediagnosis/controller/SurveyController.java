package com.work.worktonguediagnosis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 挂号控制器
 */
@RestController // 返回值默认为 json 类型
@RequestMapping("/survey")
public class SurveyController { // 通常控制层有服务层中的所有方法, 并且还有组合而成的方法, 如果组合的方法开始变得复杂就会封装到服务层内部

}
