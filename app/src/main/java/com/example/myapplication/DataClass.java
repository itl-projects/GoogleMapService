package com.example.myapplication;

public class DataClass {
    private  String name,id,phn;
    public DataClass(){

    }
    DataClass(String name, String id, String phn)
    {
        this.name=name;
        this.id=id;
        this.phn=phn;

    }
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPhn() {
        return phn;
    }
    public void setPhn(String phn) {
        this.phn = phn;
    }


}
