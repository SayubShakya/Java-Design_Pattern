package Command;

//Command
public class TrunOff implements Command{

    private Bulb bulb;

    public TrunOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.trunOff();
    }

    @Override
    public void undo() {
        bulb.trunOn();
    }

    @Override
    public void redo() {
        execute();
    }
    
}
