package seq;
public class SeqOutErr {
    public static void main(String[] args) {
            int startwert = 1;
            int endwert = 0;
            int schrittweite = 1;
            if (args.length == 0) {
                System.out.println("fehlender Operand");
                System.exit(0);
                return;
            } else if (args.length == 1) {
                endwert = Integer.parseInt(args[0]);
            } else if (args.length == 2) {
                startwert = Integer.parseInt(args[0]);
                endwert =  Integer.parseInt(args[1]); 
            } else if (args.length == 3) {
                startwert = Integer.parseInt(args[0]);
                schrittweite = Integer.parseInt(args[1]);
                endwert = Integer.parseInt(args[2]);
            } else {
                System.out.println("zusätzlicher Operand »" + args[3] + "\"" );
                System.exit(0);
                return;
            }
	    // START-A----START-A----START-A----START-A----START-A----START-A----
	    //
	    // Die nachfolgende Schleife steht sinnbildlich für ein kompliziertes
	    // Konstrukt, das sich über mehrere Bildschirmseiten "zieht". Es soll
	    // "schwer verständlich" und unübersichtlich sein. Deshalb will man
	    // es nur an einer Stelle haben
	    //
            for (int jetztDurchgang = 1, maxDurchgang = ((endwert - startwert) / schrittweite) + 1 ; jetztDurchgang <= maxDurchgang; jetztDurchgang++, startwert = startwert + schrittweite) {
		// START-B----START-B----START-B----START-B----START-B----START-B----
		//
		// Die nachfolgende "Ausgabeweiche" steht sinnbildlich für ein drittes kompliziertes
		// Konstrukt, das sich über mehrere Bildschirmseiten "zieht". Es soll
		// "schwer verständlich" und unübersichtlich sein. Deshalb will man
		// es nur an einer Stelle haben
                if (startwert % 2 == 0) {
                    System.err.println(startwert);
                } else {
                    System.out.println(startwert);
                }
		// ENDE-B----ENDE-B----ENDE-B----ENDE-B----ENDE-B----ENDE-B----
            }
	    // ENDE-A----ENDE-A----ENDE-A----ENDE-A----ENDE-A----ENDE-A----
    }
}

