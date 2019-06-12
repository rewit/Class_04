package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_01 {

	public static void main(String[] args) {

		/*
		 * ScoreVO 클래스를 이용한 sVO 객체를 생성하고
		 * 키보드에서 학번, 이름, 국어, 영어, 수학 점수를
		 * 각각 입력받아 sVO 객체의 각 필드에 대입(저장)하고
		 * 저장된 값을 콘솔에 보이시오 
		 */
		
		ScoreVO sVO = new ScoreVO();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학번>");
		String strNum = scan.nextLine();
		
		System.out.println("이름>");
		String strname = scan.nextLine();
		
		System.out.println("국어점수");
		String strkor = scan.nextLine();
		int intkor = Integer.valueOf(strkor);
		
		System.out.println("영어점수");
		String streng = scan.nextLine();
		int inteng = Integer.valueOf(streng);
		
		System.out.println("수학점수");
		String strmath = scan.nextLine();
		int intmath = Integer.valueOf(strmath);
		
		sVO.setNumber(strNum);
		sVO.setName(strname);
		sVO.setKor(intkor);
		sVO.setEng(inteng);
		sVO.setMath(intmath);

		System.out.println(sVO.toString());
	}

}
