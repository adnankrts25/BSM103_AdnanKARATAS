	
public class PointMain {

	public static void main(String[] args) {
		 
		Point p1 =new Point(7,2);
		Point p2=new Point(4,3);
		
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orjine uzaklýgý: " +p1.distanceFromorigin());
		
		System.out.println("p2("+p2.getX()+","+p2.getY()+")");
		System.out.println("orjine uzaklýgý: " +p2.distanceFromorigin());
		
		
		p1.translate(11, 6);
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orjine uzaklýgý: " +p1.distanceFromorigin());
		
		System.out.println("p1 = " +p1);
		System.out.println();
		
		
	}

}
