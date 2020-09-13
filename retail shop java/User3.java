/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jais
 */
class User3 {
      private int qty,sid;
    private String cust,item,date,mob,add;
    private float pr;
    
    User3(int sid,String item,int qty,float pr,String cust,String mob,String add,String date)
    {
        this.sid=sid;
        this.item=item;
        this.qty=qty;
        this.pr=pr;
        this.date=date;
        this.cust=cust;
        this.mob=mob;
        this.add=add;
        
    }
    
    public int getsid()
    {
        return sid;
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
      public String getcust()
    {
        return cust;
    }
      public String getmob()
    {
        return mob;
    }
      public String getadd()
    {
        return add;
    }
     public String getdate()
    {
        return date;
    }
    
}
