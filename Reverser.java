import java.util.Scanner;


public class Reverser {
	private String input;
	private String output;


	public Reverser(String in) {
		input = in;
	}

	public String reverseIt(){
		int stackLength = input.length();

		StackExample theStack = new StackExample(stackLength);

		for(int i = 0; i < input.length(); i++){
			char ch = input.charAt(i);
			theStack.push(ch);
		}
		String output = "";
		while(!theStack.isEmpty()){
			char ch = (char) theStack.pop();
			output += ch;
		}
		return output;
	}


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Enter a string: ");
			String input = scan.nextLine();
			
			Reverser rev = new Reverser(input);
			
			
			System.out.println("Reversed: " + rev.reverseIt());
			System.out.println("Original: " + input);
			System.out.println("Is a palindrome: " + input.equals(rev.reverseIt()));

		}
	}
}
