public class BankSolid {
    public static void main(String[] args) {
        Tabungan ani = new Tabungan("101", "Ani", 1000000, (double)2.5F);
        Tabungan citra = new Tabungan("102", "Citra", 300000, (double)2.0F);
        Giro budi = new Giro("201", "Budi", 200000, 500000);
        Deposito dewi = new Deposito("301", "Dewi", 5000000, (double)4.0F);
        Rekening[] semua = new Rekening[]{ani, citra, budi, dewi};
        BerBunga[] berbunga = new BerBunga[]{ani, citra, dewi};
        LaporanBank.cetakDaftar("REKENING AWAL", semua);
        System.out.println();
        System.out.println("========== AKHIR BULAN ============");
        ProsesAkhirBulan.potongBiayaAdmin(semua);
        ProsesAkhirBulan.tambahBunga(berbunga);
        ProsesAkhirBulan.autodebet(semua, 50000);
        System.out.println();
        LaporanBank.cetakDaftar("REKENING AKHIR", semua);
        LaporanBank.cetakTotal(semua);
    }
}
