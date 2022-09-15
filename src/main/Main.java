package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Calcula PI");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.isResizable();

        Panel panel = new Panel();
        window.add(panel);

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        panel.StartGameThread();
    }
}

