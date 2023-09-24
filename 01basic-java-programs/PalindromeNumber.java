/*
 * Ask the user to input a number.
Create a copy of the input number and store it in a separate variable.
Initialize variables for storing the reverse (initially set to 0) and the remainder (initially set to 0).
Start a while loop that continues until the input number becomes 0.
Inside the loop, extract the last digit of the input number using the modulo operator (%).
Multiply the reverse by 10 and add the extracted digit to reverse the number.
Update the input number by dividing it by 10 to remove the last digit.
Repeat steps 5-7 until the input number becomes 0.
Compare the reversed number with the copy of the input number.
If they are equal, print a message indicating that the number is a palindrome. Otherwise, print a message indicating that the number is not a palindrome.
 */


class PalindromeNumber{
    public static void main (String[] args) {
        int num = 121;
        int intial = 121;
        int rev = 0;
        int rem = 0;
        while(num !=0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        if(rev == intial){
            System.out.println("Palindrome");
        } else System.out.println("Not Palindrome");
    }
}