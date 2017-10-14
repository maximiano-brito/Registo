package registo;

abstract public class Pessoa {
    
    public int ID;
    public String primeiroNome;
    public String ultimoNome;
    public int telefone;
    public String email;

    public static int ultimoID = 0;
    
    public Pessoa(String primeiroNome, String ultimoNome, int telefone, String email) {
        
        ultimoID++;
        setID(ultimoID);
        
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.telefone = telefone;
        this.email = email;
    }
    
    @Override
    public String toString(){
        
        String relatorio = "";
        relatorio += "ID: " + ID;
        relatorio += "\nPrimeiro Nome: " + primeiroNome;
        relatorio += "\nÚltimo Nome: " + ultimoNome;
        relatorio += "\nTelefone: " + telefone;
        relatorio += "\nE-mail: " + email;
        return relatorio;
    }   
    
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getUltimoID() {
        return ultimoID;
    }

    public static void setUltimoID(int ultimoID) {
        Pessoa.ultimoID = ultimoID;
    }
    
}
