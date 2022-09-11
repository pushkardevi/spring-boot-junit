package com.spring.jpa.model;

public class AlienName {

    String fname;
    String mname;
    String lname;

    public AlienName(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        return "AlienName{" +
                "fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
