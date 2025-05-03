package com.example.demo;   
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import java.util.List;
import org.springframework.ui.Model;
@Controller
public class DemoController {
    
  @Autowired
  private UserRepository userRepository;
  
  @GetMapping("/")
  public String home(Model model){
        List<User> users = userRepository.findAll();
        
        model.addAttribute("users",users);
        return "index";
  }
}
