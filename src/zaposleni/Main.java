package zaposleni;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
 
        AktivanRadnik ar = new AktivanRadnik();
        ar.ucitajPodatkeIzDatoteke("radnik.txt");
        ar.ispisiPlatuUDatoteku("plata.txt");
        
        RadnikNaBolovanju rb = new RadnikNaBolovanju();
        rb.ucitajPodatkeIzDatoteke("radnik.txt");
        rb.ispisiPlatuUDatoteku("plata2.txt");

    }
}


