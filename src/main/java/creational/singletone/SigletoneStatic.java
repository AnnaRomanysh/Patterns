package creational.singletone;

//No lazy init
//No exeption handling during constructor call
//Thread safe

public class SigletoneStatic {

    private static SigletoneStatic sigletoneLazy = new SigletoneStatic();

    private SigletoneStatic(){}

    public  static SigletoneStatic getInstance(){
        return sigletoneLazy;
    }
}
