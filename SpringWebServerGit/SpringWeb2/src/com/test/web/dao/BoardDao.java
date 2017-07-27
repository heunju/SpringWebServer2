package com.test.web.dao;

import java.util.List;

import com.test.web.bean.BoardBean;

public interface BoardDao {

	public BoardBean selectBoard();

	public List<BoardBean> boardList();

	/**가입*/
	public int insertBoard(BoardBean bBean);

	/**수정*/
	public int updateBoard(BoardBean bBean);

	/**삭제*/
	public int deleteBoard(BoardBean bBean);


}


