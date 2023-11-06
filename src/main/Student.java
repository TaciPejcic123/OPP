package main;

public class Student extends Person{


//    //klasa sadrzi atribute
//   private String ime;
//  private  String prezime;
//
//  //get i set metode
//    public String getIme() {
//        return ime;
//    }
//
//    public void setIme(String ime) {
//        this.ime = ime;
//    }
//
//    public String getPrezime() {
//        return prezime;
//    }
//
//    public void setPrezime(String prezime) {
//        this.prezime = prezime;
//    }
//
//    public int getGodina() {
//        return godina;
//    }
//
//    public void setGodina(int godina) {
//        this.godina = godina;
//    }
//
//    private int godina;
//    //klasa sadrzi konstruktore mehanizam za kreiranje objekata
//
//public Student(){}  //prazan konstruktor
//    public Student(String ime, String prezime, int godina) {//parametizovani konstruktor
//        this.ime = ime;
//        this.prezime = prezime;
//        this.godina = godina;
//    }
//
//    public Student(String ime, String prezime) {
//        this.ime = ime;
//        this.prezime = prezime;
//    }
////klasa sadrzi i metode = ono sto objekat radi
//
//public int sum(int a, int b){//metoda koja vraca int
//    int zbir = a+b;
//    return zbir;
//}
//public void sum2(int a, int b){//void nije nosilac vrednosti, ova metoda ne vraca nista
//
//    System.out.println(a+b);
//}
//
//public void ispis(){
//    ime="zika";
//    System.out.println("Ime: "+ ime + " prezime: " + prezime + " godine: "+ godina);
//}
//public String ispis2(){
//    String student = "Ime: "+ ime + " prezime: " + prezime + " godine: "+ godina;
//    return student;
//}
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "ime='" + ime + '\'' +
//                ", prezime='" + prezime + '\'' +
//                ", godina=" + godina +
//                '}';
    //}
    // nasledjivanje

    private String brojIndexa;
    public Student(String ime, String prezime, String email, Adresa adresa, String brojIndexa) {
        super(ime, prezime, email, adresa);
        System.out.println("ispis iz klasee Student");
        this.brojIndexa = brojIndexa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "brojIndexa='" + brojIndexa + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", adresa=" + adresa +
                '}';
    }
}
