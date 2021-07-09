package hu.gerviba.paybasz.mobile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MobileController {

    @GetMapping("/")
    public String index() {
        return "mobile";
    }

    @GetMapping("/pay")
    public String pay() {
        return "pay";
    }

    @GetMapping("/read")
    public String read() {
        return "read";
    }

    @GetMapping("/scan")
    public String scan() {
        return "scan";
    }

}
