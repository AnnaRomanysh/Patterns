package creational.singletone;
//Performance =NO
public class SingletonVolatile {
    private static volatile SingletonVolatile singletonVolatile;

    private SingletonVolatile() {

    }

    public static SingletonVolatile getInstance() {
        if (singletonVolatile == null)
            synchronized (SingletonVolatile.class) {
                singletonVolatile = new SingletonVolatile();
            }
        return singletonVolatile;
    }
}
