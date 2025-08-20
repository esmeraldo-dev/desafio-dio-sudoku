package br.com.dio.ui.custom.button;

import javax.swing.*;

public class ResetButton extends JButton {

    public ResetButton(){
        this.setText("Reiniciar jogo");
        this.addActionListener(actionListener);
    }

}
