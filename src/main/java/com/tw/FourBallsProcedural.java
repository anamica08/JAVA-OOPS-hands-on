package com.tw;

import processing.core.PApplet;

public class FourBallsProcedural extends PApplet {
    public static final int HEIGHT = 640;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 20;

    int XCoordinateFirstBall = 0;
    int XCoordinateSecondBall = 0;
    int XCoordinateThirdBall = 0;
    int XCoordinateFourthBall = 0;

    @Override
    public void setup() {
        super.setup();
        background(255);
        System.out.print(1);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(XCoordinateFirstBall, HEIGHT * 1 / 5, DIAMETER);
        drawCircle(XCoordinateSecondBall, HEIGHT * 2 / 5, DIAMETER);
        drawCircle(XCoordinateThirdBall, HEIGHT * 3 / 5, DIAMETER);
        drawCircle(XCoordinateFourthBall, HEIGHT * 4 / 5, DIAMETER);
        XCoordinateFirstBall += 1;
        XCoordinateSecondBall += 2;
        XCoordinateThirdBall += 3;
        XCoordinateFourthBall += 4;
    }

    private void drawCircle(int xPos, int yPos, int diameter) {
        ellipse(xPos, yPos, diameter, diameter);
    }

    public static void main(String[] args) {
        PApplet.main("com.tw.FourBallsProcedural", args);
    }
}
