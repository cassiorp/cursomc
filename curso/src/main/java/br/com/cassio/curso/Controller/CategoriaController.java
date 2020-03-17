package br.com.cassio.curso.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( value = "api/categorias")
public class CategoriaController {

    @GetMapping( value = "/get" )
    @ResponseBody
    public String mostrar() {
        return "funcionou";
    }


}
