package Adapter;

public class AndroidToIphoneAdapter  implements Iphone{
    public Android android;

    public AndroidToIphoneAdapter(Android android) { //constructor
        this.android = android;
    }

    @Override
    public void charge() {
        android.charge();
    }

    
}
