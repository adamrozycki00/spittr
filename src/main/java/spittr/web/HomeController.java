package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {

    {
        System.out.println("HomeController instantiated");
    }

    @RequestMapping(method = GET)
    public String home() {
        System.out.println("From home()");
        return "/home";
    }

    @RequestMapping(value = "/check", method = GET)
    public String check() {
        System.out.println("From check()");
        return "/check";
    }

}
