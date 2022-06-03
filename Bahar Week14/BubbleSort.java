package odev;

 class BubbleSort {
	 void bubbleSort(int[]array) {
		 
		 for (int i = 0; i < array.length-1; i++) {
			for (int index = 0; index < array.length-1; index ++) {
				if(array[index] > array[index+1]) {
					int tmp = array[index];
					array[index] = array[index+1];
					array[index+1] = tmp;
				}
			}
		}
	 }
	 void prinArray(int[] array ) {
		 for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		 System.out.println();
	 }

	public static void main(String[] args) {
		int[] array = {10,8,7,5,3,4,2,1,9};
		BubbleSort ob = new BubbleSort();
		ob.bubbleSort(array);
		ob.prinArray(array);
	}

}
