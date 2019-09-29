package Study;

public class QuizCard {
    String quastion;
    String answer;
    QuizCard(String s1,String s2){
        quastion=s1;
        answer=s2;
    }
    String getQuestion(){
        return quastion;
    }
    String getAnswer(){
        return answer;
    }
}
