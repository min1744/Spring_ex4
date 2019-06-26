package com.iu.board.notice;

import com.iu.board.BoardDTO;
import com.iu.board.BoardService;

public class NoticeService implements BoardService {

	private NoticeDAO noticeDAO;
	
	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		System.out.println("NoticeService");
		noticeDAO.setData(boardDTO);
		return 0;
	}
}