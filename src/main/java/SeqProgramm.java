public class SeqProgramm {
    public static void main(String[] args) {
        try {
            boolean pause = Boolean.parseBoolean(args[0]);
            boolean ausgabe = Boolean.parseBoolean(args[1]);
            int Startwert= 0;
            int Endwert= 0;
            int Schrittweite= 1;
            if (args.length == 3) {
            	Startwert= 1;
                Endwert= Integer.parseInt(args[2]);
                if(Endwert < 0){
                    System.exit(0);
                }
            }
            if (args.length == 4) {
                Startwert= Integer.parseInt(args[2]);
                Endwert=  Integer.parseInt(args[3]);
                if(Startwert > Endwert){
                    System.exit(0);
                }     
            }	
            if (args.length == 5) {
                Startwert= Integer.parseInt(args[2]);
                Schrittweite= Integer.parseInt(args[3]);
                Endwert= Integer.parseInt(args[4]);
                if(Startwert < Endwert && Schrittweite < 0 || Startwert > Endwert && Schrittweite > 0){
                    System.exit(0);
                }
            }
            if(Startwert < Endwert){
                for(int i= Startwert; i <= Endwert; i= i + Schrittweite) {
                    if(pause == true){
                        Thread.sleep(1000);
                    }
                    if(ausgabe == true){
                        if (i % 2 == 0) {
                            System.out.println(i);
                        } else {
                            System.err.println(i);
                        }
                    }
                    if(pause == false && ausgabe == false){
                        System.out.println(i);
                    }
                }
            if(Startwert > Endwert){
                for(int i= Startwert; i >= Endwert; i = i+ Schrittweite){
                    if(pause == true){
                        Thread.sleep(1000);
                    }
                    if(ausgabe == true){
                        if (i % 2 == 0) {
                            System.out.println(i);
                        } else {
                            System.err.println(i);
                        }
                    }
                    if(pause == false && ausgabe == false){
                        System.out.println(i);
                }
            }          
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

