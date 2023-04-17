import java.util.List;

import domain.BoardDTO;

public interface BoardService {
    public void registerUser(BoardDTO boardDTO);
    public List<BoardDTO> getUserList(String name);
    public BoardDTO getUserInfo(String empNo);
    public void updateUser(BoardDTO boardDTO);
    public void deleteUser(String empNo);
}
