package uygulama;

public class CarMain {

	public static void main(String[] args) {
		 
		Car car1 = new Car();
		 
		car1.renk= "Siyah";
		car1.model= "ford musteng";
		car1.motor= 1.6;
		car1.kapi= 4;
		
	   System.out.println("Arabanýn Rengi:" +car1.renk);
	   System.out.println("Arabanýn Modeli:" +car1.model);
	   System.out.println("Arabanýn Motoru:" +car1.motor);
	   System.out.println("Arabanýn kapý sayýsý:" +car1.kapi);
	   
		
	}

}
