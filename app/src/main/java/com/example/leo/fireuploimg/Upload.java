package com.example.leo.fireuploimg;

/**
 * Created by Leo on 16.3.2018..
 */

public class Upload {
    private String nName;
    private String nImageUri;

    public Upload(){
        //empty constructor needed}
    }

    public Upload(String name,String imageUri){
        if(name.trim().equals("")){
            name="No name";
        }
        nName=name;
        nImageUri=imageUri;
    }

    public String getnName() {
        return nName;
    }
    public String getnImageUri() {
        return nImageUri;
    }
    public void setnName(String nName) {
        this.nName = nName;
    }
    public void setnImageUri(String nImageUri) {
        this.nImageUri = nImageUri;
    }
}
