package javaFile;
import java.util.Comparator;
import java.util.List;

public class NameSortStrategy implements SortStrategy {
    @Override
    public void customSort(List<Person> people) {
        // YOU ARE NOT ALLOWED TO MODIFY THE CODE ABOVE THIS COMMENT !!
        // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
    	Comparator<Person> cmp = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return String.valueOf(o1.getName()).compareTo(String.valueOf(o2.getName()));
			}}; people.sort(cmp);
    }

}
