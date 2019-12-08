/**
 * Get classifier's class name by a short name
 * */
public static String getClassifierClassName(String classifierName) {
	String className = "";
	switch (classifierName) {
	case "SGD":
		className = SGD.class.toString();
		break;
	case "SGDText":
		className = SGDText.class.toString();
		break;
	case "J48":
		className = J48.class.toString();
		break;
	case "PART":
		className = PART.class.toString();
		break;
	case "NaiveBayes":
		className = NaiveBayes.class.toString();
		break;
	case "NBUpdateable":
		className = NaiveBayesUpdateable.class.toString();
		break;
	case "AdaBoostM1":
		className = AdaBoostM1.class.toString();
		break;
	case "LogitBoost":
		className = LogitBoost.class.toString();
		break;
	case "Bagging":
		className = Bagging.class.toString();
		break;
	case "Stacking":
		className = Stacking.class.toString();
		break;
	case "AdditiveRegression":
		className = AdditiveRegression.class.toString();
		break;
	case "Apriori":
		className = Apriori.class.toString();
		break;
	default:
		className = SGD.class.toString();
	}
	className = className.substring(6);
	return className;
}
 