public class Tabungan extends Rekening implements BerBunga {
    private double bungaPersen;

    public Tabungan(String nomor, String pemilik, int saldo, double bungaPersen) {
        super(nomor, pemilik, saldo);
        this.bungaPersen = bungaPersen;
    }

    public int tambahBunga() {
        int bunga = (int)((double)this.saldo * this.bungaPersen / (double)100.0F);
        this.setor(bunga);
        return bunga;
    }

    public int biayaAdminBulanan() {
        return this.saldo >= 1000000 ? 0 : 5000;
    }

    public String keterangan() {
        return "Tabungan, bunga " + this.bungaPersen + "% per bulan";
    }
}
