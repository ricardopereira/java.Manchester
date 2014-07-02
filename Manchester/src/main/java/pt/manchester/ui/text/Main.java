package pt.manchester.ui.text;

import java.util.ArrayList;

import pt.manchester.engine.MotorTriagem;
import pt.manchester.logic.Areas.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Area> areas = new ArrayList<>();
		areas.add(new AreaDorLombar());
		
		MotorTriagem sistema = new MotorTriagem();
		
		sistema.prepare(areas);
		sistema.start();
	}

}
