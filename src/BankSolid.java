public class BankSolid {
    public static void main(String[] args) {
        Tabungan ani = new Tabungan("101", "Ani", 1000000, (double)2.5F);
        Tabungan citra = new Tabungan("102", "Citra", 300000, (double)2.0F);
        Giro budi = new Giro("201", "Budi", 200000, 500000);
        Deposito dewi = new Deposito("301", "Dewi", 5000000, (double)4.0F);
        Rekening[] semua = new Rekening[]{ani, citra, budi, dewi};
        BerBunga[] berbunga = { ani, citra, dewi };
        BisaDitarik[] bisaDitarik = { ani, citra, budi };
        //Uji ISP : BisaDitarik[] salah = { ani, dewi };
        //java: incompatible types: Deposito cannot be converted to BisaDitarik
        //Notifikasi notifikasi = new SmsNotifikasi();
        // UJI DIP: ganti Email ke SMS hanya mengubah 1 baris (baris ini).
        // ProsesAkhirBulan tidak diubah sama sekali (0 baris).
        Notifikasi notifikasi = new EmailNotifikasi();
        ProsesAkhirBulan proses = new ProsesAkhirBulan(notifikasi);
        LaporanBank.cetakDaftar("REKENING AWAL", semua);
        System.out.println();
        System.out.println("========== AKHIR BULAN ============");
        proses.potongBiayaAdmin(semua);
        proses.tambahBunga(berbunga);
        proses.autodebet(bisaDitarik, 50000);
        System.out.println();
        LaporanBank.cetakDaftar("REKENING AKHIR", semua);
        LaporanBank.cetakTotal(semua);
    }
}