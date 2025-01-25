package Adapter;

public class Main {
    public static void main(String[] args) {
        AndroidCharger androidCharger = new AndroidCharger();
        Android android = new Aoneplus7t();
        androidCharger.charge(android);

        IphoneCharger iphoneCharger = new IphoneCharger();
        Iphone iphone = new Iphone16();
        iphoneCharger.charge(iphone);

        AndroidToIphoneAdapter androidToIphoneAdapter = new AndroidToIphoneAdapter(android);
        iphoneCharger.charge(androidToIphoneAdapter);

    }
}

