package com.cjc.main.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @PostMapping("/save-product")
  public String saveProduct()
  {
    return "Product will be save later";
  }

}
