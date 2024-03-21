package Recheck;

class 분수의덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer= new int[2];
        int denom = denom1*denom2;
        int numer_1 = numer1*denom2;
        int numer_2 = numer2*denom1;
        int numer = numer_1+numer_2;
        int n = 0;
        int max = 0;
        if(denom>numer){
            n = numer;
        }
        else{
            n = denom;
        }

        for(int i = 1; i<=n ; i++){
            if(denom%i==0&&numer%i==0){
                max = i;
            }
        }

        int finNum = numer/max;
        int finDen = denom/max;

        answer[0] = finNum;
        answer[1] = finDen;

        return answer;
    }
}
