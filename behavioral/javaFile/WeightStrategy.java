package javaFile;
import java.util.Comparator;
import java.util.List;

public class WeightStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        // YOU ARE NOT ALLOWED TO MODIFY THE CODE ABOVE THIS COMMENT !!
        // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
    	Comparator<Person> cmp = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return Integer.valueOf(o1.getWeight().compareTo(Integer.valueOf(o2.getWeight())));
			}}; people.sort(cmp);

    }

}
