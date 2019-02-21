package ru.cft.focusstart.kolobov;

import ru.cft.focusstart.kolobov.View.Window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Window();
        });
    }
}
