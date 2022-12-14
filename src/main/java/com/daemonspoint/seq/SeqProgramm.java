package com.daemonspoint.seq;

public class SeqProgramm {
    public static void main(String[] args) {
        try {
            boolean pause = true;
            boolean ausgabe = true;
            int startwert = 0;
            int endwert = 0;
            int schrittweite = 1;
            int maxDurchgang = 0;
            int jetztDurchgang = 1;
            if (args.length == 0) {
                System.out.println("fehlender Operand");
                System.exit(0);
            }
            if (args.length == 1) {
            	startwert= 1;
                endwert= Integer.parseInt(args[0]);
            }
            if (args.length == 2) {
                startwert = Integer.parseInt(args[0]);
                endwert =  Integer.parseInt(args[1]); 
            }	
            if (args.length == 3) {
                startwert = Integer.parseInt(args[0]);
                schrittweite = Integer.parseInt(args[1]);
                endwert = Integer.parseInt(args[2]);
            }
            maxDurchgang = ((endwert - startwert) / schrittweite) + 1;
	    // START-A----START-A----START-A----START-A----START-A----START-A----
	    //
	    // Die nachfolgende Schleife steht sinnbildlich für ein kompliziertes
	    // Konstrukt, das sich über mehrere Bildschirmseiten "zieht". Es soll
	    // "schwer verständlich" und unübersichtlich sein. Deshalb will man
	    // es nur an einer Stelle haben
	    //
            for (int i = startwert; jetztDurchgang <= maxDurchgang; jetztDurchgang++, i = i + schrittweite) {
                // START-B----START-B----START-B----START-B----START-B----START-B----
                //
                // Die nachfolgende Pause steht sinnbildlich für ein weiteres kompliziertes
                // Konstrukt, das sich über mehrere Bildschirmseiten "zieht". Es soll
                // "schwer verständlich" und unübersichtlich sein. Deshalb will man
                // es nur an einer Stelle haben
                if (pause == true) {
                    Thread.sleep(1000);
                }
                // ENDE-B----ENDE-B----ENDE-B----ENDE-B----ENDE-B----ENDE-B----

                // START-C----START-C----START-C----START-C----START-C----START-C----
                //
                // Die nachfolgende "Ausgabeweiche" steht sinnbildlich für ein drittes kompliziertes
                // Konstrukt, das sich über mehrere Bildschirmseiten "zieht". Es soll
                // "schwer verständlich" und unübersichtlich sein. Deshalb will man
                // es nur an einer Stelle haben
                if (ausgabe == true) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    } else {
                        System.err.println(i);
                    }
                } else {
                    System.out.println(i);
                }
                // ENDE-C----ENDE-C----ENDE-C----ENDE-C----ENDE-C----ENDE-C----
                // ENDE-A----ENDE-A----ENDE-A----ENDE-A----ENDE-A----ENDE-A----
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fehlender Operand");
        }
    }
}

