import java.util.Scanner;
public class subtractIndividualStringNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        int subtract = subtractIndividualStringNum(s);
        System.out.println("Answer = " +subtract);
    }
    public static int subtractIndividualStringNum(String str){

        int result = Character.getNumericValue(str.charAt(0));
        for(int i=1;i<=str.length()-1;i++){
           result -=Character.getNumericValue(str.charAt(i));
        }
        return result;
    }
}
/*
Create a  method to subtract the digits of a given string.
Strings length is between  2 - 100;
EX String s = 824
8 - 2 - 4 = 2
8 - 2 = 6
6 - 4 = 2
Answer = 2;
Post your GitHub link
 */