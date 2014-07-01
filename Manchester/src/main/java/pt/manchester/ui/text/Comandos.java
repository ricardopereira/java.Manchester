package pt.manchester.ui.text;

import java.util.ArrayList;
import java.util.Scanner;

import pt.manchester.logic.*;
import pt.manchester.logic.Areas.*;
import pt.manchester.logic.Opcoes.Opcao;

public class Comandos {
	private Area area;
	
	public Comandos(Area area) {
		this.area = area;
	}
	
	public int showOpcoes() {
        // O fluxograma inicia sempre do caso mais crítico/emergente para o caso menos urgente
		System.out.println("");
        System.out.println(area.getClass().getSimpleName()+": "+EscalaTriagem.etVermelho.toString());
        System.out.println(Constantes.textEscolhaOpcao);
        
        int i = 0;
        ArrayList<Opcao> opcoes = null;
        
        switch (area.getEscalaActual()) {
		case etSemEscala:
			opcoes = area.getOpcoesVermelhas();
			break;
		case etVermelho:
			opcoes = area.getOpcoesVermelhas();
			break;
		case etLaranja:
			opcoes = area.getOpcoesLaranja();
			break;
		case etAmarelo:
			opcoes = area.getOpcoesAmarelo();
			break;
		case etVerde:
			opcoes = area.getOpcoesVerde();
			break;
		default:
			break;
		}
        
        if (opcoes != null) {
        	if (opcoes.size() == 0) {
        		System.out.println("Sem opções");
        		return 0;
        	}
        	else {
                for (; i < opcoes.size(); i++)
                {
                	System.out.println(i+": "+opcoes.get(i).getCaption() + "?");	
                }
                System.out.println(i+": "+Constantes.textNenhum);
                
                Scanner input = new Scanner(System.in);
                // ToDo: validação de números
        		return input.nextInt();        		
        	}
        }
        else
        	return 0;
	}
	
	public int getOpcoesCount() {
        switch (area.getEscalaActual()) {
		case etSemEscala:
			return area.getOpcoesVermelhas().size();
		case etVermelho:
			return area.getOpcoesVermelhas().size();
		case etLaranja:
			return area.getOpcoesLaranja().size();
		case etAmarelo:
			return area.getOpcoesAmarelo().size();
		case etVerde:
			return area.getOpcoesVerde().size();
		default:
			return 0;
		}
	}
	
}
