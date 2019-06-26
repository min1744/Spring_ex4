package com.iu.board.notice;

import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.board.BoardDAO;
import com.iu.board.BoardDTO;
import com.iu.util.DBConnector;

public class NoticeDAO implements BoardDAO {
	
	private DBConnector dbConnector;
	
	public NoticeDAO(DBConnector dbConnector) {
		this.dbConnector = dbConnector;
	}
	
	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		 System.out.println(dbConnector.getConnect());
	     System.out.println("DAO Insert");
	     
		
		return 0;
	}
}