import java.util.Scanner;

public class Sovling_Problems_Leesungeun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int[] myAnswers = new int[4];

        System.out.println("1. Python에서 변수를 선언하는 방법은? (점수: 10점)");
        System.out.println("1) var name  2) name = value  3) set name  4) name == value");
        System.out.print("-정답: ");
        myAnswers[0] = scanner.nextInt();
        if(myAnswers[0] == 2){
            score += 10;
        }

        System.out.println("2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        System.out.println("1) 순서가 있고 변경 가능하다  2) 중복된 값을 가질 수 없다  3) 원소를 추가하거나 삭제할 수 없다  4) 정렬된 상태로 유지된다");
        System.out.print("-정답: ");
        myAnswers[1] = scanner.nextInt();
        if(myAnswers[1] == 1){
            score += 15;
        }

        System.out.println("3. Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        System.out.println("1) if-else  2) for-in  3) while  4) def");
        System.out.print("-정답: ");
        myAnswers[2] = scanner.nextInt();
        if(myAnswers[2] == 1){
            score += 10;
        }

        System.out.println("4. Python에서 함수를 정의하는 방법은? (점수: 5점)");
        System.out.println("1) class  2) def  3) import  4) return");
        System.out.print("-정답: ");
        myAnswers[3] = scanner.nextInt();
        if(myAnswers[3] == 2){
            score += 5;
        }

        System.out.println("—----- 결과 —-------------");
        System.out.println("응답한 내용: 1번: " + myAnswers[0] + ", 2번: " + myAnswers[1] +
                ", 3번: " + myAnswers[2] + ", 4번: " + myAnswers[3]);
        System.out.println("당신 응답 합계: " + score + "점");

        char grade;
        if(score == 40){
            grade = 'A';
        } else if(score >= 30){
            grade = 'B';
        } else if(score >= 20){
            grade = 'C';
        } else if(score >= 10){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("학점은 " + grade + "입니다.");
    }
}
