package com.company;

public class NombreSecret {
    /* Classe que genera numeros aleatoris per jugar al adivinar-los i els comprova
     * tant si rep un numero o un string.
     */

    private int num;

    public NombreSecret() {
        num = 0;
    }

    public NombreSecret(int n) {
        pensa(n);
    }

    public void pensa(int max) {

        setNum((int) ((Math.random()*max)+1));
        System.out.println("Combinación ganadora es " + getNum());
    }

    public int comprova(int n) {
        if(num==n) return 0;
        else if(num<n) return 1;
        else return 2;
    }

    public String comprova(String s) {
        int n = Integer.parseInt(s);
        if(num==n) return "Correcte";
        else if(num<n) return "Més petit";
        else return "Més gran";
    }

    public int getNum() {
        return num;
    }

    private void setNum(int num) {
        this.num = num;
    }


}
