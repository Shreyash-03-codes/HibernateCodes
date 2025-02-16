package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Question {

    private String questionName;
    @Id
    private int questionId;
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
    public void setQuestionId(int questionId){
        this.questionId=questionId;
    }
    public void setQuestionName(String questionName){
        this.questionName=questionName;
    }
    public String getQuestionName(){
        return this.questionName;
    }
    public int getQuestionId(){
        return this.questionId;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
