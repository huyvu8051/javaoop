package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<AnPham> dsAnPham = new ArrayList<>();

		List<ChuongSach> css = new ArrayList<>();
		css.add(new ChuongSach("Có làm mới có ăn", 69));
		css.add(new ChuongSach("Cần cù bù siêng năng", 21));
		css.add(new ChuongSach("Ôi bạn ơi", 9));

		for (int i = 0; i < 20; i++) {
			dsAnPham.add(new TapChi("Tạp chí IT Hutech" + i, i, 2000 + i, "Son Tung M-TP" + i, 50000 + i, "Chúng ta" + i));
			dsAnPham.add(new ThamKhao("Sách tham khảo" + i, i, 2000 + i, "Son Tung M-TP" + i, 50000 + i, "của hiện tại" + i,
					css));
		}
		// "Tiêu đề", "Số trang", "Năm xuất bản", "Tác giả", "Số tiền"
		System.out.printf("\n| %20s | %10s | %10s | %20s | %10s |", "Tiêu đề", "Số trang", "Năm xb", "Tác giả",
				"Số tiền");
		dsAnPham.stream().forEach(AnPham::output);
		System.out.println();

		// ap.input();
		// ap.output();
		System.out.println();
		
		// 6
		AnPham ap61 = new TapChi("Tạp chí IT Hutech" + 1, 12, 2012, "Son Tung M-TP" + 1, 50000, "Chúng ta" + 1);
		AnPham ap62 = new ThamKhao("Sách tham khảo" + 1, 11, 2011, "Son Tung M-TP" + 1, 50000 + 1, "của hiện tại" + 1,
				css);
		System.out.println("6\n" + ap61.xacDinhLoai());
		System.out.println(ap62.xacDinhLoai());

		// 7
		AnPham ap71 = new TapChi("Tạp chí IT Hutech" + 1, 12, 2011, "Son Tung M-TP" + 1, 50000, "Chúng ta" + 1);
		AnPham ap72 = new TapChi("Tạp chí IT Hutech" + 1, 12, 2012, "Son Tung M-TP" + 1, 50000, "Chúng ta" + 1);
		AnPham ap73 = new ThamKhao("Sách tham khảo" + 1, 11, 2011, "Son Tung M-TP" + 1, 50000 + 1, "của hiện tại" + 1,
				css);
		AnPham ap74 = new ThamKhao("Sách tham khảo" + 1, 11, 2017, "Son Tung M-TP" + 1, 50000 + 1, "của hiện tại" + 1,
				css);
		System.out.println("7\n" + ap71.laTapChiVaXuatBanCach10Nam());
		System.out.println(ap72.laTapChiVaXuatBanCach10Nam());
		System.out.println(ap73.laTapChiVaXuatBanCach10Nam());
		System.out.println(ap74.laTapChiVaXuatBanCach10Nam());

		// 8
		AnPham ap8 = new TapChi("Tạp chí IT Hutech" + 1, 12, 2011, "Son Tung M-TP" + 1, 50000, "Chúng ta" + 1);
		AnPham ap81 = new TapChi("Tạp chí IT Hutech" + 1, 12, 2011, "Son Tung M-TP" + 1, 50000, "Chúng ta" + 1);
		AnPham ap82 = new ThamKhao("Sách tham khảo" + 1, 24, 2017, "Son Tung M-TP" + 1, 50000 + 1, "của hiện tại" + 1,
				css);
		System.out.println("8\n" + ap8.cungLoaiVaTacGia(ap81));
		System.out.println(ap8.cungLoaiVaTacGia(ap82));

		// 9
		// dsAnPham.stream().forEach(AnPham::output);
		
		for(AnPham anPham : dsAnPham) {
			anPham.output();
		}

		System.out.println("9\n" + AnPham.tongTien);

		// 10
		System.out.println("\n 10");
		List<ChuongSach> css1 = new ArrayList<>();
		css1.add(new ChuongSach("Có làm mới có ăn", 69));
		css1.add(new ChuongSach("Cần cù bù siêng năng", 21));
		css1.add(new ChuongSach("Ôi bạn ơi", 9));
		css1.add(new ChuongSach("Ôi bạn ơi", 9));
		dsAnPham.add(new ThamKhao("Sách tham khảo nhìu nhấtt" + 1, 1, 2000 + 1, "Son Tung M-TP" + 1, 50000 + 1, "của hiện tại" + 1,
				css1));
		
		int max = 0;
		int index = 0;
		for(int i = 0; i < dsAnPham.size(); i++) {
			AnPham temp = dsAnPham.get(i);
			if(temp instanceof ThamKhao && ((ThamKhao)temp).getChuongSachs().size() > max) {
				max = ((ThamKhao)temp).getChuongSachs().size();
				index = i;
			}
		}
		
		dsAnPham.get(index).output();

		// 11
		AnPham ap111 = new TapChi("Tạp chí IT Hutech" + 1, 12, 2011, "Son Tung M-TP" + 1, 50000, "Chúng ta");
		AnPham ap112 = new ThamKhao("Sách tham khảo" + 1, 24, 2017, "Son Tung M-TP" + 1, 50000 + 1, "của hiện tại" + 1,
				css);
		System.out.println("11\n" + ap111.laTapChiVaCoTenLa("Chúng ta"));
		System.out.println(ap111.laTapChiVaCoTenLa("Của hiện tại"));
		System.out.println(ap112.laTapChiVaCoTenLa("Chúng ta"));

		// 12

		System.out.println("12\n");
		for (AnPham anPham : dsAnPham) {
			if (anPham.laTapChiVaXuatBanVaoNam(2017))
				anPham.output();
				
		}
		for (AnPham anPham : dsAnPham) {
			if (anPham.laTapChiVaXuatBanVaoNam(2016))
				anPham.output();
				
		}
		
		// 13
		System.out.println("\n13\n");
		Collections.sort(dsAnPham, new AnPhamComparator());
		for (AnPham anPham : dsAnPham) {
			anPham.output();
		}
		
		// 14 
		System.out.println("\n14");
		
		
		List<AnPham> dsAnPhamTheoNam = new ArrayList<>();
		
		for(AnPham anPham : dsAnPham) {
			if(anPham.getNamXuatBan() == 2017)
				dsAnPhamTheoNam.add(anPham);
		}
		
		for(AnPham anPham : dsAnPhamTheoNam) {
			anPham.output();
		}
		
		
		
		
		

	}
}
