package OOP;

import java.util.Scanner;

public abstract class NoiThat implements NoiThatIO {
	private int chieuDai;
	private int chieuRong;
	private int chieuCao;
	private double giaTien;
	private static Scanner sc = null;

	public NoiThat() {
		chieuDai = 0;
		chieuRong = 0;
		chieuCao = 0;
		giaTien = 0;
	}

	public NoiThat(int chieuDai, int chieuRong, int chieuCao, double giaTien) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
		this.giaTien = giaTien;
	}

	public NoiThat(NoiThat noiThat) {
		chieuDai = noiThat.getChieuDai();
		chieuRong = noiThat.getChieuRong();
		chieuCao = noiThat.getChieuCao();
		giaTien = noiThat.getGiaTien();
	}

	@Override
	public void input() {
		if (sc == null)
			sc = new Scanner(System.in);

		System.out.print("Nhập chiều dài: ");
		chieuDai = sc.nextInt();
		System.out.print("Nhập chiều rộng: ");
		chieuRong = sc.nextInt();
		System.out.print("Nhập chiều cao: ");
		chieuCao = sc.nextInt();
		System.out.print("Nhập giá tiền: ");
		giaTien = sc.nextDouble();

	}

	@Override
	public void output() {
		System.out.printf("\n| %10d | %10d | %10d | %10f |", getChieuDai(), getChieuRong(), getChieuCao(),
				getGiaTien());
	}
	
	
	// 3
	public String getLoaiSP() {
		return this.getClass().getSimpleName();
	}
	
	// 4
	public boolean laTuVaCoGiaTienLonHon(double soTien) {
		return this instanceof Tu && getGiaTien() > soTien;
	}
	
	

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	public int getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

}
