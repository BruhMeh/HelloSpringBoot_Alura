package br.com.alura.listavip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConvidadoController {
	
    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
