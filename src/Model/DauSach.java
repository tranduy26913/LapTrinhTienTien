package Model;

import java.util.Scanner;


public class DauSach {
	private String maSach;
	private String tua;
	private String maNXB;
	private String tacGia;
	private int giaSach;
	
	
	public int getGiaSach() {
		return giaSach;
	}

	public void setGiaSach(int giaSach) {
		this.giaSach = giaSach;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getTua() {
		return tua;
	}

	public void setTua(String tua) {
		this.tua = tua;
	}

	public String getMaNXB() {
		return maNXB;
	}

	public void setMaNXB(String maNXB) {
		this.maNXB = maNXB;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public DauSach() {
		
	}

	public DauSach(String maSach,String tua,String maNXB,String tacGia,int giaSach) {
		this.maSach=maSach;
		this.tua=tua;
		this.maNXB=maNXB;
		this.tacGia=tacGia;
		this.giaSach=giaSach;
	}
	
	
}
