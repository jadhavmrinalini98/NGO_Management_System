/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Network;

import Model.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Mrinalini
 */
public class Network {
    private String name;
    private EnterpriseDirectory entDir;

    public EnterpriseDirectory getEntDir() {
        return entDir;
    }

    public void setEntDir(EnterpriseDirectory entDir) {
        this.entDir = entDir;
    }
    
    public Network(){
        entDir=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }    
}
