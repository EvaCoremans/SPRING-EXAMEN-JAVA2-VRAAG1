package edu.ap.spring.view;

import edu.ap.spring.model.Eightball;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.awt.event.ActionEvent;

@Component
public class EventHandler {
    @Autowired
    UI ui;

    @Autowired
    Eightball eightball;

    public void generateEightballAnswer(ActionEvent event){
        ui.getLblAnswer().setText(eightball.getRandomAnswer(ui.getTxtQuestion().getText()));
        ui.getLblQuestion().setText(ui.getTxtQuestion().getText());
        ui.getTxtQuestion().setText("");
    }

}
