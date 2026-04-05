package dev.mauricio.CadastroNinjas.Ninjas;


import dev.mauricio.CadastroNinjas.Missoes.MissoesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @Autowired
    private NinjaRepository repository;
    @PostMapping
    public NinjaModel criarMissao(@RequestBody NinjaModel ninja) {
        return repository.save(ninja);
    }

    @DeleteMapping("/{id}")
    public String deletarNinja(@PathVariable Long id) {

        NinjaModel ninja = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ninja não encontrado"));

        repository.delete(ninja);

        return "Ninja deletado com sucesso!";
    }

}
