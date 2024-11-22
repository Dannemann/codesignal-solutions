package _02_centuryFromYear;

class Favorite_Plus99Divide extends AbstractSolution {

    /**
     * This is a trick to keep the range between 2000-2099, after adding 99 to
     * 1901-2000 (20th century), for example, making the division by 100 always
     * correct.
     */
    int centuryFromYear(int year) {
        return (year + 99) / 100;
    }

}
