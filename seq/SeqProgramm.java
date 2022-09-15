public class SeqProgramm {
    public static void main(String[] args) {
        try {
            if (args.length == 1) {
                int param1= Integer.parseInt(args[0]);
                for(int i= 1; i <= param1; i++) {
                    Thread.sleep(1000);
                    System.out.println(i);
                }      
            }
            if (args.length == 2) {
                int param1= Integer.parseInt(args[0]);
                int param2= Integer.parseInt(args[1]);
                for (int i= param1; i <= param2; i++) {
                    Thread.sleep(1000);
                    System.out.println(i);
                }
            }	
            if (args.length == 3) {
                int param1= Integer.parseInt(args[0]);
                int param2= Integer.parseInt(args[1]);
                int param3= Integer.parseInt(args[2]);
                for (int i= param1; i <= param3; i=i+param2) {
                    Thread.sleep(1000);
                    System.out.println(i);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
