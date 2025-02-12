public class stringPalindrone {
    public static void main(String[] args) {
        String str = "racecar";

        char arr[] = str.toCharArray();

        // 5 arr[0], arr[5-1]

        boolean isPalindrone = true ;
    
        for(int i = 0; i<arr.length; i++){
            // arr[i] === arr [arr.length - i ]
            // last idx == arr.length - 1

            if(arr[i] != arr[(arr.length -1) - i]){
                isPalindrone = false ;
            }
        }

        if(isPalindrone){
            System.out.println(str + " is a Palindrome");
        }else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}
