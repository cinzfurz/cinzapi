package io.github.cinzfurz.cinzapi.test;

import io.github.cinzfurz.cinzapi.CinzApi;
import io.github.cinzfurz.cinzapi.render.Renderer;
import io.github.cinzfurz.cinzapi.util.ProgramManager;

public class TestProgram implements ProgramManager {
    public static final TestProgram INSTANCE = new TestProgram();

    public static void main(String[] args) {
        CinzApi.addProgram(INSTANCE);
        CinzApi.main(args);
        CinzApi.setFrameTitle("Test Program");
    }

    @Override
    public String programId() {
        return "TestProgram";
    }

    @Override
    public void load() {
        System.out.println("loaded testprogram!");
    }

    @Override
    public void tick() {
    }

    @Override
    public void save() {
        System.out.println("saved testprogram!");
    }

    @Override
    public void render() {
        Renderer.render((gtd) -> {
            
        });
    }
}
