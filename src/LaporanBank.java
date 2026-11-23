import java.io.PrintStream;

public class LaporanBank {
    public static void cetakDaftar(String judul, Rekening[] semua) {
        String kepala = "========== " + judul + " ";
        System.out.println(kepala + "=".repeat(35 - kepala.length()));

        for(Rekening rek : semua) {
            PrintStream var10000 = System.out;
            String var10001 = rek.getNomor();
            var10000.println(var10001 + " | " + String.format("%-6s", rek.getPemilik()) + " | " + String.format("%12s", Rekening.formatRupiah(rek.getSaldo())));
            System.out.println("      " + rek.keterangan());
        }

    }

    public static void cetakTotal(Rekening[] semua) {
        int total = 0;

        for(Rekening rek : semua) {
            total += rek.getSaldo();
        }

        System.out.println("-----------------------------------");
        System.out.println("Total dana bank : " + Rekening.formatRupiah(total));
    }
}
