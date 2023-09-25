package by.bsuir.lab1.task9;

public class Main {
    public static void main(String[] args) {
        Ball bigBlueBall = new Ball(1000, "blue");
        Ball smallGreenBall = new Ball(200, "green");
        Ball smallBlueBall = new Ball(150, "blue");
        Basket basket = new Basket();

        basket.addBall(bigBlueBall);
        basket.addBall(smallGreenBall);
        basket.addBall(smallBlueBall);

        System.out.println(basket.countBallsByColor("blue"));
        System.out.println(basket.countWeight());
    }
}
