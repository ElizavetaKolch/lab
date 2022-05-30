package com.company;

import java.io.File;
import java.io.IOException;

public class ThreadFileSynchronized {
    private FlowInter object;
    private File file;
    private boolean lockW = false;
    private boolean lockR = true;

    public ThreadFileSynchronized(FlowInter object, File file) {
        this.object = object;
        this.file = file;
    }

    public boolean getlockW() {
        return lockW;
    }

    public boolean getlockR() {
        return lockR;
    }

    public void read() throws IOException {
        synchronized (object) {
            System.out.printf("\nПрочитал строку из файла: %s", object.flowInput(file));
        }
        this.lockR = true;
        this.lockW = false;
    }

    public void write(String arg) throws IOException {
        synchronized (object) {
            object.flowOpen(file);
            object.flowOutput(arg);
            System.out.printf("\nЗанёс строку в файл: %s", arg);
            object.flowClose();
        }
        this.lockW = true;
        this.lockR = false;
    }
}
