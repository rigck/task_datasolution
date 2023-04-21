package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.BoardDTO;
import mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public void registerUser(BoardDTO boardDTO) {
        boardMapper.registerUser(boardDTO);
    }

    @Override
    public List<BoardDTO> getUserList(String name) {
        return boardMapper.getUserList(name);
    }

    @Override
    public BoardDTO getUserInfo(String empNo) {
        return boardMapper.getUserInfo(empNo);
    }

    @Override
    public void updateBoard(BoardDTO boardDTO) {
        boardMapper.updateBoard(boardDTO);
    }

    @Override
    public void deleteBoard(String empNo) {
        boardMapper.deleteBoard(empNo);
    }
}
