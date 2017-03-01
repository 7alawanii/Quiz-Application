/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed EL-Halawany
 */
public class FillInBlankQuestion extends Question{
    String Answer;
    
    public FillInBlankQuestion(String question,String answer)
    {
        super(question);
        this.Answer=answer;
    }
    
    @Override
    public String get_Question() {
        return getQuestion() + "\nFill In The Blank.";
    }

    @Override
    public Object get_Answer() {
        return Answer;
    }

    @Override
    public Boolean check_Answer(Object Student_Answer) {
        if(Answer.equalsIgnoreCase((String)Student_Answer)) 
            return true;
        else 
            return false;
    }
    
}
