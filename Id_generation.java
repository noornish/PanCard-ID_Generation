import java.util.*;
public class Id_generation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name");
		String  name=s.next();
		System.out.println("Enter lastname");
		String  name2=s.next();
		System.out.println("Enter p/o");
		String per=s.next();
		int length = 3;

		String characters = "abcdefghijklmnopqrstuvwxyz";
	       Random random = new Random();
	       StringBuilder sb = new StringBuilder();
	       for (int i = 0; i < length; i++) {
	    	   int index = random.nextInt(characters.length());
	           sb.append(characters.charAt(index));

	       }

	      int length1 = 1;
			 characters = "abcdefghijklmnopqrstuvwxyz";
		       Random rando = new Random();
		       StringBuilder sbi = new StringBuilder();
		       for (int i = 0; i < length1; i++) {
		           int index = rando.nextInt(characters.length());
		           sbi.append(characters.charAt(index));
		        }
		 System.out.println(sb+per+name2.charAt(0)+(int)Math.floor(Math.random() * 10)+(int)(Math.random()*10)+(int)(Math.random()*10)+sbi);
     }
}






