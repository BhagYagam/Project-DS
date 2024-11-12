/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem.java;

/**
 *
 * @author M-C-S
 */
public class Starter {
    public static void main(String[] args) {
        helicopter helicopter1 = new helicopter();
        helicopter1.setVisible(true);
        
        tank tank1= new tank();
        tank1.setVisible(true);
        
        submarine submarine1 = new submarine();
        submarine1.setVisible(true);

        Observable observable = new Observable();
        
        observable.addObserver(helicopter1);
        observable.addObserver(tank1);
        observable.addObserver(submarine1);

        new MainController(observable).setVisible(true);

    }
}
