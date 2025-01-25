package Command;

//Command
public class TrunOn implements Command{

    private Bulb bulb;

    public TrunOn(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.trunOn();
    }

    @Override
    public void undo() {
        bulb.trunOff();
    }

    @Override
    public void redo() {
        execute();
    }
    
}
