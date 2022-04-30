/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ordonez
 */
public class contact {
    private int cid;
    private String fname;
    private String lname;
    private String groupc;
    private String phone;
    private String email;
    private String address;
    private byte[] pic;
    private int udi;
    
    //Generate constructors of getters and setters
    public contact() {
    }
    
    
    
    public contact(int cid, String fname, String phone, String email, String address, byte[] pic, int udi) {
        this.cid = cid;
        this.fname = fname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.pic = pic;
        this.udi = udi;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGroupc() {
        return groupc;
    }

    public void setGroupc(String groupc) {
        this.groupc = groupc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public int getUdi() {
        return udi;
    }

    public void setUdi(int udi) {
        this.udi = udi;
    }
    
    
    
}

