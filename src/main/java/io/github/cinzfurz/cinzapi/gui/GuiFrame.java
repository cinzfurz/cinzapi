package io.github.cinzfurz.cinzapi.gui;

import io.github.cinzfurz.cinzapi.CinzApi;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GuiFrame extends JFrame implements WindowListener {
    public GuiPanel panel = new GuiPanel();

    public void loadPanel() {
        this.add(panel);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        CinzApi.savePrograms();
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
