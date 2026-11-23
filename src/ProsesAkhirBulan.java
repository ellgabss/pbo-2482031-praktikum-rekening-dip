import java.io.PrintStream;

public class ProsesAkhirBulan {
    public static void potongBiayaAdmin(Rekening[] semua) {
        for(Rekening rek : semua) {
            int biaya = rek.potongBiayaAdmin();
            PrintStream var10000 = System.out;
            String var10001 = rek.getNomor();
            var10000.println(var10001 + " biaya admin  : " + Rekening.formatRupiah(biaya));
        }

    }

    public static void tambahBunga(BerBunga[] berbunga) {
        for(BerBunga b : berbunga) {
            int bunga = b.tambahBunga();
            PrintStream var10000 = System.out;
            String var10001 = b.getNomor();
            var10000.println(var10001 + " bunga        : " + Rekening.formatRupiah(bunga));
        }

    }

    public void autodebet(BisaDitarik[] semua, int jumlah) {
        for (BisaDitarik rek : semua) {
            boolean berhasil = rek.tarik(jumlah);
            String hasil = berhasil ? Rekening.formatRupiah(jumlah) : "gagal";
            PrintStream var10000 = System.out;
            String var10001 = rek.getNomor();
            var10000.println(var10001 + " autodebet    : " + hasil);
        }
    }
}
