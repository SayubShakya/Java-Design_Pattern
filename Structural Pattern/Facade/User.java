package Facade;

public class User {
    public static void main(String[] args) {
        RoomLight roomLight = new RoomLight();

        Television television = new Television();

        SoundSystem soundSystem = new SoundSystem();

        ThreatreFacade facade = new ThreatreFacade(roomLight, soundSystem, television);
        facade.watchMovie();
        facade.endgMovie();
    }
}

