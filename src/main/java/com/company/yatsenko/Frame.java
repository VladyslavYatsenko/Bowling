package com.company.yatsenko;

import java.util.Arrays;
import java.util.List;

public class Frame {
    private boolean strike = false;
    private boolean spare = false;
    private int firstThrow;
    private int secondThrow;
    private int totalPoints;
    private final int maxFramePoint=10;

    public int getTotalPoints() {
        return totalPoints;
    }

    public Frame(char[] text) {
        if (text[0] == 'X') {
            this.strike = true;
            this.spare = false;
            this.firstThrow = maxFramePoint;
            this.secondThrow=0;
            this.totalPoints=firstThrow;
        }else if (text[1] == '/') {
            this.strike = false;
            this.spare = true;
            this.firstThrow = Character.getNumericValue(text[0]);
            this.secondThrow=maxFramePoint-Character.getNumericValue(text[0]);
            this.totalPoints = firstThrow + secondThrow;
        }
        else if (text[0] == '-') {
            this.strike = false;
            this.spare = false;
            this.firstThrow = 0;
            this.secondThrow=Character.getNumericValue(text[1]);
            this.totalPoints=secondThrow;
        } else if (text[1] == '-') {
            this.strike = false;
            this.spare = false;
            this.firstThrow = Character.getNumericValue(text[0]);
            this.secondThrow=0;
            this.totalPoints=firstThrow;
        }else {
            this.strike=false;
            this.spare=false;
            this.firstThrow=Character.getNumericValue(text[0]);
            this.secondThrow=Character.getNumericValue(text[1]);
        }
    }


    @Override
    public String toString() {
        return "Frame->(" +
                "strike=" + strike +
                ", spare=" + spare +
                ", firstThrow=" + firstThrow +
                ", secondThrow=" + secondThrow +
                ')';
    }

    public boolean isStrike() {
        return strike;
    }

    public boolean isSpare() {
        return spare;
    }


    public int getFirstThrow() {
        return firstThrow;
    }

    public int getSecondThrow() {
        return secondThrow;
    }



}
