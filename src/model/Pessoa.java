package model;

public abstract class Pessoa {
    
    private String nome;
    private String telefone;
    private String email;
    
    public Pessoa(String nome,String telefone, String email){
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
    }
    public Pessoa(String nome,String telefone){
        this.nome=nome;
        this.telefone=telefone;
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void listar(){
        System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Email: "+getEmail());
    }
}
