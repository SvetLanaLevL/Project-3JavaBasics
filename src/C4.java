public class C4 {
    /*
    Create a 2D array or integer type where you will store odd and even numbers.
     Develop a program which will identify/print the even numbers only.

     */
    public static void main(String[] args) {
        int [][]num={{10,15,8},
                     {5,20,30},
                     {24,44,9}
        };
        int [][] num2= new int[3][3];
        num2[0][0]=10;
        num2[0][1]=15;
        num2[0][2]=8;
        num2[1][0]=5;
        num2[1][1]=20;
        num2[1][2]=30;
        num2[2][0]=24;
        num2[2][1]=44;
        num2[2][2]=9;
        for(int i=0; i< num.length; i++){
            for(int j=0; j<num.length;j++){
                if(num[i][j]%2==0){
                    System.out.println(num[i][j]+" ");
                }
            }
        }

        System.out.println();





    }
}
