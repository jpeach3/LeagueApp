package com.company;


public class Main {

    public static void main(String[] args)  {
        Input in = new Input();
        String sumName = in.sumName();
        Output out = new Output();
        out.sumInfo(sumName);
        out.write();




    }
}