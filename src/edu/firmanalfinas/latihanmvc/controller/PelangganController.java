/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firmanalfinas.latihanmvc.controller;

import edu.firmanalfinas.latihanmvc.model.PelangganModel;
import edu.firmanalfinas.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Firman Alfinas
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtNama().getText();    
        String email = view.getTxtEmail().getText();
        String notlp = view.getTxtNotlp().getText();
        
        if (nama.equals("") && email.equals("") && notlp.equals("")){
        }else{
            model.resetForm();
        }   
    
    }
    
    public void simpanFrom(PelangganView view){
    
        String nama = view.getTxtNama().getText();    
        String email = view.getTxtEmail().getText();
        String notlp = view.getTxtNotlp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");   
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (notlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong");
        } else {
            model.simpanForm();
        }
    }
    
}
