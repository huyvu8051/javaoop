package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DonHang implements NoiThatIO{
	private String ngayLap;
	private String nguoiBan;
	private String nguoiMua;
	private static Scanner sc = null;
	
	private static double tongTien = 0;
	
	List<NoiThat> dsSanPham;

	public DonHang() {
		ngayLap = "";
		nguoiBan = "";
		nguoiMua = "";
		dsSanPham = new ArrayList<>();
	}

	public DonHang(String ngayLap, String nguoiBan, String nguoiMua, List<NoiThat> dsSanPham) {
		this.ngayLap = ngayLap;
		this.nguoiBan = nguoiBan;
		this.nguoiMua = nguoiMua;
		this.dsSanPham = dsSanPham;
	}
	
	@Override
	public void input() {
		if (sc == null)
			sc = new Scanner(System.in);

		System.out.print("Nhập ngày lập: ");
		ngayLap = sc.nextLine();
		
		System.out.print("Nhập người bán: ");
		nguoiBan = sc.nextLine();
		
		System.out.print("Nhập người mua: ");
		nguoiMua = sc.nextLine();
		
		System.out.println("Nhập danh sách sản phẩm: ");
		nhapDsSanPham();
		
	}
	
	private void nhapDsSanPham() {
		do {
			System.out.println("Chọn sp cần nhập: a = Bàn, b = ghế, else tủ?");
			
			String select = sc.nextLine();
			NoiThat temp;
			if(select.equals("a")) {
				temp = new Ban();
			}else if(select.equals("b")) {
				temp = new Ghe();
			}else {
				temp = new Tu();
			}
			
			
			temp.input();
			dsSanPham.add(temp);
			tongTien = getTongTien() + temp.getGiaTien();
			System.out.print("Nhập thêm sản phẩm? y = yes, n = no ");
		}while(sc.nextLine().equals("y"));
		
	}

	@Override
	public void output() {
		System.out.printf("| %10s | %10s | %10s |", getNgayLap(), getNguoiBan(), getNguoiMua());
		System.out.println("\nDanh sách sản phẩm: ");
		for(NoiThat noiThat : dsSanPham) {
			noiThat.output();
		}
		
	}

	public String getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}

	public String getNguoiBan() {
		return nguoiBan;
	}

	public void setNguoiBan(String nguoiBan) {
		this.nguoiBan = nguoiBan;
	}

	public String getNguoiMua() {
		return nguoiMua;
	}

	public void setNguoiMua(String nguoiMua) {
		this.nguoiMua = nguoiMua;
	}

	public List<NoiThat> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<NoiThat> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public static double getTongTien() {
		return tongTien;
	}
	
	
	
	
}

