package com.iu.s4;

import java.util.Locale;

import javax.inject.Inject;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.board.BoardDTO;
import com.iu.board.notice.NoticeService;

public class NoticeController {
	@Inject
	private NoticeService noticeService;
	
	public NoticeController(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	@RequestMapping(value = "/notice/**", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		try {
			System.out.println("NoticeController");
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("title");
			boardDTO.setWriter("writer");
			boardDTO.setContents("contents");
			int result = noticeService.setData(boardDTO);
			System.out.println("result : "+result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "home";
	}
}