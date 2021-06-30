class Myclass extends Thread implements Comparable<String>{

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}


public class MultipleRestrictions <T extends Runnable&Comparable> {

	public static void main(String[] args) {
		
		//Multiple restrictions Demo
		MultipleRestrictions<Myclass> myClass = new MultipleRestrictions<Myclass>();

	}

}
