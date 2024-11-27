package gm.zona_fit_swing.repositorio;

import gm.zona_fit_swing.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
