
public class AnyRunnable <T extends Runnable>{
	
	
	
	public static void main(String[] args) {
		
		AnyRunnable<Thread> t = new AnyRunnable<>();
		
		
		//this won't work because of type restriction
		//AnyRunnable<String> s = new AnyRunnable<>();
		
		
	}

}
