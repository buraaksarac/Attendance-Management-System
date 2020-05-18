
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aeren
 */
public class OgrenciIslemleri {
    //adminin ogrenci ile ilgili bütün işlemler ve veritabanı bağlantısı
    
    private Connection con= null;
    
    private Statement statement=null;
    
    private PreparedStatement praPreparedStatement=null;
    
    public ArrayList<Ogrenci> ogrencileriGetir(){
        
        ArrayList<Ogrenci> cikti=new ArrayList<Ogrenci>();
        
        try {
            statement =con.createStatement();
            String sorgu="SELECT * FROM login";
            
            ResultSet rs= statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id=rs.getInt("ID");
                String ad=rs.getString("name");
                String soyad=rs.getString("surname");
                String bolum=rs.getString("department");
                
                cikti.add(new Ogrenci(id,ad,soyad,bolum));
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }      
    }
    public void ogrenciGuncelle(int id,String yeni_ad,String yeni_soyad,String yeni_bolum){
        
        
        String sorgu="UPDATE login SET name=? , surname=? , department=? WHERE ID=?"; 
        
        try {
            praPreparedStatement=con.prepareStatement(sorgu);
            
            praPreparedStatement.setString(1, yeni_ad);
            praPreparedStatement.setString(2, yeni_soyad);
            praPreparedStatement.setString(3, yeni_bolum);
            
            praPreparedStatement.setInt(4, id);
            
            praPreparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }        
    } 
    public void ogrenciSil(int id){
        
        String sorgu ="DELETE FROM login WHERE ID=?";
        
        try {
            praPreparedStatement=con.prepareStatement(sorgu);
            praPreparedStatement.setInt(1, id);
            
            praPreparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
    public void ogrenciEkle(String ad,String soyad,String bolum){
        Random gen = new Random();
        int ran = gen.nextInt(100);
        int ran2 = gen.nextInt(100);
        String ranPass = (String)(Integer.toString(ran))+(Integer.toString(ran2));
        String sorgu= "INSERT INTO login (name, surname, Password, department) VALUES (?,?,"+ranPass+",?)";
        
        try {
            praPreparedStatement=con.prepareStatement(sorgu);
            
            praPreparedStatement.setString(1, ad);
            praPreparedStatement.setString(2, soyad);
            praPreparedStatement.setString(3, bolum);
            
            praPreparedStatement.executeUpdate();
            System.out.println(ad+" " +soyad+ " "+ " " +ranPass);
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public OgrenciIslemleri(){
        
         String url="jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC&user=root&password=1234";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı");
            
        }
        try {
            con= DriverManager.getConnection(url);     
                    } catch (SQLException ex) {           
        }
    }
    }

