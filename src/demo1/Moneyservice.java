package demo1;


import utils.JdbcUtils;

import java.sql.Connection;

public class Moneyservice {
    public void updateservice(String from,String to,Double money) throws  Exception {
            Connection con = JdbcUtils.getConnection();
        con.setAutoCommit(false);
        moneydao md = new moneydao();
        md.updatemoney(con,from,-money);
        md.updatemoney(con,to,money);
            con.commit();
    }
}
