package RandomQuestions;

public class Singlton {
    private  static Singlton obj;
    private Singlton(){}

    public static Singlton getSinglton(){
        if(obj== null)
            synchronized (Singlton.class)
            {
                if(obj==null)
                    obj= new Singlton();
            }
        return obj;
    }
}
