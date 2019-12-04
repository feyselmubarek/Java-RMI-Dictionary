//1.Ermiyas Gezahegn… ATR /5552/09 ermiyas10080@gmail.com
// 2.Fasil Beshiwork … ATR/9359/09 …. fasilbeshiwork17@gmail.com
// 3. Feysel Mubarek … ATR/5064/09…feyselmubarek@gmail.com
// 4.Habte Assefa… ATR/0081/09…. habteasefa726@gmail.com
// 5. Hana Tesfaye.…. ATR/4224/09…. hanatesfaye223@gmail.com

package com.company;

import com.company.service.ServerService;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Registry registry = LocateRegistry.createRegistry(7070);
            ServerService dictionaryService = new FileUtilities();
            registry.rebind("dictionaryService", dictionaryService);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

