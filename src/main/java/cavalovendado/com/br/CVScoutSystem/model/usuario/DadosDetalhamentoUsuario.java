package cavalovendado.com.br.CVScoutSystem.model.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosDetalhamentoUsuario(String senha, String login) {
    public DadosDetalhamentoUsuario(Usuario usuario) {
        this(usuario.getSenha(), usuario.getLogin());
    }
}
