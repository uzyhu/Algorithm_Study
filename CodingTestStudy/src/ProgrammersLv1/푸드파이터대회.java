package ProgrammersLv1;
import java.util.*;

class 푸드파이터대회 {
    public String 푸드파이터대회(int[] food) {
        List<String> answerArr = new ArrayList<>();
        for(int k=1; k<food.length; k++){
            for(int t=0; t<food[k]/2; t++){
                answerArr.add(k+"");
            }
        }
        StringBuilder answerString = new StringBuilder();
        for(int i=0; i<answerArr.size(); i++){
            answerString.append(answerArr.get(i));
            answerString.insert(answerArr.size()-1-i, answerArr.get(i));
        }
        answerString.insert(answerArr.size(), "0");
        return answerString.toString();
    }
}
