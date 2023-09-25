package by.bsuir.lab1.task9;

import java.util.ArrayList;

public class Basket {
    final int CAPACITY = 10;
    public ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<Ball>(this.CAPACITY);
    }

    public boolean addBall(Ball ball) {
        if (ball == null) {
            return false;
        }
        return balls.add(ball);
    }

    public int countBallsByColor(String color){
        int count = 0;
        for(Ball ball : balls){
            if (ball.color.equals(color)){
                count++;
            }
        }
        return count;
    }

    public int countWeight(){
        int weight = 0;
        for(Ball ball : balls){
            weight += ball.weight;
        }
        return weight;
    }
}
