package QuestionLeet;

public class ques88 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int[] brr = {4, 5, 6, 7};
        int[] temp = new int[arr.length+brr.length];
//        for(int i = 0;  i < arr.length; i++){
//            temp[i] = arr[i];
//        }
        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        while(point1 < arr.length && point2 < brr.length){
            if(arr[point1] <= brr[point2]){
                temp[point3] = arr[point1];
                point3++;
                point1++;
            } else {
                temp[point3] = brr[point2];
                point3++;
                point2++;
            }
        }
        while(point1< arr.length){
            temp[point3] = temp[point1];
            point3++;
            point1++;
        }
        while(point2 < brr.length){
            temp[point3] = brr[point2];
            point2++;
            point3++;
        }
        for(int i =  0; i < temp.length; i++){
            System.out.print(temp[i]+" ");
        }
    }
}
