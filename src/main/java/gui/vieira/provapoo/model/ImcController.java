
package gui.vieira.provapoo.model;

import gui.vieira.provapoo.dto.ImcDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imc")
public class ImcController {
    @GetMapping
    public ResponseEntity<ImcDto> calcular(@RequestParam float peso,@RequestParam float altura){
        return ResponseEntity.ok(new ImcDto(peso,altura));
    
    }
}
