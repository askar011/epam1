package optianaltask;

public class ThirdTask {

    public static void main(String[] args) {
//        maxAndMinLength(args);
//        System.out.println(Arrays.toString(sortByLength(args)));
//        biggerThanAverageLength(args);
//        numberWithMinDiffers(args);
//        System.out.println(ascendingNumbers(args));

    }

    public static void maxAndMinLength(String[] args) {
        int maxLength = 0;
        int minLength = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < args.length; i++) {
            int temp = args[i].length();
            if (temp > maxLength) {
                maxLength = temp;
                max = Integer.parseInt(args[i]);
            } else {
                minLength = temp;
                min = Integer.parseInt(args[i]);
            }
        }

        System.out.println("Самое длинное число =" + max + ",длина =" + maxLength + "\n" +
                "Самое длинное число =" + min + ",длина =" + minLength
        );

    }

    public static String[] sortByLength(String[] args) {
        for (int i = args.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {

                if (args[k].length() > args[k + 1].length()) {
                    String tmp = args[k];
                    args[k] = args[k + 1];
                    args[k + 1] = tmp;
                }
            }
        }
        return args;
    }

    public static void biggerThanAverageLength(String [] args){
        double avgLength = avgLength(args);
        for (int i = 0; i < args.length;i++){
            if(args[i].length() > avgLength){
                System.out.println(args[i] + ",длина: " + args[i].length());
            }
        }
    }

    private static double avgLength(String[] args) {
        int sum = 0;
        for (int i = 0 ;i < args.length;i++){
            sum += args[i].length();
        }
        return  (double) sum/args.length;
    }


    public static void numberWithMinDiffers(String []args){
        final String message = "Число,в котором количество различных цифр минимально: ";
        String result = args[0];
        for (int i = 1; i < args.length; i++) {
            if (countDifferentNumbers(result) > countDifferentNumbers(args[i])) {
                result = args[i];
            }
        }
        System.out.println(message + result);
    }


    private static int countDifferentNumbers(String word) {
        int result = 0;
        String[] str = word.split("");
        for (int i = 1; i < str.length; i++) {
            if (Integer.parseInt(str[0]) != Integer.parseInt(str[i])) {
                result++;
            }
        }
        return result;
    }
    // the numbers in which are in strict ascending order
    public static int ascendingNumbers(String [] args){
        int n = 0;
        for (int i = 0; i < args.length; i++) {
            if (ordered(args[i])) {
                n = Integer.parseInt(args[i]);
                break;
            }
        }
        return n;
    }

    public static boolean ordered(String number){
        boolean temp = false;
        String[] n = number.split("");
        if (n.length==1){
            temp = true;
        }
        for (int i = 0; i < n.length-1; i++){
            if (Integer.parseInt(n[i]) <= Integer.parseInt(n[i+1])){
                temp = true;
            } else {
                temp = false;
                break;
            }
        }
        return temp;
    }

}

