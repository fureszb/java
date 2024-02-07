package fajlbeolvasas;

public class Ember {

    private String nev, lakhely;

    
    private byte kor;

    public String getNev() {
        return nev;
    }

    public String getLakhely() {
        return lakhely;
    }

    public byte getKor() {
        return kor;
    }

    @Override
    public String toString() {
        return "Ember{" + "nev=" + nev + ", lakhely=" + lakhely + ", kor=" + kor + '}';
    }

    public Ember(String nev, String lakhely, byte kor) {
       this(nev+";"+kor+";"+lakhely);
    }
    
    public Ember(String sor) {
        String[] s = sor.split(";");
         this.nev = s[0];
        this.lakhely = s[2];
        this.kor = Byte.parseByte(s[1]);
    }
    

}
