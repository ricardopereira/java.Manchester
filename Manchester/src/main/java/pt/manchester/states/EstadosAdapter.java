package pt.manchester.states;

import pt.manchester.logic.Triagem;

public class EstadosAdapter implements IEstados {

	private Triagem triagem;
	
	public EstadosAdapter(Triagem triagem) {
		this.triagem = triagem;
	}
	
	@Override
	public Triagem getTriagem() { return triagem; }

	@Override
	public IEstados defineFichaCliente() { return this; }

	@Override
	public IEstados escolheArea() { return this; }

	@Override
	public IEstados defineProximoEstado() { return this; }

	@Override
	public IEstados defineEstadoAnterior() { return this; }

	@Override
	public IEstados defineDecisao() { return this;}
}