/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jais
 */
class User {
    
    private int qt;
    private float pr;
    private String iname;
    
    User(String iname,int qt,float pr)
    {
        this.iname=iname;
        this.qt=qt;
        this.pr=pr;
        
    }
    
    public String getname()
    {
        return iname;
    }
    public int getQtt()
    {
        return qt;
    }
    public float getprice()
    {
        return pr;
    }
}
