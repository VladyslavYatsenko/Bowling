package com.company.yatsenko;

import java.util.Arrays;

public class Frame {
    private char[] points=new char[2];
    private int framePoints;
    private int bonus;
    public Frame (String text){
        if(text.length()==1){
            points[0]=text.charAt(0);
            points[1]=' ';
        }else{
            points[0]=text.charAt(0);
            points[1]=text.charAt(1);
        }
    }

    @Override
    public String toString() {
        return "Frame{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    public int getBonus() {
        return bonus;
    }
    public void checkUnique(){
        if(points[0]=='X'){
            bonus=2;
        }
        else if(points[1]=='/'){
            bonus=1;
        }
    }

    public int getFramePoints() {
        return framePoints;
    }

    public void countSum(){
        if(points[0]=='X' || points[1]=='/'){
            framePoints=10;
        }else if(points[1]!='-'){
            framePoints=(int) points[0];
        }else{
            framePoints=(int) points[1];
        }
    }
}
