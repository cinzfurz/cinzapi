package io.github.cinzfurz.cinzapi.render;

import java.awt.*;
import java.util.ArrayList;

public class Renderer {
    public static ArrayList<Function> queue = new ArrayList<>();

    public static void render(Function function) {
        queue.add(function);
    }

    @FunctionalInterface
    public interface Function {
        void apply(Graphics2D gtd);
    }
}
