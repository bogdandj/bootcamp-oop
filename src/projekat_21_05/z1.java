package projekat_21_05;

import java.util.ArrayList;

public class z1 {

	public static void main(String[] args) {

		ArrayList<Shape> shapes = new ArrayList<Shape>();

		Shape triangle = new EqualTriangle(5);
		Shape triangle2 = new EqualTriangle(4);
		Shape rectangle = new Rectangle(7, 5);
		Shape rectangle2 = new Rectangle(10, 6);
		Shape rectangle3 = new Rectangle(2, 9);
		
		shapes.add(triangle);
		shapes.add(triangle2);
		shapes.add(rectangle);
		shapes.add(rectangle2);
		shapes.add(rectangle3);
		
		totallSurface(shapes);
		totallVolume(shapes);
		surAndVol(shapes);
	}

	public static void totallSurface(ArrayList<Shape> shapes) {
		double surface = 0;
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).surface();
			surface = surface + shapes.get(i).surface();
		}
		System.out.println(surface);
	}

	public static void totallVolume(ArrayList<Shape> shapes) {
		double volume = 0;
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).surface();
			volume = volume + shapes.get(i).volume();
		}
		System.out.println(volume);
	}
	
	public static void surAndVol(ArrayList<Shape> shapes) {
		double total = 0;
		for (int i = 0; i < shapes.size(); i++) {
			total = shapes.get(i).surface() + shapes.get(i).volume();
			System.out.println(total);
		}
	}

}
