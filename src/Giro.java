public class Giro extends Rekening {
    private int batasOverdraft;

    public Giro(String nomor, String pemilik, int saldo, int batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    public boolean tarik(int jumlah) {
        if (jumlah > 0 && this.saldo - jumlah >= -this.batasOverdraft) {
            this.saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    public int biayaAdminBulanan() {
        return 15000;
    }

    public String keterangan() {
        return "Giro, batas overdraft " + formatRupiah(this.batasOverdraft);
    }
}
