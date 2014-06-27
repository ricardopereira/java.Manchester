package pt.manchester.states;

import logic.Triagem;

public interface IEstados {
	Triagem getTriagem();
	
	IEstados defineFichaCliente();
	IEstados escolheArea();
	IEstados defineVermelho();
	IEstados defineLaranja();
	IEstados defineAmarelo();
	IEstados defineVerde();
	IEstados defineDecisao();
}
