class Room{
	double hight;
	double width;
    double bredth;             
				  
Room(double hight, double width, double bredth){
	this.hight = hight;
	this.width = width;
	this.bredth = bredth;
}
 double volume(){
	 return hight * width * bredth;
	 
 }

}
class RoomDemo{
	public static void main(String[] args){
		Room r = new Room(10, 12, 15);
		System.out.println("Volume of  = " + r.volume());
		
	}
}
