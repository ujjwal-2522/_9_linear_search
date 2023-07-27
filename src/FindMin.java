public class FindMin {
    public static void main(String[] args) {
        int[] arr={3,4,45,-56,34,18};
        System.out.println(min(arr));
    }
    //arr.length not equal to 0
    // return min value in the array
    static int min(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
