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
        boardMapper.insertUser(boardDTO);
    }

    @Override
    public List<BoardDTO> getUserList(String name) {
        return boardMapper.selectUserList(name);
    }

    @Override
    public BoardDTO getUserInfo(String empNo) {
        return boardMapper.selectUserInfo(empNo);
    }

    @Override
    public void updateUser(BoardDTO boardDTO) {
        boardMapper.updateUser(boardDTO);
    }

    @Override
    public void deleteUser(String empNo) {
        boardMapper.deleteUser(empNo);
    }
}
