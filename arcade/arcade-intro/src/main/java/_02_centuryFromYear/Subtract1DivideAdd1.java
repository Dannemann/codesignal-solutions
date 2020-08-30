package _02_centuryFromYear;

class Subtract1DivideAdd1 extends AbstractSolution {

	int centuryFromYear(int year) {
		return --year / 100 + 1;
	}

}
