/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jais
 */
public class User2 {
    private int qty,pid;
    private String vendor,item,date;
    private float pr;
    
    User2(int pid,String item,int qty,float pr,String date,String vendor)
    {
        this.pid=pid;
        this.item=item;
        this.qty=qty;
        this.pr=pr;
        this.date=date;
        this.vendor=vendor;
        
    }
    
    public int getpid()
    {
        return pid;
    }
    public String getitem()
    {
        return item;
    }
    public int getqty()
    {
        return qty;
    }
      public float getprice()
    {
        return pr;
    }
     public String getdate()
    {
        return date;
    }
      public String getvendor()
    {
        return vendor;
    }
}
