package se.iths.asli.ProjAssignment2;

import javax.swing.*;

public class JOptionPaneUI implements UI {
    @Override
    public String prompt(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    @Override
    public void info(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String menu() {
        String[] options = {
                "1. Add product",
                "2. View all products",
                "3. View information about the product",
                "4.Exit"
        };

        String mainMenuText = "Welcome to my webshop, please choose an option\n";
        for (String option : options) {
            mainMenuText += option + "\n";
        }
        return JOptionPane.showInputDialog(null, mainMenuText, "My fun webshop", JOptionPane.QUESTION_MESSAGE);
    }
}
