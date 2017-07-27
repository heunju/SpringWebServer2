package com.test.web.dao;

import java.util.List;

import com.test.web.bean.BoardBean;

public interface BoardDao {

	public BoardBean selectBoard();

	public List<BoardBean> boardList();

	/**����*/
	public int insertBoard(BoardBean bBean);

	/**����*/
	public int updateBoard(BoardBean bBean);

	/**����*/
	public int deleteBoard(BoardBean bBean);


}


