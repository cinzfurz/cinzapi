package io.github.cinzfurz.cinzapi.util;

public class RunArgs {
    public boolean printer = false, hitboxes = false;

    public RunArgs(boolean printer, boolean hitboxes) {
        this.printer = printer;
        this.hitboxes = hitboxes;
    }

    @Override
    public String toString() {
        return String.format("printer = %b, hitboxes = %b", printer, hitboxes);
    }
}
