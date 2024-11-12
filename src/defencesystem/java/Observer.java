/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem.java;

/**
 *
 * @author M-C-S
 */
public interface Observer {
    	public void clear(boolean clr);
        public void send(String msg);
        public void strength(int strength);


}
