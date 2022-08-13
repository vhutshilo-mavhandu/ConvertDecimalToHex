import java.util.Scanner;
class DecimalToHexExample
{
    public static void main(String args[])
    {
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a decimal number : ");
        int num =input.nextInt();

        // storing remainder
        int rem;

        // storing result
        String str2="";

        // hexadecimal number system
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if(num<=10000) {
           while (num > 0) {
               rem = num % 16;
               str2 = hex[rem] + str2;
               num = num / 16;
           }
           System.out.println("Method 2: Decimal to hexadecimal: " + str2);
       }else {
           System.out.println("input value is great than  1000010");
       }
    }
}