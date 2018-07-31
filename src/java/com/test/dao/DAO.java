
package com.test.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DAO {
    static final String LOGIN ="root";
    static final String PASSWORD ="";
    static final String URL ="jdbc:mysql://localhost:3306/test";
    
    Connection conexion = null;
    
    public void DAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, LOGIN ,PASSWORD );
            if (conexion !=null) {
                System.out.println("Conexion a base de datos exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public Connection getConnection(){
    return conexion;
    }
    public void desconectar(){
        conexion = null;
    }
}
    
//    private Connection cn;
//
//    public Connection getCn() {
//        return cn;
//    }
//
//    public void setCn(Connection cn) {
//        this.cn = cn;
//    }
//    
//    public void Conectar() throws Exception {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=cross&password=malgama");
//        } catch (Exception e) {
//            throw e;
//        }
//    }
//    
//    public void Cerrar() throws Exception {
//            try {
//                if (cn !=null) {
//                    if (cn.isClosed() == false) {
//                    cn.close();
//                    }
//                }
//            } catch (Exception e) {
//                throw e;
//            }
//        }
//      }

