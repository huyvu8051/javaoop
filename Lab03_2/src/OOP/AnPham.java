package OOP;

import java.util.Scanner;

public abstract class AnPham {
	private String tieuDe;
	private int soTrang;
	private int namXuatBan;
	private String tacGia;
	private double soTien;
	
	public static double tongTien = 0;

	private static Scanner sc = null;

	public AnPham() {
		tieuDe = "";
		soTrang = 0;
		namXuatBan = 0;
		tacGia = "";
		soTien = 0;
	}

	public AnPham(AnPham anPham) {
		tieuDe = anPham.getTieuDe();
		soTrang = anPham.getSoTrang();
		namXuatBan = anPham.getNamXuatBan();
		tacGia = anPham.getTacGia();
		soTien = anPham.getSoTien();
	}

	public AnPham(String tieuDe, int soTrang, int namXuatBan, String tacGia, double soTien) {
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
		this.soTien = soTien;
	}

	public void input() {
		if (sc == null)
			sc = new Scanner(System.in);
		System.out.print("Nhập tiêu đề: ");
		tieuDe = sc.nextLine();
		System.out.print("Nhập số trang: ");
		soTrang = sc.nextInt();
		System.out.print("Nhập năm xuất bản: ");
		namXuatBan = sc.nextInt();
		System.out.print("Nhập tác giả: ");
		sc.nextLine();
		tacGia = sc.nextLine();
		System.out.print("Nhập số tiền: ");
		soTien = sc.nextDouble();
	}

	public void output() {
		System.out.printf("\n| %20s | %10d | %10d | %20s | %10f |", tieuDe, soTrang, namXuatBan, tacGia, soTien);
	}
	
	public String xacDinhLoai() {
		if(this instanceof TapChi) return "Tạp chí";
		else return "Sách tham khảo";
	}
	
	public boolean laTapChiVaXuatBanCach10Nam() {
		return this instanceof TapChi && 2021 - namXuatBan == 10;
	}
	
	public boolean cungLoaiVaTacGia(AnPham a2) {
		return this.getClass().getSimpleName() == a2.getClass().getSimpleName() && this.getTacGia() == a2.getTacGia();
	}
	
	public void tinhTongTien() {
		tongTien += getSoTien();
	}
	
	public boolean laTapChiVaCoTenLa(String ten) {
		return this instanceof TapChi && ((TapChi) this).getTen() == ten;
	}
	
	public boolean laTapChiVaXuatBanVaoNam(int nam) {
		return this instanceof TapChi && this.getNamXuatBan() == nam;
	}
	

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public double getSoTien() {
		return soTien;
	}

	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}

}
