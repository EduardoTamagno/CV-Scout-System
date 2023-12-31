package cavalovendado.com.br.CVScoutSystem.repository;

import cavalovendado.com.br.CVScoutSystem.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
