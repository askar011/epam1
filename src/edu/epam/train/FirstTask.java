package edu.epam.train;

public class FirstTask {

    public static void main(String[] args) {
            System.out.printf("Hello %s\n", args[0]);
            reverseArgs(args);
            printWithoutStep(args);
        printWithStep(args);
    }


    private static void reverseArgs(String [] args){
        for (int i = args.length - 1;i >= 0;i--){
            System.out.print(args[i]);
        }
        System.out.println();
    }

    private static void printWithoutStep(String [] args) {
        for (int i = 0 ; i < args.length;i++){
            System.out.print(args[i]);
        }
        System.out.println();
    }
    private static void printWithStep(String [] args) {
        for (int i = 0 ; i < args.length;i++){
            System.out.println(args[i]);
        }
    }
    public static int sum(String []args){
        int res = 0;
        for (int i = 0; i < args.length;i++){
            res += Integer.parseInt(args[i]);
        }
        return res;
    }

}
