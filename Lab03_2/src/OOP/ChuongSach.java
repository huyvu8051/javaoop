package OOP;

import java.util.Scanner;

public class ChuongSach {
	private String tieuDe;
	private int soTrang;
	private static Scanner sc = null;

	public ChuongSach() {
		tieuDe = "";
		soTrang = 0;
	}

	public ChuongSach(String tieuDe, int soTrang) {
		this.tieuDe = tieuDe;
		this.soTrang = soTrang;
	}
	
	public ChuongSach(ChuongSach chuongSach) {
		tieuDe = chuongSach.getTieuDe();
		soTrang = chuongSach.getSoTrang();
	}
	
	public void input() {
		if(sc == null) sc = new Scanner(System.in);
		System.out.print("Nhập tiêu đề: ");
		tieuDe = sc.nextLine();
		System.out.print("Nhập số trang: ");
		soTrang = sc.nextInt();
		sc.nextLine();
	}
	
	public void output() {
		System.out.printf(" %20s => %5d |", tieuDe, soTrang);
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

	

}
