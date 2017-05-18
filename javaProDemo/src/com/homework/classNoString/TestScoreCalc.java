package com.homework.classNoString;

public class TestScoreCalc {

	public static void main(String[] args) {
		ScoreCalc score = new ScoreCalc();
		score.java = 80;
		score.cSharp = 70;
		score.db = 82;
		
		score.showAvg();
		score.showTotleScore();

	}

}
