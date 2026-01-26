//time complexity is ---> O(n)^3
package QuestionLeet;

public class ques334 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int m = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1;  j < arr.length; j++){
                for(int k = j+1; k < arr.length;  k++){
                    if(arr[i] < arr[j] && arr[j] < arr[k]){
                        m = 1;
                    }
                }
            }
        }
        if(m == 1) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
