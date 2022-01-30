package Domaci2212.Glumci;

public class Glumci {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean daLiJeIzSrbije;

    public Glumci(String ime, String prezime, char pol, int godine, double ocena, boolean daLiJeIzSrbije) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.daLiJeIzSrbije = daLiJeIzSrbije;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public boolean isDaLiJeIzSrbije() {
        if(daLiJeIzSrbije){
            System.out.println("Glumac/ca je iz Srbije");
        }
        else{
            daLiJeIzSrbije = false;
        }
        return daLiJeIzSrbije;
    }

    public void setDaLiJeIzSrbije(boolean daLiJeIzSrbije) {
        this.daLiJeIzSrbije = daLiJeIzSrbije;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Prezime: ");
        sb.append(prezime);
        sb.append("\n");

        sb.append("Pol je: ");
        sb.append(pol);
        sb.append("\n");

        sb.append("Godine: ");
        sb.append(godine);
        sb.append("\n");

        sb.append("Ocena: ");
        sb.append(ocena);
        sb.append("\n");

        sb.append("Glumac/ica je iz Srbije: ");
        if(daLiJeIzSrbije){
            sb.append("Da");
        }
        else{
            sb.append("Ne");
        }
        sb.append("\n");

        return sb.toString();
    }
}
