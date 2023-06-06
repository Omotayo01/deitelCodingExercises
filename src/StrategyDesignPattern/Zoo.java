package StrategyDesignPattern;

public class Zoo {
    public static void main(String[] args) {
        AjeFly ajefly = new AjeFly();
        NormalFly normalFly = new NormalFly();
        FowlFly fowlFly = new FowlFly();
        ReasonableQuack reasonableQuack = new ReasonableQuack();
        IlasaQuack ilasaQuack = new IlasaQuack();

//        is thesame as

//        Flyable ajefly = new AjeFly();
//        Flyable ilasaQuack = new IlasaQuack();

        Duck duck = new Duck(ilasaQuack, ajefly);
        duck.fly();
        duck.quack();
        duck.setFly(fowlFly);
        duck.fly();
    }
}
