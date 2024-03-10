package com.example.loginapp;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
public class ConnectionHelper {
    Connection con;
    String ip, port, database, uname;

    public Connection connectionclass()
    {
        ip = "172.1.1.0";
        database    ="loginAppDB";
        port="1433";


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionUrl= null;

        try
        {
            Class.forName("net.sourceforge.jtds.jtdc.Driver");
            ConnectionUrl= "jdbc:jtds:sqlserver://"+ ip + ":"+ port + ";"+"databasename="+ database;
        }
        catch(Exception ex)
        {
            Log.e("Error", ex.getMessage());
        }
        return connection;

    }
}
