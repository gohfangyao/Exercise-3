import java.util.Random;
import java.util.Scanner;

public class Exercise3{
   public static void main (String[] args){
   
        //Question 2:
	   String phr = new String("Big,blue sky");
        System.out.println(phr.substring(phr.indexOf(","),7));       

        //Question 3:
        Random rd = new Random();
        System.out.println(rd.nextInt(41) + 10);
       

        //Question 4:
        Random rand = new Random();

        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        int largest = Math.max(num1,num2);
        System.out.println("Num1 : "+num1);
        System.out.println("Num2 : "+num2);
        System.out.println("Larger value: "+ largest);

        //Question 5:
        String test = "abc";
        test = test + test;
        System.out.println(test);
        
        
        Random random = new Random();
        double d = Math.round ( 2.5 + random.nextInt(1) );
        System.out.println("The value is " + d);

        //Question 6 :
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter 2 integer: ");
        int x = input.nextInt();
        int y = input.nextInt();
        
        System.out.println("Product of " + x + " and "+ y + ": " + Math.multiplyExact(x,y));

        //Question 7 :
        String text1 = "School of Computing";
        String text2 = "College of Arts and Sciences";
        String text3 = "UUM Sintok";
        
        System.out.println("Length of \"" + text1 + "\" : " + text1.length());
        System.out.println("Length of \"" + text2 + "\" : " + text2.length());
        System.out.println("Length of \"" + text3 + "\" : " + text3.length());
        System.out.println("Total length: " + (text1.length()+text2.length()+text3.length()));
        
        System.out.println(text2.substring(0,20) + text1.substring(10,19));
    }
}
