package service;

import java.util.List;

import domain.BoardDTO;

public interface BoardService {
	public void registerBoard(BoardDTO params);
	public List<BoardDTO> memberBoard();
	public void search(BoardDTO params);
	public void update(BoardDTO params);
	public void delete(BoardDTO params);
}
