/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.epnmag9.effectivelifepluzma.general;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luism
 */
public class Main {
    public static MenuCLI load(){
        File save = new File("save.dmp");
        MenuCLI mcli = new MenuCLI();
        if(save.exists()){
            try {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(save));
                mcli = (MenuCLI) inputStream.readObject();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                mcli = new MenuCLI();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                mcli = new MenuCLI();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                mcli = new MenuCLI();
            }
        }else{
            mcli = new MenuCLI();
        }
        return mcli;
    }
    
    public static void save(MenuCLI mcli){
        File save = new File("save.dmp");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(save));
            oos.writeObject(mcli);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        load().run();
    }
}
