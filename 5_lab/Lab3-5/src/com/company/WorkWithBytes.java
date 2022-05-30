package com.company;

import java.io.*;

public class WorkWithBytes implements FlowInter{

    private FileOutputStream flow;

    public void flowOpen(File file) throws IOException{
        this.flow = new FileOutputStream(file);
    }
    public void flowClose() throws IOException{
        flow.close();
    }
    public void flowOutput (String arg) throws IOException{
        flow.write(arg.getBytes());
    }
    public String flowInput (File file) throws IOException{
        FileInputStream flow = new FileInputStream(file);
        String out = "";
        int a;
        while((a = flow.read())!=-1) {
            out = out + (char)a + " ";
        }
        flow.close();
        return out;
    }
}
