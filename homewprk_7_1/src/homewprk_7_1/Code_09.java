package homewprk_7_1;

public class Code_09 {
	
	    public static void main(String[] args) {
	        RegularPolygon regularPolygon1 = new RegularPolygon();
	        RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
	        RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);
	        System.out.println("regularPolygon1's perimeter is " + regularPolygon1.getPerimeter() + " and regularPolygon1's area is " + regularPolygon1.getArea());
	        System.out.println("regularPolygon2's perimeter is " + regularPolygon2.getPerimeter() + " and regularPolygon2's area is " + regularPolygon2.getArea());
	        System.out.println("regularPolygon3's perimeter is " + regularPolygon3.getPerimeter() + " and regularPolygon3's area is " + regularPolygon3.getArea());
	    }
	}
	class RegularPolygon{
	    private int n;
	    private double side;
	    private double x;
	    private double y;
	    RegularPolygon(){
	        n = 3;
	        side = 1;
	        x = 0;
	        y = 0;
	    }
	    RegularPolygon(int newN,double newSide){
	        this.n = newN;
	        this.side = newSide;
	        this.x = 0;
	        this.y = 0;
	    }
	    RegularPolygon(int newN,double newSide,double newX,double newY){
	        this.n = newN;
	        this.side = newSide;
	        this.x = newX;
	        this.y = newY;
	    }
	    public int getN(){
	        return n;
	    }
	    public void setN(int newN){
	        n = newN;
	    }
	    public double getSide(){
	        return side;
	    }
	    public void setSide(double newSide){
	        side=  newSide;
	    }
	    public double getX(){
	        return x;
	    }
	    public void setX(double newX){
	        x = newX;
	    }
	    public double getY(){
	        return y;
	    }
	    public void setY(double newY){
	        y = newY;
	    }
	    public double getPerimeter(){
	        return n * side;
	    }
	    public double getArea(){
	        return n * side * side / (4 * Math.tan(Math.PI / n));
	    }
	}
	
