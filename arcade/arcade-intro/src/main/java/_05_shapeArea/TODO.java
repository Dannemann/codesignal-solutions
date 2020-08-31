package _05_shapeArea;

// TODO: Explain this one. Does this make sense or it's just troll?
class TODO extends AbstractSolution {

	int shapeArea(int n) {
		int baseLength = (2 * n) - 1;
		int terimSayisi = (((baseLength - 2) - 1) / 2) + 1; // terimSayisi means "number of terms" (Turkish->English).
		return (((((baseLength - 2) + 1) / 2) * terimSayisi) * 2) + baseLength;
	}

}
