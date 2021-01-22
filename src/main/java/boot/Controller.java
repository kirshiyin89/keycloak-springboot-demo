package boot;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping("/visitor")
    public String getVisitor() {
        return "Hello Visitor!";
    }

    @RequestMapping("/admin")
    public String getAdmin() {
        return "Hello Admin!";
    }
}