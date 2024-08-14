package Patterns.strategy;

public class Robo {
    private Comportamento strategy;

    public void setComportamento(Comportamento comportamento){
        this.strategy = comportamento;
    }

    public void mover(){
        strategy.mover();
    }


}
