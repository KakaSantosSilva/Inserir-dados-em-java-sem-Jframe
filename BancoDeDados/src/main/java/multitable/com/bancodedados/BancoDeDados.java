
package multitable.com.bancodedados;

import DAO.DocumentsDAO;
import DTO.Documents;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BancoDeDados {

    public static void main(String[] args) throws SQLException {
        
       Create();
    }
    
  public static void Create() throws SQLException{
      
      String nome,descricao;
      int id_categoria;
      
      //Pegar a nome e guardar em uma variavel
      
      Scanner idcategoria = new Scanner(System.in);
      System.out.println("Informe a categoria do item");
      id_categoria = idcategoria.nextInt();
      
      Documents objdocuments = new Documents();
      objdocuments.setId_categoria(id_categoria);
      
     
      Scanner nome1 = new Scanner(System.in);
      System.out.println("Informe o nome que deseje inserir");
      nome = nome1.nextLine();
     
      objdocuments.setNome(nome);
      
      Scanner descric = new Scanner(System.in);
      System.out.println("Informe a descrição desse produto");
      descricao = descric.nextLine();
    
      objdocuments.setDescricao(descricao);
      
     
      DocumentsDAO objdao = new DocumentsDAO();
      objdao.CadastrarDocuments(objdocuments);
      
      System.out.println("Documento cadastrado com sucesso");
      
  }
  
  public static void CreateCategoria() throws SQLException{
      String categoria;  
      
      //Pegar a categoria e guardar em uma variavel
      
      Scanner category = new Scanner(System.in);
      System.out.println("Informe a categoria que deseje inserir");
      categoria = category.next();
      
      Documents objdocuments = new Documents();
      objdocuments.setCategoria(categoria);
      
      DocumentsDAO objdao = new DocumentsDAO();
      objdao.CadastrarCategoria(objdocuments);
      
      System.out.println("Dados Cadastrados com sucesso");

      
       
      
  }
}
