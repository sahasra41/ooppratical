package oop_practical;
class BoxNew{
	double width;
	double height;
	double depth;
	
	BoxNew(double w, double h, double d){
		
		width = w;
		height = h;
		depth = d;
	}
	double volume () {
		return width * height * depth;
	}
}
public class ParameterizedConstructors {
	public static void main(String args[]) {
	BoxNew mybox1 = new BoxNew(10, 20, 15);
	BoxNew mybox2 = new BoxNew(3, 6, 9);
double vol;
	
	vol = mybox1.volume();
	System.out.println("Volume is " + vol);
	
	vol = mybox2.volume();
	System.out.println("Volume is " + vol);
}
}
