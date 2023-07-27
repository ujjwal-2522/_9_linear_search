public class Main {
    public static void main(String[] args) {
        int[] nums={22,45,67,8,76,45,-11,-23};
        int target=67;
        int ans1=linearSearch(nums,target);
        int ans2=linearSearch2(nums,target);
        boolean ans3=linearSearch3(nums,target);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
        //search in the array :return the index if item found
        //otherwise if item not found return -1
        static int linearSearch(int[] arr ,int target){
            if(arr.length==0){
                return -1;
            }
            // run a for loop
            for(int index=0;index< arr.length;index++){
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

        //Search the target and return the element
    static int linearSearch2(int[] arr ,int target){
        if(arr.length==0){
            return -1;
        }
        // run a for loop
        for (int element : arr) {
            //check for element at every index if it is =target
            if (element == target) {
                return element;
            }
        }
        //this line is execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }

    // Search the target and return true or false
    static boolean linearSearch3(int[] arr ,int target){
        if(arr.length==0){
            return false;
        }
        // run a for loop
        for(int index=0;index< arr.length;index++){
            //check for element at every index if it is =target
            int element=arr[index];
            if (element==target){
                return true;
            }
        }
        //this line is execute if none of the return statement above have executed
        //hence the target not found
        //return because -1 may be element in the array
        //return Integer.MAX_VALUE;
        return false;
    }
}