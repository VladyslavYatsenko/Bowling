package com.company.yatsenko;


import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String text = "X|7/|9-|X|-8|8/|-6|X|X|X||81";
        String[] parsedText = text.split("[|]+");
        System.out.println(Arrays.toString(parsedText));
        List<Frame> frames = new ArrayList<>();

        for (int i = 0; i < parsedText.length; i++) {

            frames.add(new Frame(parsedText[i].toCharArray()));

        }
        for (Frame frame : frames) {
            System.out.println(frame);
        }
        System.out.println(calcTotalPoint(frames));

    }

    public static int calcTotalPoint(List<Frame> frameList) {
        int totalPoints = 0;
        for (int i = 0; i < frameList.size(); i++) {
            if (frameList.get(i).isStrike()) {

                if(!frameList.get(i+1).isStrike()){

                    totalPoints += frameList.get(i).getFirstThrow() + frameList.get(i + 1).getFirstThrow()+frameList.get(i+1).getSecondThrow();

                }else{
                    totalPoints += frameList.get(i).getFirstThrow() + frameList.get(i + 1).getFirstThrow()+frameList.get(i+2).getFirstThrow();
                }


            } else if (frameList.get(i).isSpare()) {

                totalPoints += frameList.get(i).getTotalPoints() + frameList.get(i + 1).getFirstThrow();

            } else {

                totalPoints += frameList.get(i).getTotalPoints();
            }
        }
        return totalPoints;

    }
}
