package learningjava;

public class MultiDiaArray {

	public static void main(String[] args) {
		 
		int myArray[][] =  {{1,2,3},{4,5,6}};
		
		for (int i=0;i<myArray.length;i++) {
			for(int j=0; j<myArray[i].length; j++) {
				
				System.out.println("arr[" + i + " ][ " + j + " ]  " + " = " + myArray[i][j]);
			}
		}

}
}
 