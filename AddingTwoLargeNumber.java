package SEASSIGNMENT;

public class AddingTwoLargeNumber {
    // Function for finding sum of larger numbers
    static String Sum(String number1, String number2)
    {
        // Before proceeding further, make sure length
        // of number2 is larger.
        if (number1.length() > number2.length()){
            String t = number1;
            number1 = number2;
            number2 = t;
        }

        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = number1.length(), n2 = number2.length();

        // Reverse both of Strings
        number1=new StringBuilder(number1).reverse().toString();
        number2=new StringBuilder(number2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++)
        {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((int)(number1.charAt(i) - '0') +
                    (int)(number2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');

            // Calculate carry for next step
            carry = sum / 10;
        }

        // Add remaining digits of larger number
        for (int i = n1; i < n2; i++)
        {
            int sum = ((int)(number2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            str += (char)(carry + '0');

        // reverse resultant String
        str = new StringBuilder(str).reverse().toString();

        return str;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str1 = "12877777777777777777777777777777777777777777777777777775677777777778999999992";
        String str2 = "12888888888888888888888888888888888888888888888888888888888888888888888888888";
        System.out.println(Sum(str1, str2));
    }
}
