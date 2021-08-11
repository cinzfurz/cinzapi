package io.github.cinzfurz.cinzapi.gui;

import io.github.cinzfurz.cinzapi.render.Renderer;

import javax.swing.*;
import java.awt.*;

public class GuiPanel extends JPanel {
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics = (Graphics2D)g;
        for(Renderer.Function function : Renderer.queue) {
            function.apply(graphics);
        }
    }
}
