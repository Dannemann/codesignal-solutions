package _02_centuryFromYear;

class MathCeil extends AbstractSolution {

	int centuryFromYear(int year) {
		return (int) Math.ceil(year / 100D);
	}

}
