package Facade;

public class ThreatreFacade {
    RoomLight roomLight;
    SoundSystem soundSystem;
    Television television;

    public ThreatreFacade(RoomLight roomLight, SoundSystem soundSystem, Television television) {
        this.roomLight = roomLight;
        this.soundSystem = soundSystem;
        this.television = television;
    }

    public void watchMovie(){
        soundSystem.switchOnSoundSysytem();
        television.switchOnTv();
        roomLight.lightsDim();
    }

    public void endgMovie(){
        soundSystem.switchOffSoundSysytem();
        television.switchOffTv();
        roomLight.lightsBright();
    }
    
}
