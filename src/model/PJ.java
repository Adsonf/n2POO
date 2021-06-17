package model;

public class PJ extends Pessoa{
    
    private String cnpj;
    
    public PJ(String nome,String telefone,String email,String cnpj){
        super(nome,telefone,email);
        this.cnpj=cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void listar(){
        System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Email: "+getEmail());
        System.out.println("CNPJ: "+getCnpj());
    }

}
