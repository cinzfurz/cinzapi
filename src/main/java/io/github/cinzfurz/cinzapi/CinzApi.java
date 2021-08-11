package io.github.cinzfurz.cinzapi;

import io.github.cinzfurz.cinzapi.gui.GuiFrame;
import io.github.cinzfurz.cinzapi.util.ProgramManager;
import io.github.cinzfurz.cinzapi.util.RunArgs;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class CinzApi {
    public static RunArgs runArgs = new RunArgs(false, false);
    public static GuiFrame frame;

    private static Timer timer = new Timer();
    private static ArrayList<ProgramManager> programs = new ArrayList<>();

    public static void main(String[] args) {
        loadArgs(args);
        loadGui();
        for(ProgramManager program : programs) program.load();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (ProgramManager program : programs) {
                    program.tick();
                    program.render();
                }
                frame.repaint();
            }
        }, 0, 17);
    }

    public static void print(String text, boolean onlyPrinter) {
        if(!runArgs.printer && onlyPrinter) return;
        else System.out.println(text);
    }

    private static void loadArgs(String[] args) {
        boolean printer = false, hitboxes = false;
        for(String arg : args) if(arg.equalsIgnoreCase("--printer")) printer = true; else if(arg.equalsIgnoreCase("--hitboxes")) hitboxes = true;
        runArgs = new RunArgs(printer, hitboxes);
        print("Run Arguments: " + runArgs, false);
    }

    private static void loadGui() {
        frame = new GuiFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int width = 640, height = width / 12 * 8;
        frame.setSize(width, height);
        frame.setLocation((int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2 - frame.getSize().getWidth()/2), (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2 - frame.getSize().getHeight()/2));
        frame.setTitle("Title");
        frame.addWindowListener(frame);
        frame.loadPanel();
        frame.setVisible(true);
    }

    public static void savePrograms() {
        for(ProgramManager program : programs) program.save();
    }

    public static void addProgram(ProgramManager program) {
        programs.add(program);
        print("CinzApi: Added program " + program.programId(), true);
    }

    public static void setFrameSize(int width, int height) {
        frame.setSize(width, height);
    }

    public static void setFrameTitle(String title) {
        frame.setTitle(title);
    }
}
