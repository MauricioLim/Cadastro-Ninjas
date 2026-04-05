package dev.mauricio.CadastroNinjas.Missoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    @Autowired
    private MissoesRepository repository;

    @PostMapping
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return repository.save(missao);
    }
}
