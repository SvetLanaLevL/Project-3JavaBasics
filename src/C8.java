public class C8 {
    /*
   Maximum and minimum number in the array?
*/
    public static void main(String[] args) {
        int[]num={10,20,5,30,42,100};
        int smallNum=num[0];
        int largeNum=num[0];
        for(int i=0;i<=5; i++) {
            if (num[i] < smallNum) smallNum = num[i];
            if(num[i] > largeNum) largeNum=num[i];
        }

            System.out.println("The smallest number is:" + smallNum);
            System.out.println("The largest number is:" + largeNum);
            {

            }

        }

    }




