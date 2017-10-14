package registo;

import Ecras.EcraPrincipal;
import java.util.ArrayList;

public class Main {
    
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Tecnico> listaTecnicos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        EcraPrincipal ep1 = new EcraPrincipal();
        ep1.setVisible(true);
 
    } 
    
    public static void registarCliente(Cliente c){
        listaClientes.add(c);
        
        System.out.println("Cliente registado com sucesso!\n\n" + c +"\n");
        
    }
    
}
