package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		NoiThat nt = new Tu(1, 1, 1, 1, "Lim", true);
		NoiThat nt2 = new Ghe(1, 1, 1, 1);
		
		NoiThat nt3 = new Ban(1, 1, 1, 1, true, "Lim");
		
//		nt.input();
//		nt.output();
		
		//DonHang dh = new DonHang();
//		dh.input();
//		dh.output();
		System.out.println("\n" + DonHang.getTongTien());
		
		// thêm dssp vào đơn hàng
		List<NoiThat> dssp = new ArrayList<>();
		dssp.add(nt);
		dssp.add(nt2);
		dssp.add(nt3);
		DonHang dh = new DonHang("1" , "1", "1", dssp);
//		dh.setDsSanPham(dssp);
		dh.output();
		
		
		// 6
		double max = 0;
		int index = 0;
		
		for(int i = 0; i < dh.getDsSanPham().size(); i++) {
			NoiThat temp = dh.getDsSanPham().get(i);
			if(temp.getGiaTien() > max) {
				max = temp.getGiaTien();
				index = i;
			}
		}
		
		dh.getDsSanPham().get(index).output();
		
		System.out.println("\nSorted");
		Collections.sort(dh.getDsSanPham(), new NoiThatComparator());
		dh.output();
		
	}
}
