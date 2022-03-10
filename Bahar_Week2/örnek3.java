
public class örnek3 {

	public static void main(String[] args) {
		
	int[][] A={{1,3,5},{2,4,6},{3,5,7}};
	
	int[][] B={{1,3,4},{2,4,3},{1,2,4}};
	
	
	int[][] C=new int [A.length][A[0].length];
	
	 matrixAdd(A,B,C);
	
	for(int satir=0;satir<C.length;satir++) {
		
		for(int sutun=0;sutun<C[satir].length;sutun++) {
			
			System.out.print(C[satir][sutun]+" ");
			}
		System.out.println();
	}
		
 }

	
	
   public static int[][] matrixAdd(int[][] A, int[][] B, int[][] C) {
	 
	  for(int satir=0;satir<A.length;satir++) {
		  
		  for(int sutun=0; sutun<A[0].length; sutun++) {
			 
			  C[satir][sutun]= A[satir][sutun]+B[satir][sutun];
			  
		  }
	  }
	 
	 return C;
	 
 }
  }