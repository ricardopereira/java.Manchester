package pt.manchester.ui.graphic;

public class Main {
	
    public static final void main(String[] args) {
        System.out.println("Starting GUI...");
        start();
    }

	private static void start() {
        DataController controller = new DataController();
        new FrameMain(controller);
    }

}
