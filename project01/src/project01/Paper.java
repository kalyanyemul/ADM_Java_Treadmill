package project01;

public class Paper {
	Evaluator evaluator;
	
	String submit() {
		Evaluator evaluator = Evaluator.getEvaluator();
		return evaluator.evaluate(this);
	}
}
