package com.Examination;

public class Paper {
	public String submit() {
		Evaluator evaluator = Evaluator.getEvaluator();
		return evaluator.evaluate(this);
	}
}
