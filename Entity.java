import java.util.Scanner;
 public class Entity{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Integer here");
        int i = scan.nextInt();
       
        System.out.println("input your double type here");
        double d = scan.nextDouble();
       
        scan.nextLine();
        System.out.println("Enter your String");
        String s = scan.nextLine();
      
        scan.nextLine();
        String rs = scan.nextLine();
        System.out.println("Another int");
        int x =scan.nextInt();

       //my output comes here
       System.out.println("String: " +s);
       System.out.println("Double: " +d);
       System.out.println("Interger: " +i);
       System.out.println(rs);
       scan.close();
    }
 
}
