package Training_Java;

public class Greater {
	
	  
	
	
	public void max(float a ,int b) {
		float C =(a>b)?a:b;
		System.out.println("The no is Maximaum"+C);
		
	}
	
	
		public void max(float a ,float b) {
			float D =(a>b)?a:b;
			System.out.println("The no is Maximaum"+D);
		}
		
		
		
		public void max(int... num) {
			int k=0;
			System.out.println("Total Values Are:"+num.length);
			for(int x:num) {
				if(x>k) {
					k=x;
				}
			}
			System.out.println("The Greater Number is:"+k);
		}
		
		
		
		
		public void min(int... num) {
			int l=0;
			System.out.println("Total Values Are:"+num.length);
			for(int x:num) {
				l=x;
			}
			for(int x:num) {
				if(x<l) {
					l=x;
				}
			}
			System.out.println("The Minimum Number is:"+l);
		}
		
	  
		
	
	public void min(int a ,int b) {
		int B =(a>b)?a:b;
		System.out.println("The no is Minimum");
		
	  
		
	}

}
