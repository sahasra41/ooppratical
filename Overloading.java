package oop_practical;
class BoxOver{
	double width;
	double height;
	double depth;
	
	BoxOver(double w, double h, double d){
		
		width = w;
		height = h;
		depth = d;
	}
BoxOver(){
		
		width = -1;
		height = -1;
		depth = -1;
	}
BoxOver(double len){
width = height = depth = len;
}
double volume () {
	return width * height * depth;
}
}
public class Overloading {
	public static void main(String args[]) {
		BoxOver mybox1 = new BoxOver(10, 20, 15);
		BoxOver mybox2 = new BoxOver();
				BoxOver mycube = new BoxOver(7);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		
		vol = mycube.volume();
		System.out.println("Volume is " + vol);
	}
}
