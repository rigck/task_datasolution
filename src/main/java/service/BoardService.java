package service;

import java.util.List;

import org.springframework.stereotype.Service;

import domain.BoardDTO;

@Service
public interface BoardService {
    public void registerUser(BoardDTO boardDTO);
    public List<BoardDTO> getUserList(String name);
    public BoardDTO getUserInfo(String empNo);
    public void updateBoard(BoardDTO boardDTO);
    public void deleteBoard(String empNo);
}
