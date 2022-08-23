package baekjoon.array.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int MAX = 0;
        int MIN = 0;

        if(N>=1 && N<=1000000) {
            int[] arr = new int[N];
            // System.out.println(arr.length + " 길이를 가진 배열이 생성되었습니다.");
            int flag = 0;
            while(flag<arr.length) {
                // System.out.println(flag + "열을 입력하세요");
                int arrInt = sc.nextInt();
                if(arrInt>=-1000000 && arrInt<=1000000) {
                    arr[flag] = arrInt;
                    flag++;
                }
            }
            MAX = arr[0];
            MIN = arr[0];
            for(int i=0; i<arr.length; i++) {
                if(arr[i]>MAX) {
                    MAX = arr[i];
                }
                if(arr[i]<MIN) {
                    MIN = arr[i];
                }
            }
            System.out.printf("%d %d", MIN, MAX);
        }
    }

}
