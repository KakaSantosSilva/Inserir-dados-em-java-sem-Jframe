
package DAO;

import DTO.Documents;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DocumentsDAO {
    public Connection conn = null;
    public PreparedStatement pstm;
    
    public void CadastrarCategoria(Documents objdocuments) throws SQLException{
      
     conn = new ConexaoDAO().conectaBD();
     
        String sql = "insert into categorias(nome_categoria)values(?)";
        
        try {
           pstm = conn.prepareStatement(sql);
           pstm.setString(1, objdocuments.getCategoria());
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro CadastrarCategoria "+error);
        }
          
        pstm.execute();
        
    }
   public void CadastrarDocuments(Documents objdocuments) throws SQLException{
       
       conn = new ConexaoDAO().conectaBD();
       
       String sql = "insert into documents(id_categoria,dname,descricao)values(?,?,?)";
       
       try {
           pstm = conn.prepareStatement(sql);
           pstm.setInt(1, objdocuments.getId_categoria());
           pstm.setString(2, objdocuments.getNome());
           pstm.setString(3, objdocuments.getDescricao());
         
       } catch (SQLException error) {
           System.out.println("ERRO AO CADASTRAR"+error);
       }
        
       pstm.execute();
       
   }
    
}
