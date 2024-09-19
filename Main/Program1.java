package Program1; //Program 1 by Asta Walor. Replacing Program 1

public class Program1 {

	public static void main(String[] args) {
		String name[]= {"My","name","is","Asta","Walor"," "};
		StringBuilder str = new StringBuilder();
		for(int i = 0; i!= name.length - 1; i++) {
			str.append(name[i] + name[5]);
		}	
		System.out.print(str);

	}

}
