package com.example.ph5819906_03_2026.entity;

public class SinhVien {
    //Tạo class SinhVien gồm các thuộc tính maSV - String , ten - String , tuoi - int, diemTrungBinh - float, kyHoc - int, chuyenNganh - String
    //Tạo class SinhVienService và thực hiện các hàm thêm, sửa 1 đối tượng sinh viên(1 Điểm)
    //Viết unit test cho chức năng trên (3 Điểm)
    private String maSV, ten, chuyenNganh;
    private int tuoi, kyHoc;
    private float diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, int tuoi, float diemTrungBinh, int kyHoc, String chuyenNganh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemTrungBinh = diemTrungBinh;
        this.kyHoc = kyHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}
