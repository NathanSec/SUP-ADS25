package com.mycompany.inputjoption;

import javax.swing.JOptionPane;

public class InputJOption {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?",
                "Digite aqui");
        JOptionPane.showMessageDialog(null, "Seu nome é "+nome);
        String outronome=JOptionPane.showInputDialog(null,
                "Qual o outro nome", "Entrada de dados",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "O outro nome é "+outronome);
    }
}
