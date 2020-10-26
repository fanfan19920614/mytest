package demo1;



import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class moneydao {
    @Test
    public void updatemoney(Connection con,String name,double money) throws Exception {
        String sql = "update boys set money=(money+?) where username=?";
        PreparedStatement ptmt = con.prepareStatement(sql);
        ptmt.setDouble(1,money);
        ptmt.setString(2,name);
        int i = ptmt.executeUpdate();
        System.out.println(i);
    }


}
