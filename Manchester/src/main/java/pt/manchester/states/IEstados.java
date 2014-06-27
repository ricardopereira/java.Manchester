package pt.manchester.states;

import pt.manchester.logic.Triagem;

public interface IEstados {
	Triagem getTriagem();
	
	IEstados defineFichaCliente();
	IEstados escolheArea();
	IEstados defineProximoEstado();
	IEstados defineEstadoAnterior();
	IEstados defineDecisao();
}
