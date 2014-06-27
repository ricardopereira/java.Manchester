package logic;

import pt.manchester.states.IEstados;

public class Triagem {
	
	private IEstados estadoActual;
    private IEstados estadoAnterior;

    public Triagem() {};
    
    public void setEstado(IEstados estado)
    {
        this.setEstadoAnterior(this.getEstadoActual());
        this.setEstadoActual(estado);
    }

	public IEstados getEstadoAnterior() {
		return estadoAnterior;
	}

	public void setEstadoAnterior(IEstados estadoAnterior) {
		this.estadoAnterior = estadoAnterior;
	}

	public IEstados getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(IEstados estadoActual) {
		this.estadoActual = estadoActual;
	}
}
