package _02_centuryFromYear;

class Plus1IfNotCenturyYear extends AbstractSolution {

	int centuryFromYear(int year) {
		if (year % 100 == 0)
			return year / 100;
		else
			return year / 100 + 1;
	}

}
