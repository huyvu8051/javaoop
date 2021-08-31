package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThamKhao extends AnPham {
	private String linhVuc;
	private List<ChuongSach> chuongSachs;
	private static Scanner sc = null;

	public ThamKhao() {
		linhVuc = "";
		chuongSachs = new ArrayList<>();
	}

	public ThamKhao(String tieuDe, int soTrang, int namXuatBan, String tacGia, double soTien, String linhVuc, List<ChuongSach> chuongSachs) {
		super(tieuDe, soTrang, namXuatBan, tacGia, soTien);
		this.linhVuc = linhVuc;
		this.chuongSachs = chuongSachs;
	}
	
	public ThamKhao(ThamKhao thamKhao) {
		super(thamKhao.getTieuDe(), thamKhao.getSoTrang(), thamKhao.getNamXuatBan(), thamKhao.getTacGia(), thamKhao.getSoTien());
		linhVuc = thamKhao.getLinhVuc();
		chuongSachs = thamKhao.getChuongSachs();
	}
	
	@Override
	public void input() {
		super.input();
		if(sc == null) sc = new Scanner(System.in);
		System.out.print("Nhập lĩnh vực: ");
		linhVuc = sc.nextLine();
		System.out.print("Nhập chương sách: \n");
		nhapChuongSach();
		
	}

	private void nhapChuongSach() {
		do {
			ChuongSach temp = new ChuongSach();
			temp.input();
			chuongSachs.add(temp);
			System.out.print("Nhập thêm chương sách? y = yes, n = no ");
		}while(sc.nextLine().equals("y"));
	}
	
	@Override
	public void output() {
		super.output();
		System.out.printf(" %20s |", linhVuc);
		
// 		chuongSachs.stream()
// 		.forEach(ChuongSach::output);
		for(ChuongSach chuongSach : chuongSachs) {
			chuongSach.output();
		}
	}

	public String getLinhVuc() {
		return linhVuc;
	}

	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}

	public List<ChuongSach> getChuongSachs() {
		return chuongSachs;
	}

	public void setChuongSachs(List<ChuongSach> chuongSachs) {
		this.chuongSachs = chuongSachs;
	}

}
