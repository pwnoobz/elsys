package org.elsys.lab.statics;

public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainApplication app = new MainApplication();
		app.Run();
	}
	private void Run(){
		try {
			//done!
			Plane plane = new Plane();
			Human albert = new Human("Albert", "M");
			Human deneris = new Human("Deneris", "F");
			showCounts(plane);
			plane.add(albert);
			showCounts(plane);
			plane.add(deneris);
			showCounts(plane);
			plane.remove(deneris);
			showCounts(plane);
			plane.clear();
			showCounts(plane);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void showCounts(Plane plane) {
		System.out.println("Males: " + plane.getMales());
		System.out.println("Females: " + plane.getFemales());
	}
}
