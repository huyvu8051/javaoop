package OOP;

import java.util.Scanner;

public class Tu extends NoiThat {
	private String loaiGo;
	private boolean coGuongSoi;
	private static Scanner sc = null;
	
	public Tu() {
	}

	public Tu(int chieuDai, int chieuRong, int chieuCao, double giaTien, String loaiGo, boolean coGuongSoi) {
		super(chieuDai, chieuRong, chieuCao, giaTien);
		this.loaiGo = loaiGo;
		this.coGuongSoi = coGuongSoi;
	}

	public Tu(Tu tu) {
		super(tu.getChieuDai(), tu.getChieuRong(), tu.getChieuCao(), tu.getGiaTien());

		loaiGo = tu.getLoaiGo();
		coGuongSoi = tu.isCoGuongSoi();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		if (sc == null)
			sc = new Scanner(System.in);
		
		System.out.print("Nhập loại gỗ: ");
		loaiGo = sc.nextLine();
		
		System.out.print("Có gương soi hay không? y = yes else no ");
		coGuongSoi = sc.nextLine().equals("y") ? true : false;
	}
	
	@Override
	public void output() {
		// TODO Auto-generated method stub
		super.output();
		
		System.out.printf("%10s | %10b |", getLoaiGo(), isCoGuongSoi());
	}
	
	public String getLoaiGo() {
		return loaiGo;
	}

	public void setLoaiGo(String loaiGo) {
		this.loaiGo = loaiGo;
	}

	public boolean isCoGuongSoi() {
		return coGuongSoi;
	}

	public void setCoGuongSoi(boolean coGuongSoi) {
		this.coGuongSoi = coGuongSoi;
	}

}
