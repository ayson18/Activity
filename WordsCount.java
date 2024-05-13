import java.util.Scanner;
class WordsCount { 
    public static void main(String arg[])
    { 
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
              System.out.print("Enter a string: ");
	String s = sc.nextLine();

	int count=0;
	 for (int i = 0;i<=(s.length()-1);i++)
   	 {
    	if(  ( (i>0)&& (s.charAt(i)!=' ') &&(s.charAt(i-1)==' ')) || ((s.charAt(i)!=' ')&&(i==0)) )
          	  count++;    
   	 }
               System.out.println("Number of words in a given string is :"+count);
   }
}