import java.util.*;
class SwitchWebsite
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        //String protocol=str.substring(0,str.indexOf(":"));
        //switch(protocol)
       // {
            //case  "https" : System.out.println("hypertext transfer protocol");
             //                   break;
            //case "ftp" : System.out.println("file transfer protocol");
            //                    break;
            //default : System.out.println("invalid");
          //                      break;
        //}

String ext=str.substring(str.lastIndexOf(".")+1);
        switch(ext)
        {
            case "com" : System.out.println("commercial");
                        break;
            case "gov" : System.out.println("government");
                        break;
            case "google": System.out.println("google");
                        break;
            default : System.out.println("Invalid");
                        break;
        }
        }
    }