// Separate the Letter and digit from the string 
class Main
{
    public static void main(String args[])
    {
        String s = " 2018  India 18 is my Country ";
        String temp = s.replaceAll("\\s","");
       
        String st1= "";
        String st2= "";
        for(int i = 0 ;i<temp.length();i++)
        {
            if(Character.isDigit(temp.charAt(i)))
            {
                st1+=temp.charAt(i);
                
            }
            else if(Character.isLetter(temp.charAt(i)))
            {
                st2+=temp.charAt(i);
                
            }
        }
       System.out.println(st1);
     System.out.print(st2);
    }
}
