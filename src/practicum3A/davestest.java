package practicum3A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practicum2B.Voetbalclub;

class davestest {
    @Test
    void naamControleLeeg(){
        Voetbalclub ajx = new Voetbalclub("");
        assertSame("FC", ajx.getClubnaam(), "De naam is leeg en er hoort dan FC te staan" );
    }
    @Test
    void naamControleNull(){
        Voetbalclub ajx = new Voetbalclub(null);
        assertSame("FC", ajx.getClubnaam(), "De naam is leeg en er hoort dan FC te staan" );
    }
    @Test
    void verwerkFout(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('w');
        assertEquals(3, feij.aantalPunten(), "De punten zijn niet wat het zou moeten zijn." );
    }
    @Test
    void verwerkFout2(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('g');
        assertEquals(1, feij.aantalPunten(), "De punten zijn niet wat het zou moeten zijn." );
    }
    @Test
    void verwerkFout3(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('v');
        assertEquals(0, feij.aantalPunten(), "De punten zijn niet wat het zou moeten zijn." );
    }
    @Test
    void foutieveInvoer(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('e');
        feij.verwerkResultaat('w');
        assertEquals(3, feij.aantalPunten() );
    }
    @Test
    void foutieveInvoer2(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('e');
        feij.verwerkResultaat('w');
        assertEquals(1, feij.aantalGespeeld() );
    }
    @Test
    void stringCheck() {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('w');
        assertEquals("Feijenoord: 1-1-0-0-3", feij.toString(), "De toString voor een overwinning klopt niet" );
    }
    @Test
    void stringCheck2(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('g');
        assertEquals("Feijenoord: 1-0-1-0-1", feij.toString(), "De toString voor een gelijkspel klopt niet" );
    }
    @Test
    void stringCheck3(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('v');
        assertEquals("Feijenoord: 1-0-0-1-0", feij.toString(), "De toString voor een verlies klopt niet" );
    }
    @Test
    void herhaling(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        for(int i = 0 ;i<=9;i++){
            feij.verwerkResultaat('w');
        }
        assertEquals(30, feij.aantalPunten(), "Het herhaaldelijk verwerken ging niet goed");
    }
    @Test
    void herhaling2(){
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        for(int i = 0 ;i<=9;i++){
            feij.verwerkResultaat('w');
        }
        assertEquals(10, feij.aantalGespeeld(), "Het herhaaldelijk verwerken ging niet goed");
    }
}
