
package view;
import java.util.Scanner;
import java.util.ArrayList;
import model.*;

//AgendadeContatos
public class TeleInicial {


    public static void main(String[] args) {
        ArrayList<Pessoa>pessoas=new ArrayList();
        Scanner ler = new Scanner(System.in);
        int menu,opt;
        String cpf,cnpj,nome,telefone,email;
        char opt2;
        do{
            System.out.println("Digite uma das opções abaixo;");
            System.out.println("1 - Cadastrar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Excluir Contato");
            System.out.println("4 - Sair");
            menu=ler.nextInt();
            switch(menu){
                case 1:
                    ler.nextLine();
                    System.out.println("Deseja cadastra:\n1 - PF(Pessoa Fisica)\n2 - PJ(Pessoa Juridica)");
                    opt=ler.nextInt();
                    if(opt==1){
                        System.out.println("Deseja cadastra com CPF?(S/N) ");
                        opt2=ler.next().charAt(0);
                        if(opt2=='S'){
                            ler.nextLine();
                            System.out.println("Nome; ");
                            nome=ler.nextLine();
                            System.out.println("Telefone: ");
                            telefone=ler.nextLine();
                            System.out.println("Email; ");
                            email=ler.nextLine();
                            System.out.println("Cpf: ");
                            cpf=ler.nextLine();
                            Pessoa pf=new PF(nome,telefone,email,cpf);
                            pessoas.add(pf);
                        }
                        else{
                            ler.nextLine();
                            System.out.println("Nome; ");
                            nome=ler.nextLine();
                            System.out.println("Telefone: ");
                            telefone=ler.nextLine();
                            System.out.println("Email; ");
                            email=ler.nextLine();
                            Pessoa pf = new PF(nome,telefone,email, null);
                            pessoas.add(pf);
                            }
                    }
                        else{
                                System.out.println("Deseja cadastra com CNPJ?(S/N) ");
                        opt2=ler.next().charAt(0);
                        if(opt2=='S'){
                            ler.nextLine();
                            System.out.println("Nome; ");
                            nome=ler.nextLine();
                            System.out.println("Telefone: ");
                            telefone=ler.nextLine();
                            System.out.println("Email; ");
                            email=ler.nextLine();
                            System.out.println("Cnpj: ");
                            cnpj=ler.nextLine();
                            Pessoa pj=new PJ(nome,telefone,email,cnpj);
                            pessoas.add(pj);
                        }
                        else{
                            ler.nextLine();
                            System.out.println("Nome; ");
                            nome=ler.nextLine();
                            System.out.println("Telefone: ");
                            telefone=ler.nextLine();
                            System.out.println("Email; ");
                            email=ler.nextLine();
                            Pessoa pj = new PJ(nome,telefone,email, null);
                            pessoas.add(pj);
                            }
                    }
                            
                break;
                case 2:
                    if(pessoas.isEmpty())System.out.println("Nenhum contato cadastrado");
                    else{
                        for(Pessoa uni:pessoas){
                            uni.listar();
                            
                        }
                    }
                break;
                case 3:
                    ler.nextLine();
                    System.out.println("Digite o nome: ");
                    nome=ler.nextLine();
                    Pessoa pessoaASerRemovida = null;
                    for(Pessoa uni:pessoas){
                        if(uni.getNome().equals(nome)){
                            pessoaASerRemovida = uni;                            
                        }
                    }
                    System.out.println("Contato de "+pessoaASerRemovida.getNome()+" excluido");
                    pessoas.remove(pessoaASerRemovida);
                    
                break;
                case 4:
                    System.out.println(" ಠ_ಠ  xau");
                break;
                default:System.out.println("Opção Invalida");
                    }
            
        }while(menu!=4);
        
    }

}
