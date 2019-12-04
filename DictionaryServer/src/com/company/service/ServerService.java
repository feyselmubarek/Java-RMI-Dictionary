package com.company.service;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerService extends Remote {
    String populateTable() throws IOException;
    String getDictionaryData() throws IOException;
    String addWord(String key, String value) throws RemoteException;
    String addDefinition(String key, String value) throws RemoteException;
    String removeWord(String key) throws Exception;
    String get(String key) throws Exception;
}
