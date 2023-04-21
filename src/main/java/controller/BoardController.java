package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.BoardDTO;
import service.BoardService;

@RequestMapping(value="/register", method={RequestMethod.GET, RequestMethod.POST})
@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    // 사용자 등록 화면
    @GetMapping("/register")
    @ResponseBody
    public String registerForm(Model model) {
        model.addAttribute("boardDTO", new BoardDTO());
        return "/register";
    }
    
 // 사용자 등록 요청 처리
    @PostMapping("/register")
    @ResponseBody
    public String register(BoardDTO boardDTO) {
        boardService.registerUser(boardDTO);
        return "redirect:/manage";
    }



    // 사용자 검색 화면
    @GetMapping("/search")
    @ResponseBody
    public String searchForm(Model model) {
        List<BoardDTO> userList = boardService.getUserList("");
        model.addAttribute("userList", userList);
        return "userList";
    }

    // 사용자 검색 요청 처리
    @PostMapping("/search")
    @ResponseBody
    public String searchUser(String name, Model model) {
        List<BoardDTO> userList = boardService.getUserList(name);
        model.addAttribute("userList", userList);
        return "userList";
    }


    // 사용자 정보 조회 화면
    @GetMapping("/userInfo/{empNo}")
    @ResponseBody
    public String userInfoForm(@PathVariable String empNo, Model model) {
        BoardDTO userInfo = boardService.getUserInfo(empNo);
        model.addAttribute("userInfo", userInfo);
        return "userInfo";
    }

    // 사용자 정보 수정 요청 처리
    @PostMapping("/update")
    @ResponseBody
    public String updateBoard(BoardDTO boardDTO) {
        boardService.updateBoard(boardDTO);
        return "redirect:/manage";
    }

    // 사용자 정보 삭제 요청 처리
    @PostMapping("/delete/{empNo}")
    @ResponseBody
    public String deleteBoard(@PathVariable String empNo) {
        boardService.deleteBoard(empNo);
        return "redirect:/manage";
    }

    
}
