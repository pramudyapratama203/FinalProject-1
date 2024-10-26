
import java.util.Scanner;
/*
@pratamavision
*/
public class FinalProject{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declare
        int ubahHarga = 0, harga = 0, grandHarga = 0, jumlah = 0, pilih1 = 0, pilih2 = 0, pilih3 = 0, pilih4 = 0, pilih5 = 0, pilih6 = 0, pilih7 = 0,
                pilih8 = 0, pilih9 = 0;

        // Declare variabel pada menu Ayam Alacarte Hisana
        int hargaA1 = 20000, hargaA2 = 15000, hargaA3 = 20000, hargaA4 = 15000;

        // Declare variabel pada menu paket hisana hydro coco
        int hargaB1 = 30000, hargaB2 = 25000;

        // Declare variabel pada menu paket cemilan
        int hargaC1 = 20000, hargaC2 = 8750, hargaC3 = 13750, hargaC4 = 12500, hargaC5 = 5000, hargaC6 = 11250, hargaC7 = 11250,hargaC8 = 10000;

        // Declare variabel pada menu paket minuman
        int hargaD1 = 7500, hargaD2 = 11250, hargaD3 = 7500, hargaD4 = 7500, hargaD5 = 11250, hargaD6 = 7500;

        do {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Program Kasir Hisana Fried Chicken GKB");
            System.out.println("Jl. Jawa No.73, Yosowilangun, GKB, Kec. Manyar, Kabupaten Gresik, Jawa Timur 61162");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("\n1. Kasir\n2. Admin\n3. Selesai");
            System.out.print("\nPilih = "); pilih1 = sc.nextInt();

            switch(pilih1){
                case 1:
                    do{
                    System.out.println("\nMenu makanan Hisana Fried Chicken GKB");
                    System.out.println("1. Ayam Alacarte Hisana\n2. Paket Hydro Coco Hisana\n3. Cemilan\n4. Minuman\n5. Selesai");
                    System.out.print("\nPilih menu makanan yang diinginkan = "); pilih2 = sc.nextInt();

                        switch(pilih2) {
                            case 1:
                                do {
                                    System.out.println("\nMenu Ayam Alacarte Hisana");
                                    System.out.println("1. Ayam Dada/Paha Atas (Random) Rp. " + hargaA1);
                                    System.out.println("2. Ayam Sayap/Paha Atas (Random) Rp. " + hargaA2);
                                    System.out.println("3. Ayam Dada/Paha Bawah (Random) Rp. " + hargaA3);
                                    System.out.println("4. Ayam Sayap/Paha Bawah (Random) Rp. " + hargaA4);
                                    System.out.println("5. Selesai");
                                    System.out.print("\nPilih menu yang diinginkan = "); pilih3 = sc.nextInt();

                                    switch (pilih3) {
                                        case 1:
                                            System.out.println("\nAyam Dada/Paha Atas (Random) Rp. " + hargaA1);
                                            System.out.print("Berapa jumlah yang ingin dibeli = ");
                                            jumlah = sc.nextInt();
                                            harga = hargaA1 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 2:
                                            System.out.println("\nAyam Sayap/Paha Bawah (Random) Rp. " + hargaA2);
                                            System.out.print("Berapa jumlah yang ingin dibeli = ");
                                            jumlah = sc.nextInt();
                                            harga = hargaA2 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 3:
                                            System.out.println("\nAyam Dada/Paha Atas (Random) Spesial Rp. " + hargaA3);
                                            System.out.print("Berapa jumlah yang ingin dibeli = ");
                                            jumlah = sc.nextInt();
                                            harga = hargaA3 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 4:
                                            System.out.println("\nAyam Sayap/Paha Bawah (Random) Spesial Rp. " + hargaA4);
                                            System.out.print("Berapa jumlah yang ingin dibeli = ");
                                            jumlah = sc.nextInt();
                                            harga = hargaA4 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 5:
                                            System.out.println("\nTerima Kasih");
                                            break;

                                        default:
                                            System.out.println("\nPilihan tidak ada");
                                            break;

                                    }
                                } while (pilih3 != 5);
                                break;

                            case 2:
                                do{
                                System.out.println("\nMenu Paket Hydro Coco");
                                System.out.println("1. Paket Hydro Coco Ayam Dada/Paha Atas (Random) Rp. " + hargaB1);
                                System.out.println("2. Paket Hydro Coco Ayam Dada/Paha Bawah (Random) Rp. " + hargaB2);
                                System.out.println("3. Selesai");
                                System.out.print("Pilih menu yang diinginkan = ");
                                pilih4 = sc.nextInt();

                                    switch (pilih4) {
                                        case 1:
                                            System.out.println("\nPaket Hydro Coco Ayam Dada/Paha Atas (Random) Rp. " + hargaB1);
                                            System.out.print("Berapa jumlah yang ingin dibeli = ");
                                            jumlah = sc.nextInt();
                                            harga = hargaB1 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 2:
                                            System.out.println("\nPaket Hydro Coco Ayam Dada/Paha Bawah (Random) Rp. " + hargaB2);
                                            System.out.print("Berapa jumlah yang ingin dibeli = ");
                                            jumlah = sc.nextInt();
                                            harga = hargaB2 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 3:
                                            System.out.println("\nTerima kasih");
                                            break;

                                        default:
                                            System.out.println("\nPilihan tidak ada!");
                                            break;
                                    }
                                } while (pilih4 != 3);
                                break;

                            case 3:
                                do {
                                    System.out.println("\nMenu Cemilan");
                                    System.out.println("1. Kulit Ayam Crispy Rp. " + hargaC1);
                                    System.out.println("2. Nasi Rp. " + hargaC2);
                                    System.out.println("3. Kentang Crispy Rp. " + hargaC3);
                                    System.out.println("4. Kebab Hisana Rp. " + hargaC4);
                                    System.out.println("5. Nugget Rp. " + hargaC5);
                                    System.out.println("6. Jamur Crispy Rp. " + hargaC6);
                                    System.out.println("7. Chicken Strip Rp. " + hargaC7);
                                    System.out.println("8. Pentol Crispy Rp. " + hargaC8);
                                    System.out.println("9. Selesai");
                                    System.out.print("\nPilih menu yang diinginkan = "); pilih5 = sc.nextInt();

                                    switch(pilih5){
                                        case 1 :
                                            System.out.println("Kulit Ayam Crispy Rp. " + hargaC1);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaC1 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 2 :
                                            System.out.println("Nasi Rp. " + hargaC2);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaC2 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 3 :
                                            System.out.println("Kentang Crispy Rp. " + hargaC3);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaC3 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 4 :
                                            System.out.println("Kebab Hisana Rp. " + hargaC4);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaC4 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga =  grandHarga + harga;
                                            break;

                                        case 5 :
                                            System.out.println("Nugget Rp. " + hargaC5);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaC5 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 6 :
                                            System.out.println("Jamur Crispy Rp. " + hargaC6);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaC6 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 7 :
                                            System.out.println("Chicken Strip Rp. " + hargaC7);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaC7 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 8 :
                                            System.out.println("Pentol Crispy Rp. " + hargaC8);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaC8 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 9 :
                                            System.out.println("\nTerima kasih");
                                            break;

                                        default:
                                            System.out.println("\nPilihan tidak ada!");
                                            break;

                                    }

                                }while (pilih5 != 9);
                                break;

                            case 4 :
                                do{
                                    System.out.println("\nMenu Minuman");
                                    System.out.println("1. Fruitea Pouch Rp. " + hargaD1);
                                    System.out.println("2. Hydro Coco Rp. " + hargaD2);
                                    System.out.println("3. Teh Gelas Botol Rp. " + hargaD3);
                                    System.out.println("4. Prima 600 ml Rp. " + hargaD4);
                                    System.out.println("5. Milo Rp. " + hargaD5);
                                    System.out.println("6. Crystalline Rp. " + hargaD6);
                                    System.out.println("7. Selesai");
                                    System.out.print("\nPilih menu yang ingin dibeli = "); pilih6 = sc.nextInt();

                                    switch (pilih6){
                                        case 1 :
                                            System.out.println("\nFruitea Pouch Rp. " + hargaD1);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaD1 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 2 :
                                            System.out.println("\nHydro Coco Rp. " + hargaD2);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaD2 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 3 :
                                            System.out.println("\nTeh Gelas Botol Rp. " + hargaD3);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaD3 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 4 :
                                            System.out.println("\nPrima 600 ml Rp. " + hargaD4);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaD4 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 5 :
                                            System.out.println("\nMilo Rp. " + hargaD5);
                                            System.out.print("Berapa jumlah yang ingin dibeli = "); jumlah = sc.nextInt();
                                            harga = hargaD5 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 6 :
                                            System.out.println("\nCrystalline Rp. " + hargaD6);
                                            System.out.print("Berapa jumlah yang ingin dbeli = "); jumlah = sc.nextInt();
                                            harga = hargaD6 * jumlah;
                                            System.out.println("Harga yang didapat adalah Rp. " + harga);
                                            grandHarga = grandHarga + harga;
                                            break;

                                        case 7 :
                                            System.out.println("\nTerima Kasih");
                                            break;

                                        default :
                                            System.out.println("\nPilihan tidak ada!");
                                            break;

                                    }

                                }while (pilih6 != 7);

                            case 5 :
                                System.out.println("\nTerima Kasih");
                                break;
                        }


                    }while (pilih2 != 5);
                    break;

                case 2 :
                    do {
                        System.out.println("\nSelamat Datang User Admin");
                        System.out.println("1. Melihat total pendapatan");
                        System.out.println("2. Mengubah harga barang");
                        System.out.println("3. Selesai");
                        System.out.print("\nPilih = ");
                        pilih8 = sc.nextInt();

                        switch(pilih8){
                            case 1 :
                                System.out.println("\nTotal pendapatan adalah " + grandHarga);
                                break;

                            case 2 :
                                System.out.println("\nList Produk Hisana Fried Chicken GKB");
                                System.out.println("1. Ayam Dada/Paha Atas (Random) Rp. " + hargaA1);
                                System.out.println("2. Ayam Sayap/Paha Atas (Random) Rp. " + hargaA2);
                                System.out.println("3. Ayam Dada/Paha Bawah (Random) Rp. " + hargaA3);
                                System.out.println("4. Ayam Sayap/Paha Bawah (Random) Rp. " + hargaA4);
                                System.out.println("5. Paket Hydro Coco Ayam Dada/Paha Atas (Random) Rp. " + hargaB1);
                                System.out.println("6. Paket Hydro Coco Ayam Dada/Paha Bawah (Random) Rp. " + hargaB2);
                                System.out.println("7. Kulit Ayam Crispy Rp. " + hargaC1);
                                System.out.println("8. Nasi Rp. " + hargaC2);
                                System.out.println("9. Kentang Crispy Rp. " + hargaC3);
                                System.out.println("10. Kebab Hisana Rp. " + hargaC4);
                                System.out.println("11. Nugget Rp. " + hargaC5);
                                System.out.println("12. Jamur Crispy Rp. " + hargaC6);
                                System.out.println("13. Chicken Strip Rp. " + hargaC7);
                                System.out.println("14. Pentol Crispy Rp. " + hargaC8);
                                System.out.println("15. Fruitea Pouch Rp. " + hargaD1);
                                System.out.println("16. Hydro Coco Rp. " + hargaD2);
                                System.out.println("17. Teh Gelas Botol Rp. " + hargaD3);
                                System.out.println("18. Prima 600 ml Rp. " + hargaD4);
                                System.out.println("19. Milo Rp. " + hargaD5);
                                System.out.println("20. Crystalline Rp. " + hargaD6);
                                System.out.print("\nPilih barang yang ingin diubah harganya = "); pilih9 = sc.nextInt();

                                switch (pilih9){
                                    case 1 :
                                        System.out.println("\nAyam Dada/Paha Atas (Random) Rp. " + hargaA1);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaA1 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 2 :
                                        System.out.println("\nAyam Sayap/Paha Atas (Random) Rp. " + hargaA2);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaA2 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 3 :
                                        System.out.println("\nAyam Dada/Paha Bawah (Random) Rp. " + hargaA3);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaA3 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 4 :
                                        System.out.println("\nAyam Sayap/Paha Bawah (Random) Rp. " + hargaA4);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaA4 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 5 :
                                        System.out.println("\nPaket Hydro Coco Ayam Dada/Paha Atas (Random) Rp. " + hargaB1);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaB1 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 6 :
                                        System.out.println("\nPaket Hydro Coco Ayam Dada/Paha Bawah (Random) Rp. " + hargaB2);
                                        System.out.print("Ubah harga menjadi = ");  ubahHarga = sc.nextInt();
                                        hargaB2 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 7 :
                                        System.out.println("\nKulit Ayam Crispy Rp. " + hargaC1);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaC1 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 8 :
                                        System.out.println("\nNasi Rp. " + hargaC2);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaC2 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 9 :
                                        System.out.println("\nKentang Crispy Rp. " + hargaC3);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaC3 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 10 :
                                        System.out.println("\nKebab Hisana Rp. " + hargaC4);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaC4 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 11 :
                                        System.out.println("\nNugget Rp. " + hargaC5);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaC5 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 12 :
                                        System.out.println("\nJamur Crispy Rp. " + hargaC6);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaC6 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 13 :
                                        System.out.println("\nChicken Strip Rp. " + hargaC7);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaC7 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 14 :
                                        System.out.println("\nPentol Crispy Rp. " + hargaC8);
                                        System.out.println("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaC8 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 15 :
                                        System.out.println("\nFruitea Pouch Rp. " + hargaD1);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaD1 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 16 :
                                        System.out.println("\nHydro Coco Rp. " + hargaD2);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaD2 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 17 :
                                        System.out.println("\nTeh Gelas Botol Rp. " + hargaD3);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaD3 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 18 :
                                        System.out.println("\nPrima 600 ml Rp. " + hargaD4);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaD4 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 19 :
                                        System.out.println("\nMilo Rp. " + hargaD5);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaD5 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;

                                    case 20 :
                                        System.out.println("\nCrystalline Rp. " + hargaD6);
                                        System.out.print("Ubah harga menjadi = "); ubahHarga = sc.nextInt();
                                        hargaD6 = ubahHarga;
                                        System.out.println("Harga produk berhasil diubah");
                                        break;


                                }

                        }

                    }while (pilih8 != 3);
                    break;

                case 3 :
                    System.out.println("\nTerima kasih sudah menggunakan program");
                    break;

            }

        }while  (pilih1 != 3);
    }
}
