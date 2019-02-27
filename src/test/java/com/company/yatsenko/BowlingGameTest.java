package com.company.yatsenko;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BowlingGameTest {
    BowlingGame bowlingGame=new BowlingGame();
    @Test
    public void firstTest(){
        String text="5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||50";
        String[] parsedText = text.split("[|]+");
        List<Frame> frameList=new ArrayList<>();

        for (int i = 0; i < parsedText.length; i++) {

            frameList.add(new Frame(parsedText[i].toCharArray()));

        }
        int points=bowlingGame.calcTotalPoint(frameList);
        assertEquals(150,points);
    }
    @Test
    public void secondTest(){
        String text="X|7/|9-|X|-8|8/|-6|X|X|X||81";
        String[] parsedText = text.split("[|]+");
        List<Frame> frameList=new ArrayList<>();

        for (int i = 0; i < parsedText.length; i++) {

            frameList.add(new Frame(parsedText[i].toCharArray()));

        }
        int points=bowlingGame.calcTotalPoint(frameList);
        assertEquals(167,points);
    }
    @Test
    public void thirdTest(){
        String text="9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||";
        String[] parsedText = text.split("[|]+");
        List<Frame> frameList=new ArrayList<>();

        for (int i = 0; i < parsedText.length; i++) {

            frameList.add(new Frame(parsedText[i].toCharArray()));

        }
        int points=bowlingGame.calcTotalPoint(frameList);
        assertEquals(90,points);
    }
    @Test
    public void fourthTest(){
        String text="X|X|X|X|X|X|X|X|X|X||90";
        String[] parsedText = text.split("[|]+");
        List<Frame> frameList=new ArrayList<>();

        for (int i = 0; i < parsedText.length; i++) {

            frameList.add(new Frame(parsedText[i].toCharArray()));

        }
        int points=bowlingGame.calcTotalPoint(frameList);
        assertEquals(288,points);
    }

}