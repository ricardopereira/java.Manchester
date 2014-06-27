package pt.manchester.states;

import pt.manchester.logic.Triagem;

public class AguardaAmarelo extends EstadosAdapter {

	public AguardaAmarelo(Triagem triagem) {
		super(triagem);
	}

	@Override
	public IEstados defineProximoEstado() { return new AguardaVerde(getTriagem()); }

	@Override
	public IEstados defineEstadoAnterior() { 
		
		if (getTriagem().getEstadoAnterior().getClass() == AguardaEscolheArea.class)
            return new AguardaEscolheArea(getTriagem());
        else
        if (getTriagem().getEstadoAnterior().getClass() == AguardaVermelho.class)
            return new AguardaVermelho(getTriagem());
        else
        if (getTriagem().getEstadoAnterior().getClass() == AguardaLaranja.class)
            return new AguardaLaranja(getTriagem());
        else
        if (getTriagem().getEstadoAnterior().getClass() == AguardaVerde.class)
            return new AguardaVerde(getTriagem());
        else
        if (getTriagem().getEstadoAnterior().getClass() == Decisao.class)
            return new Decisao(getTriagem());
        else               
            return this;
	}

	@Override
	public IEstados defineDecisao() { return new Decisao(getTriagem()); }

}
