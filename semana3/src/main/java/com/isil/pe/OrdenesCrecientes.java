package com.isil.pe;

public class OrdenesCrecientes {

    static int constante (int n){
        return 2;
    }

    static int logaritmo (int n) {
        int c=0;
        while (n>1){
            n/=2;
            c++;
        }
        return c;
    }

    static int lineal(int n){
        int c = 0;
        for(int i = 0; i<n; i++){
            c++;
        }
        return c;
    }
}
