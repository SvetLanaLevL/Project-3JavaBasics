public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class C2 {
        /*
        Create a program that uses an array to store a list of temperatures for a week,
         and then uses a loop to find the highest and lowest temperature for the week.
         */
        public static void main(String[] args) {
            int[] temp = {75, 73, 72, 75, 80, 81, 75};
            int min = temp[0];
            for (int i = 1; i < temp.length; i++) {
                if (temp[i] < min) {
                    min = temp[i];

                }
            }
            System.out.println("The lowest temperature for the week:" +min);
        }
    }

    public static class C1 {
        /*
        Create a program that uses an array to store a list of temperatures for a week,
         and then uses a loop to find the highest and lowest temperature for the week.

         */
        public static void main(String[] args) {
            int [] temp={75,73,72,75,80,81,75};
            int max=temp[0];
            for(int i=1; i<temp.length; i++){
              if(temp[i]>max){
                  max=temp[i];
              }
            }
            System.out.println("The highest temperature for the week:" + max);



        }
    }
}