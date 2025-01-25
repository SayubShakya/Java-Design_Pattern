package factoryMethod;

public class OperatingSystem implements OS{

    public OS getIntance(String s){
        if(s == "Open"){
            return new Android();
        } else if (s == "Close"){
            return new IOS();
        }else{
            return new Window();
        }
 
    }

    @Override
    public void app() {
    }
}   