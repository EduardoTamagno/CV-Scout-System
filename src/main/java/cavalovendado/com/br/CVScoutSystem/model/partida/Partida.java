package cavalovendado.com.br.CVScoutSystem.model.partida;

import cavalovendado.com.br.CVScoutSystem.model.equipe.Equipe;
import cavalovendado.com.br.CVScoutSystem.model.usuario.Usuario;
import jakarta.persistence.*;

@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pertidaId;
    private Integer numero;
    private TipoPartida tipoPartida;
    private CorEquipe corEquipe;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "equipeId")
    private Equipe equipe;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioId")
    private Usuario scout;
    private Double ptoAutonomo;
    private Double ptoTeleOperado;
    private Double ptoEndGame;
    private Double ptoPenalidades;


}
