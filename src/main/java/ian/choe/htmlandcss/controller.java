package ian.choe.htmlandcss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/test")
    public String practice() {
        return "practice";
    }
}
