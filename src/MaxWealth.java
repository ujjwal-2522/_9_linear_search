public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            //When you start a new coloum , take a new sum of that row
            int sum=0;
            for (int account=0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }

            //now we have sum of accounts of the person
            //check with the overall answer
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
