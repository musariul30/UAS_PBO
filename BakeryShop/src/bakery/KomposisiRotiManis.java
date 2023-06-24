/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class KomposisiRotiManis extends HargaPerGram{
    double rotiManisTerigu = 1000;
    double rotiManisGula = 150;
    double rotiManisButter = 150;
    double rotiManisRagi = 20;
    double rotiManisSusuBubuk = 300;
    double rotiManisSusuCair = 250;
    double rotiManisTelur = 80;
    double rotiManisEs = 400;
    double rotiManisTotal = 2350;
    double rotiManisBeratPcs = 50;
    
    // Hitung banyak pcs rotiManis per adonan
    double rotiManisPcs = this.rotiManisTotal / this.rotiManisBeratPcs;
    
}
