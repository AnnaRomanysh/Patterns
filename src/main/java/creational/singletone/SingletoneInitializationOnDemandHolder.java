package creational.singletone;
//is Lazy
//But exception handl in constr
public class SingletoneInitializationOnDemandHolder {

    private SingletoneInitializationOnDemandHolder() {

    }

    private static class SingletonHolder {
        private static SingletoneInitializationOnDemandHolder intstance = new SingletoneInitializationOnDemandHolder();
    }

    public static SingletoneInitializationOnDemandHolder getInstance() {
        return SingletonHolder.intstance;

    }
}
