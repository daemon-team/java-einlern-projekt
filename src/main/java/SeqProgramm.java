public class SeqProgramm {
    public static void main(String[] args) {
        try {
            int Startwert= 0;
            int Endwert= 0;
            int Schrittweite= 1;
            if (args.length == 1) {
            	Startwert= 1;
                Endwert= Integer.parseInt(args[0]);
                if(Endwert < 0){
                    System.exit(0);
                }
            }
            if (args.length == 2) {
                Startwert= Integer.parseInt(args[0]);
                Endwert=  Integer.parseInt(args[1]);
                if(Startwert > Endwert){
                    System.exit(0);
                }    
            }	
            if (args.length == 3) {
                Startwert= Integer.parseInt(args[0]);
                Schrittweite= Integer.parseInt(args[1]);
                Endwert= Integer.parseInt(args[2]);
                if(Startwert < Endwert && Schrittweite < 0 || Startwert > Endwert && Schrittweite > 0){
                    System.exit(0);
                }
            }
            if(Startwert < Endwert){
                for(int i= Startwert; i <= Endwert; i= i + Schrittweite) {
                    Thread.sleep(1000);
                    if (i % 2 == 0 || -i % 2 == 0) {
                        System.out.println(i);
                    } else {
                        System.err.println(i);
                    }
                }
            }
            if(Startwert > Endwert){
                for(int i= Startwert; i >= Endwert; i = i+ Schrittweite){
                    System.out.println(i);
                }
            }      
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

