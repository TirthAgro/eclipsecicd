package firstapp.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping("/welcome")
    public String Welcome(){
        return "Hi , this is my first app";


    }
}
