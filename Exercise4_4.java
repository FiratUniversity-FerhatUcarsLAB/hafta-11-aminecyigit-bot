public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // ** hiçbir şey olmaz. Metot tanımlı kalır. metodu çağırmak zorunda değiliz.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        //** void türüne izin verilmediğine dair hata verir.Bu hatanın temel sebebi void'in değer döndürmemesidir.
        //void kullandığımız metodu tek başına çağırabiliriz. Değer döndürmez.
        

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
