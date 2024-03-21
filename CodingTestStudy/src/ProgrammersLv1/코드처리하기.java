package ProgrammersLv1;

import java.lang.*;
import java.util.*;

class 코드처리하기 {
    public String solution(String code) {
        ArrayList<Character> answer = new ArrayList<>();
        int mode = 0;
        int count = 0;
        for(Character a : code.toCharArray()){
            if(mode == 0){
                if(!(a.equals('1')) && count%2==0){
                    answer.add(a);
                }
                else if(a.equals('1')){
                    mode = 1;
                }
            }
            else{
                if(!(a.equals('1')) && count%2==1){
                    answer.add(a);
                }
                else if(a.equals('1')){
                    mode = 0;
                }
            }
            count++;
        }

        StringBuilder ret = new StringBuilder();
        String result;
        for(char a : answer){
            ret.append(a);
        }
        result= ret.toString();
        if (result.equals("")){
            result = "EMPTY";
        }

        return result;
    }
}
