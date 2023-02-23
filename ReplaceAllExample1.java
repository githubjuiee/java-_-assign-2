public class ReplaceAllExample1
{
    public static void main(String args[])
    {
        String s1="My name is Gattu. My name is lambu. My name is golu.";
        String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaceString);
    }
}
