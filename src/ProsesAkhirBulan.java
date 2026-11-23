public class ProsesAkhirBulan {
    private final Notifikasi notifikasi;

    public ProsesAkhirBulan(Notifikasi notifikasi) {
        this.notifikasi = notifikasi;
    }

    public void potongBiayaAdmin(Rekening[] semua) {
        for (Rekening rek : semua) {
            int biaya = rek.potongBiayaAdmin();
            notifikasi.kirim(rek.getNomor(), "biaya admin " + Rekening.formatRupiah(biaya));
        }
    }

    public void tambahBunga(BerBunga[] berbunga) {
        for (BerBunga b : berbunga) {
            int bunga = b.tambahBunga();
            notifikasi.kirim(b.getNomor(), "bunga " + Rekening.formatRupiah(bunga));
        }
    }

    public void autodebet(BisaDitarik[] semua, int jumlah) {
        for (BisaDitarik rek : semua) {
            String hasil = rek.tarik(jumlah) ? "berhasil" : "gagal";
            notifikasi.kirim(rek.getNomor(), "autodebet " + Rekening.formatRupiah(jumlah) + " " + hasil);
        }
    }
}