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
            for (int i = startwert; jetztDurchgang <= maxDurchgang; jetztDurchgang++, i = i + schrittweite) {
                if (pause == true) {
                    Thread.sleep(1000);
                    if (ausgabe == false) {
                        System.out.println(i);
                    }
                }
                if (ausgabe == true) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    } else {
                        System.err.println(i);
                    }
                }
                if (pause == false && ausgabe == false) {
                    System.out.println(i);
                }
            }     
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fehlender Operand");
        }
    }
}

