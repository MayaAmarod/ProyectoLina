package com.lina.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author spier
 */
public class Conexion {

    private String username = "linadmin";
    private String password = "Uigjb27WP+]uv*d";
    private String host = "localhost";
    private String port = "3306";
    private String database = "lina";
    private String classname = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://" + host + ":" + port + "/" + database+"?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
    private Connection con;

    public Conexion() {
        try {
            Class.forName(classname);
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("ERROR " + e);
        }
    }

    public Connection getConexion() {
        return con;
    }

}
