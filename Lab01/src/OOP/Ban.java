package OOP;

import java.util.Scanner;

public class Ban extends NoiThat{

	private boolean coHocTu;
	private String loaiGo;
	private static Scanner sc = null;

	public Ban() {
		coHocTu = false;
		loaiGo = "";
	}

	public Ban(int chieuDai, int chieuRong, int chieuCao, double giaTien, boolean coHocTu, String loaiGo) {
		super(chieuDai, chieuRong, chieuCao, giaTien);
		this.coHocTu = coHocTu;
		this.loaiGo = loaiGo;
	}

	public Ban(Ban ban) {
		super(ban.getChieuDai(), ban.getChieuRong(), ban.getChieuCao(), ban.getGiaTien());
		coHocTu = ban.isCoHocTu();
		loaiGo = ban.getLoaiGo();
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();

		if (sc == null)
			sc = new Scanner(System.in);
		System.out.print("Có hộc tủ hay không? y = yes else no ");
		coHocTu = sc.nextLine().equals("y") ? true : false;
		

		
		System.out.print("Nhập loại gỗ: ");
		loaiGo = sc.nextLine();
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		super.output();
		
		System.out.printf("%10b | %10s |", isCoHocTu(), getLoaiGo());
	}

	public boolean isCoHocTu() {
		return coHocTu;
	}

	public void setCoHocTu(boolean coHocTu) {
		this.coHocTu = coHocTu;
	}

	public String getLoaiGo() {
		return loaiGo;
	}

	public void setLoaiGo(String loaiGo) {
		this.loaiGo = loaiGo;
	}

}
