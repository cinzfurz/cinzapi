package io.github.cinzfurz.cinzapi.util;

public interface ProgramManager {
    String programId();

    void load();

    void tick();

    void save();

    void render();
}
