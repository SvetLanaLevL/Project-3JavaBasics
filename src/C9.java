public class C9 {
    /*
    Write a java program to find the second largest number in the array?

     */
    public static void main(String[] args) {
        int largestNum=0;
        int secLargestNum=0;

        int [] num={10,20,5,30,42,100};
        for(int i =0; i < num.length; i++){
            if(num[i]>largestNum){
                secLargestNum=largestNum;
                largestNum=num[i];

            }else if(num[i]>secLargestNum){
                secLargestNum=num[i];

            }

        }
        System.out.println("The second largest number is:" + secLargestNum);






    }
}
