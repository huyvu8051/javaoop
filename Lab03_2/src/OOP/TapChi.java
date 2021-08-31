package OOP;

import java.util.Scanner;

public class TapChi extends AnPham{
	private String ten;
	
	private static Scanner sc = null;

	public TapChi() {
		ten = "";
	}

	public TapChi(String tieuDe, int soTrang, int namXuatBan, String tacGia, double soTien, String ten) {
		super(tieuDe, soTrang, namXuatBan, tacGia, soTien);
		this.ten = ten;
	}
	
	public TapChi(TapChi tapChi) {
		super(tapChi.getTieuDe(), tapChi.getSoTrang(), tapChi.getNamXuatBan(), tapChi.getTacGia(), tapChi.getSoTien());
		ten = tapChi.getTen();
	}
	
	@Override
	public void input() {
		
		super.input();
		if(sc == null) sc = new Scanner(System.in);
		System.out.print("Nhập tên: ");
		ten = sc.nextLine();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.printf(" %20s |", ten);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
	
	
	
}
