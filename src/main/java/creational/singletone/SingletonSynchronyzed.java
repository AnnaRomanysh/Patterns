package creational.singletone;
//Multythreading -OK
//Lazy = OK
//Exc = OK
//Can be useful when we call getInstance not very often
//
public class SingletonSynchronyzed {
    private static SingletonSynchronyzed instance;
    private SingletonSynchronyzed(){}

    public static synchronized SingletonSynchronyzed getInstance(){
        if(instance==null){
            instance = new SingletonSynchronyzed();
        }
        return instance;
    }
}
