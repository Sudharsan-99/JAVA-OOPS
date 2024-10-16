package Abstraction.Homework.Games;

public class Main {
    public static void main(String[] args) {
        BasketBall basketBall= new BasketBall();
        basketBall.play();
        basketBall.Start();
        Football football = new Football();
        football.play();
        football.Start();
        football.equals(basketBall);
        football.notify();
    }
}
