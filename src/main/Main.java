package main;

import utils.Utils;

public class Main {
    public static void main(String[] Args) {
//jedan nacin za setovanje vrednosti

////        Student student2 = new Student();
////        student2.ime = "Marko";
////        student2.prezime = "Maric";
////        student2.godina = 24;
//
//        //setovamnje sa pozivanjem get i set metoda
//        Student student1 = new Student();
//        student1.setIme("Pera");
//        student1.setPrezime("Peric");
//        student1.setGodina(20);
////drugi nacin za setovanje vrednost
//        Student student3 = new Student("Mile", "Milic", 21);
//        Student student4 = new Student("test", "testic");
//
//Student []studenti= {student1, student3, student4};
//
//for (int i=0; i<studenti.length; i++){
//    System.out.println(studenti[i]);
//}
//        System.out.println(student1);
//
//        //System.out.println(student2);
//        System.out.println(student3);
//        System.out.println(student4);
//
//        int a = student1.sum(5,5);
//        System.out.println(a);
//        student1.sum2(6,6);
//
//student1.ispis();
////student2.ispis();
//String ispisStudenta = student1.ispis2();
//        System.out.println(ispisStudenta);
//        System.out.println(student1.getIme());
//        System.out.println(student4.getPrezime());

        //nasledjivanje ispod
        Adresa adresa = new Adresa("First", 10,"London");
Student student = new Student("John", "Smith", Utils.randomEmail(),adresa,"2344/234");
Profesor profesor = new Profesor("Mile", "Milic",Utils.randomEmail(), adresa, "informatika");
        System.out.println(student);
        System.out.println(profesor);
   }
}

