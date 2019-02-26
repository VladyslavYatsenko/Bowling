package com.company.yatsenko;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        int sum=0;
        String text = "X|7/|9-|X|-8|8/|-6|X|X|X|";
        String[] frames = text.split("\\|");
        List<Frame> frameList=new ArrayList<>();
        for(int i=0;i<frames.length;i++){
            frameList.add(new Frame(frames[i]));
        }
        for(Frame f:frameList){
            System.out.println(f);
        }
        for(Frame f:frameList){
            f.countSum();
            System.out.println(f.getFramePoints());
        }

    }
}
