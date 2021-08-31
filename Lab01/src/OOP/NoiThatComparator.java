package OOP;

import java.util.Comparator;

public class NoiThatComparator implements Comparator<NoiThat>{

	@Override
	public int compare(NoiThat o1, NoiThat o2) {
		double compare = o2.getGiaTien() - o1.getGiaTien();
		if(compare == 0d) {
			return o1.getLoaiSP().compareTo(o2.getLoaiSP());
		}
		return (int) compare;
	}

}
