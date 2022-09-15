public class SeqProgramm {
    public static void main(String[] args) {
        if (args.length == 1) {
            int param1= Integer.parseInt(args[0]);
                for(int i= 1; i <= param1; i++) {
                    System.out.println(i);
                }
        }
        if (args.length == 2) {
            int param1= Integer.parseInt(args[0]);
            int param2= Integer.parseInt(args[1]);
                for(int i= param1; i <= param2; i++) {
                    System.out.println(i);
                }
        }	
        if (args.length == 3) {
            int param1= Integer.parseInt(args[0]);
            int param2= Integer.parseInt(args[1]);
            int param3= Integer.parseInt(args[2]);
                for(int i= param1; i <= param3; i=i+param2) {
                    System.out.println(i);
                }
        }
    }
}
