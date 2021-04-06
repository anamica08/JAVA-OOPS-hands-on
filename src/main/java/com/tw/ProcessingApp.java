package com.tw;

/**
 *
 *
 * this program is a OOP approach to the problem .
 *
 *
 */

import processing.core.PApplet;

import java.util.ArrayList;

public class ProcessingApp extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    private ArrayList<Ball> balls = new ArrayList<>();


    public static void main(String[] args){
        PApplet.main("com.tw.ProcessingApp",args);
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        clearScreen();
        System.out.print(1);
        System.out.print(balls);
        for(int positionAndSpeed = 1;positionAndSpeed < 5; positionAndSpeed++){
            balls.add(new Ball(positionAndSpeed,positionAndSpeed));
        }
    }

    @Override
    public void draw() {
        for(int ball = 0;ball < 4; ball++){
            balls.get(ball).moveBall();
        }
    }

    private void clearScreen() {
        background(255);
    }

    private class Ball {
        public static final int START = 0;
        public static final int PARTS = 5;
        public static final int DIAMETER = 25;
        private int speedOfBall;
        private int yPosition;
        private int xPosition;

        public Ball(int part, int speedOfBall) {
            this.xPosition = START;
            this.yPosition = HEIGHT * part / PARTS;
            this.speedOfBall = speedOfBall;
        }

        public void moveBall(){
            drawBall(xPosition,yPosition,DIAMETER);
            this.xPosition += this.speedOfBall;
        }
    }

    private void drawBall(int xPosition, int yPosition, int diameter) {
        ellipse(xPosition,yPosition,diameter,diameter);
    }

}
