import java.util.List;

import domain.BoardDTO;

public interface BoardMapper {
    public void insertUser(BoardDTO boardDTO);
    public List<BoardDTO> selectUserList(String name);
    public BoardDTO selectUserInfo(String empNo);
    public void updateUser(BoardDTO boardDTO);
    public void deleteUser(String empNo);
}
