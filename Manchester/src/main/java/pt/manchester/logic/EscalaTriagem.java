package pt.manchester.logic;

public enum EscalaTriagem {
	etSemEscala,
	etErro,
    etVermelho, //Emergente
    etLaranja, //Muito urgente
    etAmarelo, //Urgente
    etVerde; //Pouco urgente
    
    @Override
    public String toString() {
      switch(this) {
        case etSemEscala: return "Sem escala";
        case etErro: return "Erro";
        case etVermelho: return "Vermelho";
        case etLaranja: return "Laranja";
        case etAmarelo: return "Amarelo";
        case etVerde: return "Verde";
        default: throw new IllegalArgumentException();
      }
    }
}
