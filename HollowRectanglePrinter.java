import java.util.Scanner;
public class HollowRectanglePrinter{
    public static void main(String [] args){
        System.out.println("Enter the length of the rectangle.");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        System.out.println("Enter the width of the rectangle.");
        int width=sc.nextInt();
        for(int i=1; i<=length; i++){
            for(int j=1; j<=width; j++){
                if(i==1 || i==length){
                    System.out.printf("%-3d",j);
                }
                else if(j==1 || j==width){
                    System.out.printf("%-3d",j);
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
