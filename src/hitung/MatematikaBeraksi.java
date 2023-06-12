package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika Saeful = new Matematika(7,1);
        
        System.out.println("Hasil Penjumlahan : "+Saeful.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+Saeful.setPengurangan());
        System.out.println("Hasil Perkalian : "+Saeful.setPerkalian());
        System.out.println("Hasil Pembagian : "+Saeful.setPembagian());
    }
 
}