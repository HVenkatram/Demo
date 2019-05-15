package day1;
class Exercise8
{
  public static void main(String args[])
  {
			int sum = 0;
			int x,y,z;
			System.out.println("Enter the value of the number integer: " + args[0]);
			System.out.println("Enter the value of the number integer: " + args[1]);
			System.out.println("Enter the value of the number integer: " + args[2]);
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			z = Integer.parseInt(args[2]);

			 if (x > y && x > z)
			      System.out.println("First number is largest.");
			    else if (y > x && y > z)
			      System.out.println("Second number is largest.");
			    else if (z > x && z > y)
			      System.out.println("Third number is largest.");

		}
  }
