package app;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
    
    private ArrayList<Carta> cartas = new ArrayList<>();
    private int cuentaTotal = 0;

    public Mazo() {
        this.cartas.add(new Carta("corazones", "A"));
        this.cartas.add(new Carta("corazones", "2"));
        this.cartas.add(new Carta("corazones", "3"));
        this.cartas.add(new Carta("corazones", "4"));
        this.cartas.add(new Carta("corazones", "5"));
        this.cartas.add(new Carta("corazones", "6"));
        this.cartas.add(new Carta("corazones", "7"));
        this.cartas.add(new Carta("corazones", "8"));
        this.cartas.add(new Carta("corazones", "9"));
        this.cartas.add(new Carta("corazones", "10"));
        this.cartas.add(new Carta("corazones", "J"));
        this.cartas.add(new Carta("corazones", "Q"));
        this.cartas.add(new Carta("corazones", "K"));
        
        this.cartas.add(new Carta("diamantes", "A"));
        this.cartas.add(new Carta("diamantes", "2"));
        this.cartas.add(new Carta("diamantes", "3"));
        this.cartas.add(new Carta("diamantes", "4"));
        this.cartas.add(new Carta("diamantes", "5"));
        this.cartas.add(new Carta("diamantes", "6"));
        this.cartas.add(new Carta("diamantes", "7"));
        this.cartas.add(new Carta("diamantes", "8"));
        this.cartas.add(new Carta("diamantes", "9"));
        this.cartas.add(new Carta("diamantes", "10"));
        this.cartas.add(new Carta("diamantes", "J"));
        this.cartas.add(new Carta("diamantes", "Q"));
        this.cartas.add(new Carta("diamantes", "K"));
        
        this.cartas.add(new Carta("treboles", "A"));
        this.cartas.add(new Carta("treboles", "2"));
        this.cartas.add(new Carta("treboles", "3"));
        this.cartas.add(new Carta("treboles", "4"));
        this.cartas.add(new Carta("treboles", "5"));
        this.cartas.add(new Carta("treboles", "6"));
        this.cartas.add(new Carta("treboles", "7"));
        this.cartas.add(new Carta("treboles", "8"));
        this.cartas.add(new Carta("treboles", "9"));
        this.cartas.add(new Carta("treboles", "10"));
        this.cartas.add(new Carta("treboles", "J"));
        this.cartas.add(new Carta("treboles", "Q"));
        this.cartas.add(new Carta("treboles", "K"));
        
        this.cartas.add(new Carta("picas", "A"));
        this.cartas.add(new Carta("picas", "2"));
        this.cartas.add(new Carta("picas", "3"));
        this.cartas.add(new Carta("picas", "4"));
        this.cartas.add(new Carta("picas", "5"));
        this.cartas.add(new Carta("picas", "6"));
        this.cartas.add(new Carta("picas", "7"));
        this.cartas.add(new Carta("picas", "8"));
        this.cartas.add(new Carta("picas", "9"));
        this.cartas.add(new Carta("picas", "10"));
        this.cartas.add(new Carta("picas", "J"));
        this.cartas.add(new Carta("picas", "Q"));
        this.cartas.add(new Carta("picas", "K"));
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public int getCuentaTotal() {
        return cuentaTotal;
    }
    
    public Carta getCarta() {
        Random rand = new Random();
        int index = rand.nextInt(this.cartas.size());
        
        Carta carta = this.cartas.remove(index);
        this.cuentaTotal += carta.getCuenta();
        
        return carta;
    }
}
