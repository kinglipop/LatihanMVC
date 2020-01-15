/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firmanalfinas.latihanmvc.model;
import edu.firmanalfinas.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Firman Alfinas
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String notlp;
    
    private PelangganListener pelangganlistener;

    public PelangganListener getPelangganlistener() {
        return pelangganlistener;
    }

    public void setPelangganlistener(PelangganListener pelangganlistener) {
        this.pelangganlistener = pelangganlistener;
    }
 
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganlistener != null){
            pelangganlistener.onChange(this);
        }
            
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNotlp("");

    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        resetForm();
    }

}
