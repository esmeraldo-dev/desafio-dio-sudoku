package br.com.dio.ui.custom.button;

import javax.swing.*;

public class FinishGameButton extends JButton {

    public FinishGameButton(){
        this.setText("Finalizar");
        this.addActionListener(actionListener);
    }
}
