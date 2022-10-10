package project01;

public class Evaluator {

	private Evaluator() {}

	public static Evaluator getEvaluator(){
		return new Evaluator();
	}

	String evaluate(Paper paper){
		return "pass";
	}

}
