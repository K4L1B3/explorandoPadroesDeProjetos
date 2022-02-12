package facade.subsistema2;

public class CepAPI {
    
    public static CepAPI instancia;

    public CepAPI (){
        super();
    }

    public static CepAPI getInstancia(){

        if(instancia == null){
            instancia = new CepAPI();
        }
        return instancia;
    }

    public String  recuperarEstado(String estado){
        return "PE";
    }

    public String  recuperarCidade(String cidade){
        return "Recife";
    }
    
}
