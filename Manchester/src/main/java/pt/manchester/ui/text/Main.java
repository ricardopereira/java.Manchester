package pt.manchester.ui.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pt.manchester.engine.MotorTriagem;
import pt.manchester.logic.Areas.*;

public class Main {
	private static List<Class<? extends Area>> listAreas;

	public static void main(String[] args) {
		
		// Teste
		loadAreas();
		showAreas();
		
		ArrayList<Area> areas = new ArrayList<>();
		
        Scanner input = new Scanner(System.in);
		int opcao = input.nextInt();
		while (opcao < 0 || opcao >= listAreas.size())
			opcao = input.nextInt();
	    
		System.out.println("A iniciar a triagem...");
		
	    try {
			Area a = listAreas.get(opcao).newInstance();
			areas.add(a);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		MotorTriagem sistema = new MotorTriagem();
		
		sistema.prepare(areas);
		sistema.start();
	}
	
	public static void loadAreas() {
		listAreas = new ArrayList<>();
		listAreas.add(AreaAgressao.class);
		listAreas.add(AreaAsma.class);
		listAreas.add(AreaCefaleia.class);
		listAreas.add(AreaConvulsoes.class);
		listAreas.add(AreaCriancaDifLoc.class);
		listAreas.add(AreaDiabetes.class);
		listAreas.add(AreaDiarreia.class);
		listAreas.add(AreaDispneia.class);
		listAreas.add(AreaDoencaHematologica.class);
		listAreas.add(AreaDoencaMental.class);
		listAreas.add(AreaDoencasSexualTransmi.class);
		listAreas.add(AreaDorCervical.class);
		listAreas.add(AreaDorGarganta.class);
		listAreas.add(AreaDorLombar.class);
		listAreas.add(AreaDorTesticular.class);
		listAreas.add(AreaDorToracica.class);
		listAreas.add(AreaEmbriaguezAparente.class);
		listAreas.add(AreaFeridas.class);
		listAreas.add(AreaGrandeTraumatismo.class);
		listAreas.add(AreaGravidez.class);
		listAreas.add(AreaHemorragiaGI.class);
	}
	
	public static void showAreas() {
		for (int i = 0; i < listAreas.size(); i++)
			System.out.println(i+": "+listAreas.get(i).getSimpleName());
	}

}
