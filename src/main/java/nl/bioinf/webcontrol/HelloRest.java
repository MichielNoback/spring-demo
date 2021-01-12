package nl.bioinf.webcontrol;

import nl.bioinf.model.Bird;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloRest {

    @GetMapping(value = "/rest1")
    public String getHello() {
        return "Hello Spring Boot!";
    }

    @GetMapping(value = "/rest2")
    public Bird getBird() {
        return new Bird("Long-legged buzzard", "extremely rare");
    }

    @GetMapping(value = "/echo/{msg}")
    public String doEcho(@PathVariable String msg) {
        return "You said " + msg + "...I say goodbye.";
    }

    @GetMapping(value = "/echo_name")
    public String doEchoName(@RequestParam(value = "name") String name) {
        return "You said " + name + "...I say goodbye.";
    }

}
