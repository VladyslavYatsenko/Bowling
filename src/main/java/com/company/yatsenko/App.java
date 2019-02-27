package com.company.yatsenko;


import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        BowlingGame bowlingGame = new BowlingGame();
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
        System.out.println(bowlingGame.calcTotalPoint(frames));

    }

}
