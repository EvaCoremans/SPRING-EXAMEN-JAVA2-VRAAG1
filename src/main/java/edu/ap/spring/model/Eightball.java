package edu.ap.spring.model;


import edu.ap.spring.jpa.Question;
import edu.ap.spring.jpa.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;


@Component
public class Eightball {

    @Autowired
    QuestionRepository repository;

    private String[] answers = {"It is certain",
            "Yes definitely",
            "Most likely",
            "Outlook good",
            "Better not tell you now",
            "Cannot predict now",
            "Don't count on it",
            "Outlook not so good",
            "Ask again later",
            "Don't count on it"};

    //cast Array to List for iteration
    private ArrayList<String> new_answers = new ArrayList<String>(Arrays.asList(answers));


    public String getRandomAnswer(String question){
        
    }



    //region Access Methods
    public QuestionRepository getRepository() {
        return repository;
    }

    public void setRepository(QuestionRepository repository) {
        this.repository = repository;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
    //endregion

}
