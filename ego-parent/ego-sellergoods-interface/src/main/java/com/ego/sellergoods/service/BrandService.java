package com.ego.sellergoods.service;

import java.util.List;

import com.ego.pojo.TbBrand;

import entity.PageResult;

public interface BrandService {

	public List<TbBrand> findAll();
	/**
	 * 品牌分页实现
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 品牌增加
	 */
	public void add(TbBrand tbBrand);
}
