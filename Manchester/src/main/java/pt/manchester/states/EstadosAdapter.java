package pt.manchester.states;

import logic.Triagem;

public class EstadosAdapter implements IEstados {

	private Triagem triagem;
	
	public EstadosAdapter(Triagem triagem) {
		this.triagem = triagem;
	}
	
	@Override
	public Triagem getTriagem() { return null; }

	@Override
	public IEstados defineFichaCliente() { return this; }

	@Override
	public IEstados escolheArea() { return this; }

	@Override
	public IEstados defineVermelho() { return this; }

	@Override
	public IEstados defineLaranja() { return this; }

	@Override
	public IEstados defineAmarelo() { return this; }

	@Override
	public IEstados defineVerde() { return this; }

	@Override
	public IEstados defineDecisao() { return this;}
}