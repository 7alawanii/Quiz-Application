/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed EL-Halawany
 */
public abstract class Question {
    private String Question;
    
    public Question(String question)
    {
        this.Question=question;
    }
    
    public String getQuestion() {
        return Question;
    }
    
    public abstract String get_Question();
    
    public abstract Object get_Answer();
    
    public abstract Boolean check_Answer(Object Student_Answer);


    
    
    
}
