package com.zoe.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoe.web.dao.BoardDAO;
import com.zoe.web.dto.BoardDTO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardDTO> boardList() {
		return boardDAO.boardList();
	}

}
