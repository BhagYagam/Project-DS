/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem.java;

import java.util.ArrayList;

/**
 *
 * @author M-C-S
 */
public class Observable {
    
	private final ArrayList<Observer>observerList=new ArrayList<>();
        
        private int strength;
        private String msg;
        private boolean cleared;
        

    public void addObserver(Observer ob){
        observerList.add(ob);
    }

    
    public void setClear(boolean cleared) {
        if(this.cleared!=cleared){
            this.cleared=cleared;
            notifyDevices1();
        }
    }

    
    public void setMsg(String msg) {
        if(this.msg!=msg){
            this.msg=msg;
            notifyDevices2();
        }
    }

    
    public void setStrength(int strength) {
        if(this.strength!=strength){
            this.strength=strength;
            notifyDevices3();
        }
    }
    
    public void notifyDevices1() {
        for (Observer ob : observerList) {
            ob.clear(cleared);
        }
    }
    
    public void notifyDevices2() {
        for (Observer ob : observerList) {
            ob.send(msg);
        }
    }

    public void notifyDevices3() {
        for (Observer ob : observerList) {
            ob.strength(strength);
        }
    }

    
}
