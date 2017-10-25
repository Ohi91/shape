import java.util.Scanner;


public class ShapeMain {
	static void variatic(int ...x)
	{
		for(int i:x)
		{
			System.out.print(i+"  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose:\n1.Rectangle\n2.Square\n3.Right Triangle\n4.Sphare\n5.Cube\n");
		Scanner scan = new Scanner(System.in);
		int choose;
		choose=scan.nextInt();
		
		if(choose==1)
		{
			System.out.println("Input wide & lenght: ");
			int x=scan.nextInt();
			int y=scan.nextInt();
			Rectangle rr= new Rectangle(x,y);
			try {
				boolean res= rr instanceof Rectangle;
					System.out.println("No exception occured\n");
			}
			catch(Exception e){
				System.out.println("Exception thrown: "+e);
			}
		}
		if(choose==2)
		{
			System.out.println("Input lenght: ");
			int x=scan.nextInt();
			
			Square s= new Square(x);
			try {
				boolean res= s instanceof Square;
					System.out.println("No exception occured\n");
			}
			catch(Exception e){
				System.out.println("Exception thrown: "+e);
			}
		}
		if(choose==3)
		{
			System.out.println("Input base & hight: ");
			double x=scan.nextDouble();
			double y=scan.nextDouble();
			RightTriangle r= new RightTriangle(x,y);
			try {
				boolean res= r instanceof 	RightTriangle;
					System.out.println("No exception occured\n");
			}
			catch(Exception e){
				System.out.println("Exception thrown: "+e);
			}
		}
		if(choose==4)
		{
			System.out.println("Input radius: ");
			double x=scan.nextDouble();
			
			Sphare ss= new Sphare(x);
			try {
				boolean res= ss instanceof Sphare;
					System.out.println("No exception occured\n");
			}
			catch(Exception e){
				System.out.println("Exception thrown: "+e);
			}
		}
		if(choose==5)
		{
			System.out.println("Input wide , lenght , hight: ");
			int x=scan.nextInt();
			int y=scan.nextInt();
			int z=scan.nextInt();
			Cube c=new Cube(x,y,z);
			try {
				boolean res= c instanceof Cube;
					System.out.println("No exception occured\n");
			}
			catch(Exception e){
				System.out.println("Exception thrown: "+e);
			}
		}
		
		System.out.println("variatic function's 1st output ");
		variatic(2,3,4,6,7);
		
		System.out.println("variatic function's 2nd output ");
		variatic(12,13);
		}


}
