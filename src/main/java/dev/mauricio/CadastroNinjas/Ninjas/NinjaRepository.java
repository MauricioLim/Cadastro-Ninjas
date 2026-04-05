package dev.mauricio.CadastroNinjas.Ninjas;

import dev.mauricio.CadastroNinjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
