import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import domain.BoardDTO;
import service.BoardService;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    // 사용자 등록 화면
    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("boardDTO", new BoardDTO());
        return "register";
    }

    // 사용자 등록 요청 처리
    @PostMapping("/register")
    public String register(BoardDTO boardDTO) {
        boardService.registerUser(boardDTO);
        return "redirect:/manage";
    }

    // 사용자 검색 화면
    @GetMapping("/search")
    public String searchForm(Model model) {
        List<BoardDTO> userList = boardService.getUserList("");
        model.addAttribute("userList", userList);
        return "userList";
    }

    // 사용자 검색 요청 처리
    @PostMapping("/search")
    public String searchUser(String name, Model model) {
        List<BoardDTO> userList = boardService.getUserList(name);
        model.addAttribute("userList", userList);
        return "userList";
    }


    // 사용자 정보 조회 화면
    @GetMapping("/userInfo/{empNo}")
    public String userInfoForm(@PathVariable String empNo, Model model) {
        BoardDTO userInfo = boardService.getUserInfo(empNo);
        model.addAttribute("userInfo", userInfo);
        return "userInfo";
    }

    // 사용자 정보 수정 요청 처리
    @PostMapping("/update")
    public String updateUser(BoardDTO boardDTO) {
        boardService.updateUser(boardDTO);
        return "redirect:/manage";
    }

    // 사용자 정보 삭제 요청 처리
    @PostMapping("/delete/{empNo}")
    public String deleteUser(@PathVariable String empNo) {
        boardService.deleteUser(empNo);
        return "redirect:/manage";
    }
}
