/* Find the number of unpaired number in the given sequence
  Input: 1 2 1 3 2 4 4 5 5
 * Output: 3
 */

package Searching_Techniques;

import java.util.*;

public class Unpaired_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        sc.close();
        int res=0;
        for(int num:arr){
            res^=num;
        }
        System.out.println(res);
            
    }
}
