package proyect;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hola")
    public String decirHola(){
        return"Hola Carolina";
    }
}

