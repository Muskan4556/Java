public class createNewString {
    /*
     Given two strings, create a new string by picking characters from the first string where the corresponding to the character in the second string is '1'.
        Input:
        strl = "12345"
        str2 = "10101"
        Output: "135"
     */

     public static void main(String[] args) {
        String strl = "12345";
        String str2 = "10101";

        char arr1 [] = strl.toCharArray();
        char arr2 [] = str2.toCharArray();

        String output = "";

        // Use a single loop to check corresponding characters
        for (int i = 0; i < arr1.length; i++) {
            if(arr2[i] == '1'){
                output = output + arr1[i];
            }
        }

        System.out.println(output);
     }

}
