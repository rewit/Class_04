package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_02 {

	public static void main(String[] args) {

		/*
		 * ScoreVO 배열을 5개 생성하고 키보드로부터 5명 학생의 학번, 구겅, 영어, 수학점수를 입력받고 각 배열에 저장한 후 리스트를
		 * toString() 으로 보이시오
		 */
		ScoreVO[] sVO = new ScoreVO[5];
		Scanner scan = new Scanner(System.in);

//		for (int i = 0; i < sVO.length; i++) {
//			sVO[i] = new ScoreVO();
//		}

		for (int i = 0; i < sVO.length; i++) {

			sVO[i] = new ScoreVO();

			System.out.println("학번");
			String strNum = scan.nextLine();

			System.out.println("국어점수");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);

			System.out.println("영어점수");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);

			System.out.println("수학점수");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);

			sVO[i].setNumber(strNum);
			sVO[i].setKor(intKor);
			sVO[i].setEng(intEng);
			sVO[i].setMath(intMath);
		}
		for (int i = 0; i < sVO.length; i++) {
			System.out.println(sVO[i].toString());
		}
	}
}
