package beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Question_Table")
public class Question {
    @Id
    int q_id;
    String Question;

    @OneToOne
    Answer answer;

    public Question() {
    }

    public int getQ_id() {
        return q_id;
    }

    public void setQ_id(int q_id) {
        this.q_id = q_id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "q_id=" + q_id +
                ", Question='" + Question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
