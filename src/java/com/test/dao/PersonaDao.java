package com.test.dao;

import com.test.modelo.Persona;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonaDao extends DAO {
    public void registrar(Persona per) throws Exception{
        try {
            this.DAO();
            PreparedStatement st = this.getConnection().prepareStatement("INSERT INTO persona (nombre, sexo) VALUES (?,?)");
            st.setString(1, per.getNombre());
            st.setString(2, per.getSexo());
            st.executeUpdate();
        } catch (SQLException e) {
            throw e;
        }finally{
            this.desconectar();
        }
    }
}
