package cn.johnyu.app.controller;

import cn.johnyu.service.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class TestController {
    @Autowired
    private BookManager bookManager;
    @RequestMapping("/login")
    public String login(Optional<String> uname, Model model){
        bookManager.add();
        model.addAttribute("uname",uname.get());
        return "suc";
    }
}
