package behavioral.command;


public class Amazon implements Service{

  public void createPurchase(){
   System.out.println("Create purchuse using Amason");
    }

  public void payForPurchase(){
    System.out.println("Cancel purchuse using Amason");
  }
}
