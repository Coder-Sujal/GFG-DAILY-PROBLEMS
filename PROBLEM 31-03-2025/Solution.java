class Solution {
    public boolean isValidPartition(int[] currcnt,int[] totalcnt){
        for(int i = 0;i<26;i++){
            if(currcnt[i] == 0 || currcnt[i] == totalcnt[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public int maxPartitions(String s){
        int n = s.length();
        int totalcnt[] = new int[26];

        for(int i = 0;i<n;i++){
            totalcnt[s.charAt(i)-97] += 1;
        }

        int currcnt[] = new int[26];
        int ans = 0;

        for(int i = 0;i<n;i++){
            currcnt[s.charAt(i)-97] += 1;
            if(isValidPartition(currcnt, totalcnt)){
                ans += 1;
            }
        }

        return ans;
    }
}
