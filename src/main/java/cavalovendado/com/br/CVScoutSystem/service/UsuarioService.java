package cavalovendado.com.br.CVScoutSystem.service;

import cavalovendado.com.br.CVScoutSystem.model.usuario.DadosCadastroUsuario;
import cavalovendado.com.br.CVScoutSystem.model.usuario.DadosDetalhamentoUsuario;
import cavalovendado.com.br.CVScoutSystem.model.usuario.Usuario;
import cavalovendado.com.br.CVScoutSystem.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public DadosDetalhamentoUsuario cadastrar(DadosCadastroUsuario dados){
        return new DadosDetalhamentoUsuario(repository.save(new Usuario(dados)));
    }

}
