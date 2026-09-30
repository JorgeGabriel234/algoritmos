package com.isil.pe;

public class AccesoPosicion {

    public static void main(String[] args){
        String[][] comidas = {
                {"Avena", "Cereal", "Huevo", "Yogurt", "Fruta", "Pan tostado", "Hotcakes"},
                {"Pollo", "Lentejitas", "Verduras", "Bistec", "Champiñones", "Espaguetti", "Atun"},
                {"Frijoles", "Tortillas", " Estofado", "Picadiullo", "lasaña", "KFC", "Bembos"}

        };

        String cenaJueves = comidas[2][3];

        System.out.println("cene jueves " + cenaJueves);
    }
}
