/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class KomposisiPizza {
    
    // Berat adonan bahan pizza
    double pizzaTerigu = 1000;
    double pizzaGula = 100;
    double pizzaButter = 100;
    double pizzaRagi = 20;
    double pizzaSusuBubuk = 200;
    double pizzaSusuCair = 180;
    double pizzaTelur = 50;
    double pizzaEs = 300;
    double pizzaTotal = 1950;
    double pizzaBeratPcs = 190;
    
    // Hitung banyak pcs pizza per adonan
    double pizzaPcs = this.pizzaTotal / this.pizzaBeratPcs;
}
