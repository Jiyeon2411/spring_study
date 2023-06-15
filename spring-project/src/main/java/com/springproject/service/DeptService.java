package com.springproject.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springproject.dto.Dept;


public interface DeptService {
	public  List<Dept> selectList();
}
