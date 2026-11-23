public abstract class Rekening {
    private String nomor;
    private String pemilik;
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() {
        return this.nomor;
    }

    public String getPemilik() {
        return this.pemilik;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        } else {
            this.saldo += jumlah;
            return true;
        }
    }

    public abstract int biayaAdminBulanan();

    public abstract String keterangan();

    public int potongBiayaAdmin() {
        int biaya = this.biayaAdminBulanan();
        this.saldo -= biaya;
        return biaya;
    }

    protected static String formatRupiah(int jumlah) {
        String var10000 = String.format("%,d", jumlah);
        return "Rp" + var10000.replace(',', '.');
    }
}
