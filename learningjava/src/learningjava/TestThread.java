package learningjava;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleDemo A = new SampleDemo("A");
	    SampleDemo B = new SampleDemo("B");
	    B.start();
	    A.start();
	}

}
