/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.sql.Date;
import ma.projet.beans.Employe;
import ma.projet.beans.Message;
import ma.projet.service.EmployeService;
import ma.projet.service.MessageService;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args) {
        EmployeService es = new EmployeService();
        MessageService ms = new MessageService();
      
      // Créez 3 employés
        Employe employe1 = new Employe("LACHGAR", "Mohamed");
        Employe employe2 = new Employe("RAMI", "ALI");
        Employe employe3 = new Employe("SAFI", "Fatima");

        es.create(employe1);
        es.create(employe2);
        es.create(employe3);

       //Modification d'un employe
Employe e = es.getById(3);
if (e != null) {
 e.setNom("ALAOUI");
 e.setPrenom("Manale");
 es.update(e);
}

// liste des employee
for (Employe em : es.getAll())
    System.out.println(""+em.getNom());




// Les messages reçus par l'employé 3
for (Message m : ms.getAll()) {
    if (m.getIdR() == 3) {
        System.out.println(m.getSujet());
    }
}



    }
}