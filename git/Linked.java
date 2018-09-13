import java.util.*;

class Node
{
	private int data;
	private Node next;
	public Node() //constructor
	{
		data=0;
		next=null;
	}
	public Node(int data,Node next) //constructor

	{
		this.data=data;
		this.next=next;
	}

	public void setdata(int data)
	{
		this.data=data;
	}
	public void setNext(Node n)
	{
		this.next=n;
	}
	public int getdata()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
}


	 class  Linkedlist
	{
		Node start;
		int size;

		Linkedlist()
		{
			size=0;
			start=null;
		}
		public boolean IsEmpty()
		{
			if(size==0)
			{
				return true;
			}
			else{
				return false;
			}
		}
			public int getlistsize()
			{
				return size;
			}
			public void viewlist()

			{
				Node n=start;
				for(int i=1;i<=size;i++)
				{
					System.out.println(n.getdata());
					n=n.getNext();

				}
			}
			public void insertAtbegining(int data)
			{

				Node n=new Node();
				n.setdata(data);
				n.setNext(start);
				start=n;
				size++;

			}
			public void insertAtend(int data)
			{
				Node n=new Node();
				n.setdata(data);
				Node t=start;
				while(t.getNext()!=null)
				{
					t=t.getNext();
				}
				n.setNext(t);
				t.setNext(n);
				size++;

			}
			public void insertAtposition(int pos,int data)
			{
				if(pos==1)

				{
					insertAtbegining(data);
				}
				else if(pos==size+1)
				{
					insertAtend(data);
				}
				else if(pos>1&&pos<size+1)
				{
					Node n=new Node();
					Node t;
					t=start;
					for(int i=1;i<pos-1;i++)
					{
						t=t.getNext();
					}
					n.setdata(data);
					n.setNext(t.getNext());
					t.setNext(n);
					size++;

				}
			}
		
	}


	public class Linked
{
	public static void main(String[] args)
	{
		
		Linkedlist list=new Linkedlist();
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello");
		
		


		while(true)
		{
			System.out.println("Enter 1 to add at beginning");
			System.out.println("Enter 2 to add at end");
			System.out.println("Enter 3 to add at position");
			System.out.println("Enter 4 to view list");
			int choice=scan.nextInt();
		
		
		switch (choice)
		{

			case 1 :
			System.out.println("Enter data");
			int data=scan.nextInt();
			list.insertAtbegining(data);
			break;
			case 2:
			System.out.println("Enter data");
			 data=scan.nextInt();
			list.insertAtend(data);
			break;
			case 3:
			System.out.println("Enter postion and data");
			int position=scan.nextInt();
			data=scan.nextInt();
			list.insertAtposition(position,data);
			
			break;
			case 4: list.viewlist();
			break;
		
				

			
		}
	}
	

	}
}

