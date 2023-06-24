/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakery;

/**
 *
 * @author Arnella
 */
public class KomposisiRotiManisPerPcs extends KomposisiRotiManis {
    
     // Hitung bahan per pcs rotiManis
    double teriguPcsRotiManis = this.rotiManisTerigu / this.rotiManisPcs;
    double gulaPcsRotiManis = this.rotiManisGula / this.rotiManisPcs;
    double butterPcsRotiManis = this.rotiManisButter / this.rotiManisPcs;
    double ragiPcsRotiManis = this.rotiManisRagi / this.rotiManisPcs;
    double susuBubukPcsRotiManis = this.rotiManisSusuBubuk / this.rotiManisPcs;
    double susuCairPcsRotiManis = this.rotiManisSusuCair / this.rotiManisPcs;
    double TelurPcsRotiManis = this.rotiManisTelur / this.rotiManisPcs;
    double esPcsRotiManis = this.rotiManisEs / this.rotiManisPcs;
    
}
