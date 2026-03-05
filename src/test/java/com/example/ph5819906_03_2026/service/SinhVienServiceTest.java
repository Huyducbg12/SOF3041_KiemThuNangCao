package com.example.ph5819906_03_2026.service;

import com.example.ph5819906_03_2026.entity.SinhVien;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    SinhVienService service = new SinhVienService();

    @Test
    void testAddValid() {
        SinhVien sv = new SinhVien("SV01", "Duc", 20, 9.0f, 1, "PTPM");
        service.addSinhVien(sv);
        assertEquals(1, service.getAll().size());
    }

    @Test
    void testAddEmptyMa() {
        SinhVien sv = new SinhVien("", "Duc", 20, 9.0f, 1, "PTPM");
        assertThrows(IllegalArgumentException.class, () -> service.addSinhVien(sv));
    }

    @Test
    void testUpdateNonExistent() {
        SinhVien sv = new SinhVien("SV99", "Duc", 20, 9.0f, 1, "PTPM");
        assertThrows(IllegalArgumentException.class, () -> service.updateSinhVien(sv, "SV100"));
    }
}