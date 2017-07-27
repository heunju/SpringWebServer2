package com.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.web.bean.BoardBean;
import com.test.web.bean.MemberBean;
import com.test.web.bean.TestBean;
import com.test.web.dao.BoardDao;
import com.test.web.dao.MemberDao;

@Controller
public class IndexController {

	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private BoardDao boardDao;
	
	
	@RequestMapping("hello")
	public String helloWorld(String id, String pw) {
		
		System.out.println("id: " + id + ", pw: " + pw);
		
		BoardBean bBean = boardDao.selectBoard();
		System.out.println("title : " + bBean.getTitle());
		System.out.println("content : " + bBean.getContent());
		
		
		return "helloWorld";
	}
	
	@RequestMapping("/test/hello")
	public String test2(TestBean tBean) {
		
		System.out.println( "id: " + tBean.getId() 
				+ ", pw: " + tBean.getPw() + ", addr: " + tBean.getAddr()  );
		
		
		MemberBean memberBean = memberDao.selectMember();
		System.out.println("USER_ID: " + memberBean.getUserId());
		System.out.println("USER_PW: " + memberBean.getUserPw());
		System.out.println("NAME: " + memberBean.getName());
		System.out.println("HP: " + memberBean.getHp());
		
		return "helloWorld";
	}
}
