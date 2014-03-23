/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IdCheck.SERVICIOS;

import java.sql.*;

public class Conexion {

    public Connection conexion = null;
    public Statement us_st = null;
    public PreparedStatement ps = null;

    public DatabaseMetaData dbmt;
    public String s_conexion;
    public ResultSet resultado = null;
    public String un_sql = null;

    protected String jdbc;
    protected String driver;
    protected String host;
    protected String database;
    protected String username;
    protected String password;

    public Conexion() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        jdbc = System.getProperty("jdbc");
        driver = System.getProperty("driver");
        host = System.getProperty("databasehost");
        database = System.getProperty("database");
        username = System.getProperty("username");
        password = System.getProperty("password");
        iniciardb();

    }

    public void iniciardb() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        s_conexion = jdbc + host + "/" + database;
        Class.forName(driver).newInstance();
        conexion = DriverManager.getConnection(s_conexion, username, password);
        dbmt = conexion.getMetaData();
        us_st = conexion.createStatement();

    }

}
