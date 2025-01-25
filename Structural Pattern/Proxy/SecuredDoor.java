package Proxy;

public class SecuredDoor implements Door {
    private Door door;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    @Override
    public void open(String password) {
        if (authenticate(password)) {
            door.open("");
        } else {
            System.out.println("Access Denied");
        }
    }

    private boolean authenticate(String password) {
        return "sayub".equals(password);
    }

    @Override
    public void close() {
        door.close();
    }
}
