package com.company;

import java.io.*;

public class WorkWithSymbols implements FlowInter{

    private FileWriter flow;

    public void flowOpen(File file) throws IOException{
        this.flow = new FileWriter(file);
    }
    public void flowClose() throws IOException{
        flow.close();
    }
    public void flowOutput (String arg) throws IOException {
        flow.write(arg);
    }
    public String flowInput (File file) throws IOException{
        FileReader flow = new FileReader(file);
        String out = "";
        int a;
        while((a = flow.read())!=-1) {
            out = out + (char)a + " ";
        }
        flow.close();
        return out;
    }
}
