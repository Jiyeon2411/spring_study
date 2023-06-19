package com.example.board2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board2.dto.Board;

@Mapper
public interface BoardDao {
	public int maxNum() throws Exception;
	
	public void insertData(Board board) throws Exception; //dao는 항상 추상메소드만
	
	public int getDataCount(String searchKey, String searchValue) throws Exception;
	
	public List<Board> getLists(String searchKey, String searchValue, 
			int start, int end) throws Exception;
}
