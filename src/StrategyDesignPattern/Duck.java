package StrategyDesignPattern;

public class Duck {

    private Quackable quack;
    private Flyable fly;

    public Duck(Quackable quack, Flyable fly){
        this.quack = quack;
        this.fly = fly;
    }

    public Quackable getQuack() {
        return quack;
    }

    public void setQuack(Quackable quack) {
        this.quack = quack;
    }

    public Flyable getFly() {
        return fly;
    }

    public void setFly(Flyable fly) {
        this.fly = fly;
    }

    public void fly(){
        fly.fly();
    }

    public void quack(){
        quack.quack();
    }
}
