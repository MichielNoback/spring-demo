package nl.bioinf.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "greeting")
public class HelloMvc {

    @GetMapping(value = "hello")
    public String getGreeting(Model model) {
        model.addAttribute("greeting", "Hello to MVC");
        return "greeting";
    }
}
