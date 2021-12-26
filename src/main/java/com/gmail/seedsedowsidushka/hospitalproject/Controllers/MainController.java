package com.gmail.seedsedowsidushka.hospitalproject.Controllers;


import com.gmail.seedsedowsidushka.hospitalproject.Model.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String index(@AuthenticationPrincipal User user, Model model){
  if(user!=null){
        model.addAttribute("user", user.getUsername());
        return "cabinet";
    }
        model.addAttribute("user","anonymous");

        return"index";
}



    @GetMapping("/cabinet")
    public String cabinet(){
        return "cabinet";
    }


    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    @GetMapping("/foruser")
    public String forUser(){
        return "foruser";
    }


    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/foradmin")
    public String forAdmin(){
        return "foradmin";
    }


}
