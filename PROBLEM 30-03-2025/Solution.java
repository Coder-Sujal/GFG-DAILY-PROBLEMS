class Solution {
    public int startStation(int[] gas, int[] cost) {
       int givenGas = 0;
       int requiredGas = 0;
       int n = gas.length;
       
       for(int i = 0;i<n;i++){
           givenGas += gas[i];
           requiredGas += cost[i];
       }
       
       if(givenGas - requiredGas < 0) return -1;
       
       int ans = 0;
       int currgas = 0;
       
       for(int i = 0;i<n;i++){
           currgas += (gas[i] - cost[i]);
           if(currgas < 0){
              currgas = 0;
              ans = i + 1;
           }
       }
       
       return ans;
    }
}
