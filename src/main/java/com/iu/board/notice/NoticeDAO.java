package com.iu.board.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.board.BoardDAO;
import com.iu.board.BoardDTO;
import com.iu.util.DBConnector;

public class NoticeDAO implements BoardDAO {
	@Inject
	private DBConnector dbConnector;
	
	public NoticeDAO(DBConnector dbConnector) {
		this.dbConnector = dbConnector;
	}
	
	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		System.out.println("NoticeDAO");
		Connection con = dbConnector.getConnect();
		String sql = "INSERT INTO NOTICE VALUES(NOTICE_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, 0)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, boardDTO.getTitle());
		st.setString(2, boardDTO.getWriter());
		st.setString(3, boardDTO.getContents());
		int result = st.executeUpdate();
	    st.close();
	    con.close();
		
		return result;
	}
}