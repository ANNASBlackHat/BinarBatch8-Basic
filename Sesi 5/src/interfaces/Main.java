package interfaces;

public class Main {

    public static void main(String[] args) {
        //Id_transaksi, interfaces.Produk, harga, qty
        Transaksi transaksi = new Transaksi();
        transaksi.setIdTransaksi("01");
        transaksi.setHarga(10000);
        transaksi.setQty(10);

        Produk produk = new Produk();
        produk.setIdProduk("P01");
        produk.setKategori("Makanan");
        produk.setNamaProduk("Mie Ayam");
        transaksi.setProduk(produk);

        TransaksiInterface transaksiInterface = new TransaksiImplement();
        transaksiInterface.save(transaksi);

        ProdukInterface produkInterface = new ProdukImplement();
        produkInterface.save(produk);
    }
}
