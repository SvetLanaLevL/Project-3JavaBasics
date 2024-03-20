public class C10 {
    /*
    Write a program to print out duplicate elements from an Array of Strings?

     */
    public static void main(String[] args) {
        int [] num={10,20,100,30,42,100};
        for(int i =0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i]==num[j]){
                    System.out.println(num[j]);
                }
            }
        }


    }
}
