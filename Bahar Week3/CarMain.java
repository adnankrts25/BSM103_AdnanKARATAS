package uygulama;

public class CarMain {

	public static void main(String[] args) {
		 
		Car car1 = new Car();
		 
		car1.renk= "Siyah";
		car1.model= "ford musteng";
		car1.motor= 1.6;
		car1.kapi= 4;
		
	   System.out.println("Araban�n Rengi:" +car1.renk);
	   System.out.println("Araban�n Modeli:" +car1.model);
	   System.out.println("Araban�n Motoru:" +car1.motor);
	   System.out.println("Araban�n kap� say�s�:" +car1.kapi);
	   
		
	}

}
