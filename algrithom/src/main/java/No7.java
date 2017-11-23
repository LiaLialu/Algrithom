import java.util.Stack;

/**
 * Created by lu.jie on 2017/11/23.
 */
public class No7 {

    public int reverse(int x) {
        long result = 0;
        int tail = 0;
        while(x!=0){
            tail = x % 10;
            result = result*10 + tail;
            if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
                return 0;
            }
            x = x / 10;
        }
        return (int) result;
    }

//    public int reverse(int x) {
//        StringBuffer result = new StringBuffer("");
//        if(x<0){
//            result.append("-");
//        }
//        x = Math.abs(x);
//        char[] number = String.valueOf(x).toCharArray();
//        Stack s = new Stack();
//        for(int i=0; i<number.length; i++){
//            s.push(number[i]);
//        }
//        while(!s.isEmpty()){
//            result.append(String.valueOf(s.pop()));
//        }
//        Integer rrr = 0;
//        try{
//            rrr = Integer.valueOf(result.toString());
//        }catch(Exception e){
//            rrr = 0;
//        }
//        System.out.println(rrr);
//        return rrr;
//
//    }

    public static void main(String[] args){
        No7 s = new No7();
        s.reverse(123);
        s.reverse(-324);
        s.reverse(0);
        s.reverse(999999999);
        s.reverse(120);

    }
}
