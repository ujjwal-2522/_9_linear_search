public class EvenDigit {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        //System.out.println(digit(12345)); // calculate digit of numbers
    }
    static int findNumbers(int[] nums){
        int count =0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check whether a numbers contains even digit or not
    static boolean even(int num){
        int numberofdigits= digits(num);
        if (numberofdigits%2==0){
            return true;
        }
        return false;

    }

    // count number of digit in a number
        static int digits(int num){
            int count=0;
            if(num<0){
                num=num*-1;
            }
            if(num==0){
                return 1;
            }
            while(num>0){
                count++;
                num=num/10;
            }
            return count;
        }

}
