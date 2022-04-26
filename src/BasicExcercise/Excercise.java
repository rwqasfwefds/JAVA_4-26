package BasicExcercise;

import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class Excercise {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 3, 60, -3};
        // System.out.println("===== 연습문제 1 =====");
        // System.out.println(arr[1]);

        // System.out.println("===== 연습문제 2 =====");
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == 5){
        //         System.out.println(i);
        //     }
        // }

        // System.out.println("===== 연습문제 3 =====");
        // int sum = 0;
        // double average = 0;
        // for(int i = 0; i < arr.length; i++){
        //     sum += arr[i];
        // }
        // average = sum / (double)arr.length;
        // System.out.println("총합 = " + sum);
        // System.out.printf("평균 = %.2f", average);

        // System.out.println("===== 연습문제 4 =====");
        // for(int i = 0; i < arr.length; i++){
        //     if(i == 3){
        //         continue;
        //     }
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println("===== 연습문제 5 =====");
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("변경하고 싶은 값의 인덱스 번호 입력>>");
        // String str1 = scanner.nextLine();
        // int in = Integer.parseInt(str1);

        // System.out.println("변경하고 싶은 값 입력 >>");
        // String str2 = scanner.nextLine();
        // int in2 = Integer.parseInt(str2);

        // for(int i = 0; i < arr.length; i++){
        //     if(i == in){
        //         arr[i] = in2;
        //     }
        //     System.out.print(arr[i] + ", ");
        // }

        // System.out.println("===== 연습문제 6 =====");
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("서로 교환할 두 개의 인덱스 중 첫 번째 인덱스 번호를 입력해주세요");
        // int int1 = scanner.nextInt();

        // System.out.println("서로 교환할 두 개의 인덱스 중 두 번째 인덱스 번호를 입력해주세요");
        // int int2 = scanner.nextInt();

        // // 값 바꾸기
        // int tmp = arr[int1];
        // arr[int1] = arr[int2];
        // arr[int2] = tmp;

        // System.out.println(Arrays.toString(arr));

        // System.out.println("===== 연습문제 7 =====");
        // int MAX = arr[0];
        // int MIN = arr[0];

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] > MAX){
        //         MAX = arr[i];
        //     } else if(arr[i] < MIN){
        //         MIN = arr[i];
        //     }
        // }
        // System.out.println("최대값 = " + MAX + ", 최소값 = " + MIN);

        // System.out.println("===== 연습문제 8 =====");
        // char[] chArr = new char[26];

        // for(int i = 65; i <= 90; i++){
        //     chArr[i - 65] = (char)i;
        // }
        // System.out.println(Arrays.toString(chArr));

        // 답안
        // char[] chArr = new char[26];

        // // 숫자로 바꾸어야 for 반복문을 쓸 수 있음
        // for(int i = 0; i < chArr.length; i++){
        //     // 문자를 아스키코드 숫자로 바꾸면 
        //     // 'A' => 65
        //     // 'A' => 아스키코드 'A' + 0
        //     // 65 => 문자 (char)65
        //     chArr[i] = (char)(65 + i);
        //     System.out.print(chArr[i] + " ");
        // }


        // System.out.println("===== 연습문제 9 =====");
        // char[] chArr = new char[26];

        // for(int i = 65; i <= 90; i++){
        //     chArr[i - 65] = (char)i;
        // }

        // for(int i = chArr.length - 1; i >= 0; i--){
        //     System.out.print(chArr[i] + ", ");
        // }

        // System.out.println("===== 연습문제 10 =====");
        // int[] intArr = new int[10];

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("양의 정수 10개를 입력하세요");
        // for(int i = 0; i < 10; i++){
        //     int inte = scanner.nextInt();
        //     intArr[i] = inte;

        //     if(intArr[i] % 3 == 0){
        //         System.out.print(intArr[i] + " ");
        //     }
        // }

        
        System.out.println("===== 연습문제 11 =====");
        // HASHMAP을 이용한 풀이
        HashMap h = new HashMap();
        h.put("Java", 95);
        h.put("Python", 88);
        h.put("Android", 76);
        h.put("JSP", 62);
        h.put("HTML", 55);

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("과목을 입력하시면 점수가 나옵니다.");
            String s = scanner.nextLine().trim();

            if(h.containsKey(s)){
                System.out.println(h.get(s) + "점");
                System.out.println("==============================");
                continue;
            } else if(s.equals("그만")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        // equals를 쓰는 이유는 그냥 == 비교연산자만 하면 주소값을 비교함 책 331p를 보셈

        // 배열을 이용한 풀이
        
        // String[] strArr = {"Java", "Python", "Android", "JSP", "HTML"};
        // int[] intArr = {95, 88, 76, 62, 55};

        // Scanner scanner = new Scanner(System.in);

        // while(true){
        //     System.out.println("과목을 입력하시면 점수가 나옵니다.");
        //     String s = scanner.nextLine().trim();
            
        //     for(int i = 0; i < strArr.length; i++){
        //         if(strArr[i].equals(s)){
        //             System.out.println(intArr[i] + "점");
        //             System.out.println("==============================");
        //             continue;
        //         }
        //     }
        //     if(s.equals("그만")){
        //         System.out.println("프로그램을 종료합니다.");
        //         break;
        //     }
        // }

    }
}
