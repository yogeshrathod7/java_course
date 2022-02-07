package learningjava;

public class SingleDArray {

	public static void main(String[] args) {
		
		
		int myInt=2;
		int[] myIntArray = new int[10]; 
		myIntArray[0]=10;
		myIntArray[1]=20;
		myIntArray[2]=30;
		myIntArray[3]=40;
		myIntArray[4]=50;
		
		int[] myIntArray1 = {11,22,33,44,55};
		System.out.println(myIntArray[0]);
		System.out.println(myIntArray[1]);
		System.out.println(myIntArray[2]);
		System.out.println(myIntArray[3]);
		System.out.println(myIntArray[4]);
		System.out.println("Array length " + myIntArray.length);
		//System.out.println("Array 1"+myIntArray1);
		System.out.println("Array1 Length "+myIntArray1.length);
		System.out.println("Elements in Array1:");
		for (int i=0;i<myIntArray1.length;i++) {
			System.out.println(myIntArray1[i]);
			

	}

}
}