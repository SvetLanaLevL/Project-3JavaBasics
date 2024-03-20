public class C7 {
    /*
    Maximum and minimum number in the array?
 */
    public static void main(String[] args) {
        int[]num={10,20,5,30,42,100};
        int bigNum=0;
        for(int n:num){
            if(n>bigNum){
                bigNum=n;
            }

        }
        System.out.println(bigNum);
    }
}
