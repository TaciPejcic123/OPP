package main;

public class Adresa {
    private  String ulica;
    private int brojUlice;
    private String grad;

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }


    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getBrojUlice() {
        return brojUlice;
    }

    public void setBrojUlice(int brojUlice) {
        this.brojUlice = brojUlice;
    }



    public Adresa(String ulica, int brojUlice, String grad) {
        this.ulica = ulica;
        this.brojUlice = brojUlice;
        this.grad = grad;
        System.out.println("ispis iz klasee Adresa");
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "ulica='" + ulica + '\'' +
                ", brojUlice=" + brojUlice +
                ", grad='" + grad + '\'' +
                '}';
    }
}
