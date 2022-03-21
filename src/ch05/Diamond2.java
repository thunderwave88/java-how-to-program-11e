//M, Chapter 5 exercises
//Date:
//Major skills.
import java.util.Scanner;
class Diamond2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=-1;
		while(a<0||a>19||a%2==0){
			System.out.println("Input odd integer between 1 to 19:");


			a = scan.nextInt();
			// for main validation to the user.
			if (a < 0 | a>9)
				System.out.println("Invalid input");


			// alternative to validation
			// try{a=Integer.parseInt(sc.nextLine());}catch(Exception ex){System.out.println("Invalid input");}}

			a = sc.nextInt();

			for(int i=0;i<(a+1)/2;i++){
				//draws the top half space
				for(int j=0;j<(a+1)/2-i;j++){System.out.print(" ");}
				// draws the middle parts
				for(int j=0;j<i*2+1;j++){System.out.print("*");}
				System.out.print("\n");
			}


			// finds the information in the lower half of the diamond
			for(int i=0;i<a+2;i++){System.out.print("*");}
			System.out.print("\n");
			for(int i=(a-1)/2;i>=0;i--){
				for(int j=0;j<(a+1)/2-i;j++){
					System.out.print(" ");
				}
			}
			for(int j=0;j<i*2+1;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}  
	}
}