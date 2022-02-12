package singleton;

public class SingletonLazy {
    
    public static SingletonLazy instancia;

    public SingletonLazy (){
        super();
    }

    public static SingletonLazy getInstancia(){

        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }



}
