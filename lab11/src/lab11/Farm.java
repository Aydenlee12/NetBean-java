/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;
/**
 *
 * @author ayden
 */
public abstract class Farm {
    /**
     * Location of the farm 
     * Name of the owner of the farm
     */
    private String location;
    private String owner;
    
    public Farm(String location, String owner){
        this.location = location;
        this.owner = owner;
        }
        
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String getOwner(){
        return owner;
    }
    
    public abstract String type();
    
}
