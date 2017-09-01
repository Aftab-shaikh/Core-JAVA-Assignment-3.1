package variables;

public class Variables {

	int num1=5; // instance variable
	static int Num2=10; // static variable is a class variable
	
	
	public static void main(String[] args) {
		
		Variables variableOBJ = new Variables();
		 
		System.out.println(variableOBJ.num1);// instance variable can be called by making call obj
		
		// System.out.println(num1); // (without creating obj) error static methods cannot call instance variable directly
		
		System.out.println(Num2); // main method is static (static method can call static variable)
        
	}

}
