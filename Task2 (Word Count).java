import java.util.Scanner;
public class word_count 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s1 = in.nextLine();
        String s2 = s1.replaceAll("[^a-zA-Z0-9\\s]","");
        String words[] = s2.split("\\s+");
        System.out.println("\nTotal words in the string : "+words.length);
        System.out.println();
        for (int i = 0; i < words.length; i++) 
        {
            String currentElement = words[i];
            int frequency = 1;

            for (int j = i + 1; j < words.length; j++) 
            {
                if (currentElement.equals(words[j])) 
                {
                    frequency++;
                    words[j] = "";
                }
            }

            if (frequency > 1 && !currentElement.equals("")) 
                System.out.println("* The word '" + currentElement + "' appears " + frequency + " times");
        }
        System.out.println();
        in.close();
    }
}