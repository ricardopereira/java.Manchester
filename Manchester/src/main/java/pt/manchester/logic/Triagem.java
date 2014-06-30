package pt.manchester.logic;

import java.util.ArrayList;
import java.util.List;

import pt.manchester.states.IEstados;
import pt.manchester.states.EstadoListener;

public class Triagem {
	
	private IEstados estadoActual;
    private IEstados estadoAnterior;
    
    // Eventos
    private transient List<EstadoListener> listeners = null;

    public Triagem() {};
    
    public void setEstado(IEstados estado)
    {
        this.setEstadoAnterior(this.getEstadoActual());
        this.setEstadoActual(estado);
        
        // Notifica a todos os listeners o setEstado
        for (EstadoListener event : getListeners())
            event.onSetEstado();
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
	
    public void addListener(EstadoListener toAdd) {
        getListeners().add(toAdd);
    }
    
    public List<EstadoListener> getListeners() {
        if (listeners == null)
        {
            listeners = new ArrayList<>();
        }
        return listeners;
    }
}
