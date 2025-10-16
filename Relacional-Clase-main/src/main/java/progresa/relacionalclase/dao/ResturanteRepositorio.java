package progresa.relacionalclase.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import progresa.relacionalclase.entity.Restaurante;

public interface ResturanteRepositorio extends JpaRepository<Restaurante,Long> {
}
