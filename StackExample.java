public class StackExample {

	private int size;
	private int[] stackArray;
	private int top;
	
	
	public StackExample(int s) {
		size = s;
		stackArray = new int[s];
		top = -1;
	}
	
	public void push(int a){
		if(!isFull())
		stackArray[++top] = a;
		
		else{
		System.out.println("Full. Can't add " + a);
		}
	}
	
	public int pop(){
		if (!isEmpty())
		return stackArray[top--];
		return (Integer) null;
	}
	
	public int peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public boolean isFull(){
		return top == size-1;
	}
	
	public String toString(){
		String nums = "";
		for(int i = 0; i < stackArray.length; i++){
			nums+=stackArray[i] + " ";
		}
		return nums;
	}
}
