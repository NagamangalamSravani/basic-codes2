import java.util.*;
class SwitchArithmeticMenu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Enter 2 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("enter option in words");
        String option=sc.nextLine();
        option=option.toUpperCase();
        switch(option)
        {
            case "ADD" : System.out.println("sum is"+(x+y));
                            break;
            case "SUB" : System.out.println("difference is"+ (x-y));
                            break;
            case "MUL" : System.out.println("product is"+ (x*y));
                            break;
            case "DIV" : System.out.println(" ratio is" +(x/y));
                            break;
            default : System.out.println("invalid");
                            break;
        }

    }
}
