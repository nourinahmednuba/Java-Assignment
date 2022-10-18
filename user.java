//Take input from a user and check if the number exists in the array
//let the array is [1,3,5,7,2,4,6,8]
//Input: 7
//Output: Found in the position 3
//Input: 9
//Output: Found no element
public class user {
        public static void main(String[] args) {

            int[] arr = {1,3,5,7,2,4,6,8};
            int Find = 9;
            boolean found = false;

            for (int n : arr) {
                if (n == Find) {
                    found = true;
                    break;
                }
            }

            if(found)
                System.out.println(Find + " is found.");
            else
                System.out.println(Find + " is not found.");
        }
    }
