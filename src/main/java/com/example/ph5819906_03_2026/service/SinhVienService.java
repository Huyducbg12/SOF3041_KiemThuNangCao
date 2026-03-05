package com.example.ph5819906_03_2026.service;

import com.example.ph5819906_03_2026.entity.SinhVien;
import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> list = new ArrayList<>();

    public void addSinhVien(SinhVien sv) {
        if (sv.getMaSV().isEmpty() || sv.getTen().isEmpty()) {
            throw new IllegalArgumentException("Không được để trống trường dữ liệu");
        }
        list.add(sv);
    }

    public void updateSinhVien(SinhVien sv, String maMoi) {
        for (SinhVien s : list) {
            if (s.getMaSV().equals(sv.getMaSV())) {
                return;
            }
        }
        throw new IllegalArgumentException("Không tìm thấy sinh viên");
    }

    public List<SinhVien> getAll() { return list; }
}
