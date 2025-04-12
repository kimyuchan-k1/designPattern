package jobda_test;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String[] arr = {"h","e",";","l","BS"};
        int N =5;
        String s = "hello";
        int[][] Axis = {{1,2},{1,3},{1,4}};
        for (int[] axi : Axis) {
            
        }
        s.contains("_");
        s.substring(0);
        String result = solution(N,arr);
        System.out.println(result);
    }

    public static String solution(int N, String[] Action) {
        String answer = "";
        String backspace = "BS";
        int MaxN = Action.length;
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < MaxN; i++) {
            String s = Action[i];
            if(s.equals(backspace) ) {
                sb.deleteCharAt(i-1);
            } else{
                sb.append(Action[i]);
            }

        }
        answer = sb.toString();


        return answer;
    }

    public static int calculateMinDistanceX(int N, int[] X) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<N; i++) {
            // 미니멈과 맥시멈을 판별한다.
            min = Math.min(X[i],min);
            max = Math.max(X[i],max);
        }

        int result = (max - min);
        return result;

    }
}
