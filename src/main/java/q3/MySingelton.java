package q3;

public class MySingelton {

  private static MySingelton singleobj=null;

    private MySingelton(){

    }

    public static MySingelton getSingleobj(){

         return singleobj;
    }

}
