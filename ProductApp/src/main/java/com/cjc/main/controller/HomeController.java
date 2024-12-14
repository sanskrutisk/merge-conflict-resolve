package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/get-products")
	public List allProducts()
	{
		return new ArrayList<>();
	}

  @PostMapping("/save-product")
  public String saveProduct()
  {
    return "Product will be save later";
  }


}
