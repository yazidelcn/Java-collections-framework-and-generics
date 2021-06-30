
public class App {

	public static void main(String[] args) {
		MyGenericClass<String> myName = new MyGenericClass<>("Yazid");
		myName.displayObjectDetails();
		System.out.println(myName.getObject());
		
		
		
		MyGenericClass<Integer> myAge = new MyGenericClass<>(26);
		myAge.displayObjectDetails();
		System.out.println(myAge.getObject());
	}

}
