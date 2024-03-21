import java.lang.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4]; //x배열 따로 y배열따로 가장큰거와 가장작은거 찾아내면됨
        String wallStr="";
        int maxX=0;
        int minX=0;
        int maxY=0;
        int minY=0;
        int[] xArr = new int[wallpaper[0].length()];
        int[] yArr = new int[wallpaper.length];
        for(int i=0; i<wallpaper.length; i++){
            for(int k=0;k<wallpaper[i].length();k++){
                if(wallpaper[i].charAt(k)=='#') {
                    xArr[k]=1;
                    yArr[i]=1;
                }
            }
        }
        for(int i=0;i<xArr.length;i++){
            if(xArr[i]==1){
                maxX=i;
            }
        }
        for(int i=xArr.length-1;i>=0;i--){
            if(xArr[i]==1){
                minX=i;
            }
        }
        for(int i=0;i<yArr.length;i++){
            if(yArr[i]==1){
                maxY=i;
            }
        }
        for(int i=yArr.length-1;i>=0;i--){
            if(yArr[i]==1){
                minY=i;
            }
        }
        answer[0] = minY;
        answer[1] = minX;
        answer[2] = maxY+1;
        answer[3] = maxX+1;
        return answer;
    }
}