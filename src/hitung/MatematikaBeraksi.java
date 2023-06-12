package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika kamal = new Matematika(2,6);
        
        System.out.println("Hasil Penjumlahan : "+kamal.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+kamal.setPengurangan());
        System.out.println("Hasil Perkalian : "+kamal.setPerkalian());
        System.out.println("Hasil Pembagian : "+kamal.setPembagian());
    }
}
