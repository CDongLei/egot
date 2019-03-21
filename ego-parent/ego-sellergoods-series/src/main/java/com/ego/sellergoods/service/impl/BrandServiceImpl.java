package com.ego.sellergoods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.ego.mapper.TbBrandMapper;
import com.ego.pojo.TbBrand;
import com.ego.sellergoods.service.BrandService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import entity.PageResult;

@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	private TbBrandMapper branMapper;

	@Override
	public List<TbBrand> findAll() {

		return branMapper.selectByExample(null);
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbBrand> page = (Page<TbBrand>) branMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void add(TbBrand tbBrand) {
		
		branMapper.insert(tbBrand);
	}

}
