package TempleteMethod;

public class Main {
    public static void main(String[] args) {
        Template game = new Cricket();
        game.play();
        System.out.println("\n");

        game = new Football();
        game.play();
    }
}


