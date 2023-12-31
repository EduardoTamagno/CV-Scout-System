package cavalovendado.com.br.CVScoutSystem.model.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
        @NotBlank(message = "Senha é uma informação obrigatória!")
        String senha,
        @NotBlank (message = "Login é uma informação obrigatória!")
        String login
) {}
