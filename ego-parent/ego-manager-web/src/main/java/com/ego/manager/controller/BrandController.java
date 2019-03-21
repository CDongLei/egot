package com.ego.manager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.pojo.TbBrand;
import com.ego.sellergoods.service.BrandService;

import entity.PageResult;

@RestController
@RequestMapping("/brand")
public class BrandController {
	@Reference
	private BrandService brandService;

	@RequestMapping("/findAll")
	public List<TbBrand> findAll() {
		return brandService.findAll();
	}
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int size) {
		return brandService.findPage(page, size);
	}
	@RequestMapping("/findPage")
	public void add(@RequestBody TbBrand tbrand) {
		brandService.add(tbrand);
	}
}
