package model;

public class PF extends Pessoa{
    
    private String cpf;
    
    public PF(String nome,String telefone, String email,String cpf){
        super(nome,telefone,email);
        this.cpf=cpf;
    }
    
  
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void listar(){
        System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Email: "+getEmail());
        System.out.println("CPF: "+getCpf());
    }
    
}
