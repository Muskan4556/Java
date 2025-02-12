public class reverseString {
    public static void main(String[] args) {
        String str = "Hello";
        char arr [] = str.toCharArray();
        String rev = "";

        for (int i = 0; i < arr.length; i++) {
            rev = rev + arr[arr.length-1 -i];
        }

        // for (int i = arr.length -1 ; i >= 0; i--) {
        //     rev = rev + arr[i];
        // }


        System.out.println(rev);
    }
}
