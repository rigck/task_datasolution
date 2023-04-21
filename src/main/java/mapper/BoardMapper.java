package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import domain.BoardDTO;

@Mapper
public interface BoardMapper {
    public void registerUser(BoardDTO boardDTO);
    public List<BoardDTO> getUserList(String name);
    public BoardDTO getUserInfo(String empNo);
    public void updateBoard(BoardDTO boardDTO);
    public void deleteBoard(String empNo);
}
