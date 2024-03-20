public class C3 {
    /*
    Create an array of integer values. After the array is created,
    calculate the sum of all stored elements in that array.

     */
    public static void main(String[] args) {

        int[]num={10,20,55,30,42,100};
        int sum=0;
        for(int i=0; i<=num.length-1; i++){
            sum=sum+num[i];
        }
        System.out.println("The sum is:" +sum);




    }
}
