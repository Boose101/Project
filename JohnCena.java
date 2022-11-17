import java.util.Scanner;
public class JohnCena {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Please enter an Integer: ");
        int user_val = Integer.parseInt(scan.nextLine());
        out("The sum of all the digits in " + user_val + " is " + sumDigits(user_val));
        out(user_val + " reversed is " + reverse(user_val));
        if(isPalindrome(user_val)){
            out(user_val + " is a palindrome");
        }else{
            out(user_val + " is not a palindrome");
        }

        if(isPrime(user_val)){
            out(user_val + " is a prime number");
        }else{
            out(user_val + " is not a prime number");
        }

        out("List of factors: " + factors(user_val));

        
    }

    public static void out(String v){
        System.out.println(v);
    }

    public static int sumDigits(int value){
        String str = Integer.toString(value);
        int total = 0;
        for(int x = 0; x < str.length(); x++){
            total += Integer.parseInt(Character.toString(str.charAt(x)));
        }
        return total;
    }

    public static int reverse(int value){
        String str = Integer.toString(value);
        String r = "";
        
        for(int x = str.length()-1; x >= 0 ; x--){
            r += Integer.parseInt(Character.toString(str.charAt(x)));
        }
        return Integer.parseInt(r);
    }

    public static boolean isPalindrome(int value){
        if(reverse(value) == value){
            return true;
        }
        return false;
    }

    public static boolean isPrime(int value){
        for(int x = 2; x<value; x++){
            if(value%x == 0){
                return false;
            }
        }
        return true;
    }

    public static String factors(int value){
        String str = "";
        for(int x = 1; x<=value; x++){
            if(value%x == 0){
                str += x + " ";
            }
        }
        return str;
    }


}
