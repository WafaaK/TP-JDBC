package ma.test;

import java.util.Date;
import ma.beans.Client;
import ma.beans.Service;
import ma.service.ClientService;
import ma.service.ServiceService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lachgar
 */
public class Test {
    public static void main(String[] args) {
        ClientService cs = new ClientService();
        ServiceService ss = new ServiceService();
        
        Client c = new Client("rami", "ali", new Date(), ss.findById(2));
       cs.create(c);
        Client c1 = new Client("meryem", "rachyq", new Date(), ss.findById(12));
        cs.create(c1);
        Client c2 = new Client("kenza", "raki", new Date(), ss.findById(13));
        cs.create(c2);
        Client c3 = new Client("samya", "kouame", new Date(), ss.findById(14));
        cs.create(c3);
        Client c4 = new Client("aya", "kasmi", new Date(), ss.findById(2));
        cs.create(c4);
        
        System.out.println(cs.findById(2));
        cs.delete(cs.findById(2));
        for(Service s : ss.findAll()){
           System.out.println("Service :"+s.getNom());
            for(Client e : cs.findAll()){
                if(e.getService().getId() == s.getId())
                    System.out.println("########## " +e.getNom()+" "+e.getPrenom());
            }
       }
        
        //ss.delete(ss.findById(7));
        
      // ss.create(new Service("Marketing"));
       //ss.create(new Service("Comptablite"));
       //ss.create(new Service("RH"));
       //ss.create(new Service("Informatqiue"));

        
        
    }
}
//}

