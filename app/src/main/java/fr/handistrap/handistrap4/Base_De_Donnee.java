package fr.handistrap.handistrap4;

/**
 * Created by Ozerioss on 25/11/2015.
 */
public class Base_De_Donnee {
    private int id;
    private String latitude;
    private String longitude;

    public Base_De_Donnee(){}

    public Base_De_Donnee(String latitude, String longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){

        this.id = id;
    }

    public String getLatitude()
    {

        return latitude;
    }
    public void setLatitude(){
        this.latitude = latitude;
    }
    public String getLongitude(){

        return longitude;
    }
    public void setLongitude(){
        this.longitude = longitude;
    }
    /*public String toString(){
        return "ID" : "+id+"\nlatitude : "+latitude+"\nlongitude : "+longitude+";
    }WHY THE FUCK THIS DOESNT WORK */
}
