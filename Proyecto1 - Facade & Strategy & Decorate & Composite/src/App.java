package com.proyecto1;

import com.proyecto1.*;
import com.proyecto1.composite.*;
import com.proyecto1.decorator.*;
import com.proyecto1.stategy.*;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.LinkedList;

/**
 * Clase App: esta es la clase principal donde esta el main
 *
 */
public class App {

    public static void main( String[] args){
    	UsuarioFarcade farcade = new UsuarioFarcade();
    	farcade.cargaDeDatosDePrueba();
    	farcade.menu();
    }
}
