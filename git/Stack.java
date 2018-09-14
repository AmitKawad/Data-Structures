import java.util.*;

public class Stack
{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		ImplementStack s1=new ImplementStack();
		
		while(true)
		{

			System.out.println("Enter 1 for push");
			System.out.println("Enter 2 for pop");
			System.out.println("Enter 3 for peek");
			System.out.println("Enter 4 to view the stack");
			int choice=scan.nextInt();

			switch(choice)
			{
				case 1:
						System.out.println("Enter the data");
						int data=scan.nextInt();
						s1.push(data);
						break;
				case 2:
						s1.pop();
						break;
				case 3:
						s1.peek();
						break;
				case 4:
						s1.view();
						break;

				case 5:
						default:
							break;

				

			}
		}

		
	}

}
class ImplementStack
{
	int[] stack=new int[10];
	int top=-1;
	int data;
	public void push(int data)
	{
		if(top==stack.length-1)
		{

			System.out.println("The stack is full");
		}

		else
		{
			top++;
			stack[top]=data;
		}
		

	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			System.out.println("The popped element is "+stack[top]);
			top--;
		}
		
	}
	public void peek()
	{
		System.out.println("The top element is "+stack[top]);

	}
	public void view()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
		}
		else
		{

			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]+"\n");
			}
		}
	}


}