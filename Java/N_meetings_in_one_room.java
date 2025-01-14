class N_meetings_in_one_room {
    public int maxMeetings(int n, int start[], int end[]) {
        int[][] ans = new int[n][2];
        
        for(int i = 0; i<n; i++){
            ans[i][0] = start[i];
            ans[i][1] = end[i];
        }
        
        Arrays.sort(ans, (a,b)->a[1]- b[1]);
        
        int s = ans[0][0];
        int c = 0;
        int e = ans[0][1];
        for(int i = 1; i<n; i++){
            if(ans[i][0] <= e){
                continue;
            }
            else{
                c++;
                e = ans[i][1];
            }
        }
        return c+1;
    }
}
