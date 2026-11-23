public class Deposito extends Rekening implements BerBunga {
    private double bungaPersen;

    public Deposito(String nomor, String pemilik, int saldo, double bungaPersen) {
        super(nomor, pemilik, saldo);
        this.bungaPersen = bungaPersen;
    }

    public int tambahBunga() {
        int bunga = (int)((double)this.saldo * this.bungaPersen / (double)100.0F);
        this.setor(bunga);
        return bunga;
    }

    public int biayaAdminBulanan() {
        return 0;
    }

    public String keterangan() {
        return "Deposito, bunga " + this.bungaPersen + "% per bulan";
    }
}