package TempleteMethod;

public class Football extends Template{

    @Override
    public void initialize() {
        System.out.println("Football game initialized! Start playing");
    }

    @Override
    public void startPlay() {
        System.out.println("Football game started! Enjoy the game!");

    }

    @Override
    public void endPlay() {
        System.out.println("Football game Finish");

    }
    
}
