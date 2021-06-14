
package gui.vieira.provapoo.model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
    @RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Calculadora de IMC, use /imc?peso=(adicione o peso aqui)";
	}
    
}
