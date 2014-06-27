package pt.manchester.states;

import pt.manchester.logic.Triagem;

public class Decisao extends EstadosAdapter {

	public Decisao(Triagem triagem) {
		super(triagem);
	}
	
	@Override
	public IEstados defineProximoEstado() { return new Decisao(getTriagem()); }

	@Override
	public IEstados defineEstadoAnterior() { 
		
		if (getTriagem().getEstadoAnterior().getClass() == AguardaPreparaFicha.class)
            return new AguardaPreparaFicha(getTriagem());
        else
        if (getTriagem().getEstadoAnterior().getClass() == AguardaVermelho.class)
            return new AguardaVermelho(getTriagem());
        else
        if (getTriagem().getEstadoAnterior().getClass() == AguardaLaranja.class)
            return new AguardaLaranja(getTriagem());
        else
        if (getTriagem().getEstadoAnterior().getClass() == AguardaAmarelo.class)
            return new AguardaAmarelo(getTriagem());
        else
        if (getTriagem().getEstadoAnterior().getClass() == AguardaVerde.class)
            return new AguardaVerde(getTriagem());
        else               
            return this;
	}

	@Override
	public IEstados defineDecisao() { return new Decisao(getTriagem()); }

}
