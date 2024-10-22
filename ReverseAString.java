import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) throws Exception {
        String str;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string (word or sentence): ");
        str = input.nextLine();

        System.out.print("The reversed string of '"+str+"' is: ");
        for (int i = str.length(); i > 0; i--) { // iterates through the given string from last char to first char
            System.out.print(str.charAt(i-1)); // charAt method is used to get the char at i-1 for each iteration of the loop and prints them 
        }
        input.close();
    }
}
