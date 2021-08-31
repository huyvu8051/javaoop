package OOP;

import java.util.Comparator;

public class AnPhamComparator implements Comparator<AnPham> {

	@Override
	public int compare(AnPham o1, AnPham o2) {
		int compare = o1.getTieuDe().compareTo(o2.getTieuDe());
		if (compare == 0) // tiêu đề giống nhau -> compare bằng năm xuất bản
			return o2.getNamXuatBan() - o1.getNamXuatBan();
		return compare;
	}

}
