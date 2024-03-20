public class C5 {
    /*
    Create a 2D array of integers. Develop a program which
    will calculate the sum of  even and odd numbers for that array.

     */
    public static void main(String[] args) {
        int [][]num={{10,15,8},
                     {5,20,30},
                     {24,44,9}};
        int sum=0;
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num.length; j++){
                if(num[i][j]%2==0){
                    sum+=num[i][j];
                }
            }
            System.out.println(sum);
        }



    }
}
