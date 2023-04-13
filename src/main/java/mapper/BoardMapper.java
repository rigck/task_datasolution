package mapper;

import org.apache.ibatis.annotations.Mapper;

import domain.BoardDTO;

@Mapper
public interface BoardMapper {
	public String updateBoard(BoardDTO params);
}
