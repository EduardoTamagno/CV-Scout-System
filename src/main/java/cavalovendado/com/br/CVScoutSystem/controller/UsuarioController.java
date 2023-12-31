package cavalovendado.com.br.CVScoutSystem.controller;

import cavalovendado.com.br.CVScoutSystem.model.usuario.DadosCadastroUsuario;
import cavalovendado.com.br.CVScoutSystem.model.usuario.DadosDetalhamentoUsuario;
import cavalovendado.com.br.CVScoutSystem.repository.UsuarioRepository;
import cavalovendado.com.br.CVScoutSystem.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;
    public DadosDetalhamentoUsuario cadastrar (@RequestBody @Valid DadosCadastroUsuario dados) {
        return usuarioService.cadastrar(dados);
    }

}
