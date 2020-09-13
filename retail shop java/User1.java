/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jais
 */
class User1 {
     
    private String mobile,name,gst,add;
    
    User1(String mobile,String name,String gst,String add)
    {
        this.mobile=mobile;
        this.name=name;
        this.gst=gst;
        this.add=add;
        
    }
    
    public String getmob()
    {
        return mobile;
    }
    public String getname()
    {
        return name;
    }
    public String getgst()
    {
        return gst;
    }
      public String getadd()
    {
        return add;
    }
}
