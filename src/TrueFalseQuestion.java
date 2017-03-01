
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed EL-Halawany
 */
public class TrueFalseQuestion extends Question{
    boolean Answer;
    
    public TrueFalseQuestion(String question,boolean answer)
    {
        super(question);
        this.Answer=answer;
    }
    
    @Override
    public String get_Question() {
        return  getQuestion()+"\nWrite ( True ) Or ( False ) Question.";
    }

    @Override
    public Object get_Answer() {
        return Answer;
    }
   
    @Override
    public Boolean check_Answer(Object Student_Answer) {
        if(Objects.equals(Answer ,Student_Answer))
            return true;
        else 
            return false;
    }
}
