public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={3,4,45,-56,34,18};
        int target=-56;
        int ans=linearSearch(arr,target,1,4);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr ,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        // run a for loop
        for(int index=start;index< end;index++){
            //check for element at every index if it is =target
            int element=arr[index];
            if (element==target){
                return index;
            }
        }
        //this line is execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
