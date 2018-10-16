package creational.singletone;

//Does not work in multy threading
public class SingletoneLazy {
//
    private static SingletoneLazy singletoneSimple;

    private SingletoneLazy() {
    }

    public static SingletoneLazy getInstance() {
        if (singletoneSimple == null) {
            singletoneSimple = new SingletoneLazy();
        }
            return singletoneSimple;


    }


}
