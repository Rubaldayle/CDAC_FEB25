class Box{
private double height;
private double width; 
private double breadth;

Box(double height, double width, double breadth){
this.height = height;
this.width = width;
this.breadth = breadth;
}
 public double getVolume(){
 return height * width * breadth;
 
 }
 public double getArea(){
 return 2*breadth*width+2*breadth*height+2*height*width;
     }
 
 }
 class BoxDemo{
 public static void main(String[] args){
 Box b1 = new Box(12, 14, 15);
 
 
 System.out.println("volume of the box = " + b1.getVolume());
 System.out.println("surface area of the box = " + b1.getArea());
 
 
 
 
 }
 
 
 
 }
