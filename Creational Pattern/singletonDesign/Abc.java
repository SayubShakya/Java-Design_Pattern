package singletonDesign;

public class Abc {

    //Eager & Lazy
    private static Abc abc; // static instance of a class //abc = object

    private Abc() { // private constructor
        System.out.println("Abc1");
    }

    //synchronized = lock ani 1 ,2 ,3 copy and release ani access
    public static Abc getInstance() { // static method

        if(abc == null){
            synchronized(Abc.class){
                if(abc == null){
                    abc = new Abc();
                }
            }
        }
        
        return abc; 
    }

    public void displayMsg(){  //method
        System.out.println("ABC2");
    }
}

