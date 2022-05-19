package CRUD;

public class Student {
    private int id;
    private String nume;
    private String prenume;
    private int anulDeStudii;
    private String grupa;

    public Student(int id, String nume, String prenume, int anulDeStudii, String grupa) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.anulDeStudii = anulDeStudii;
        this.grupa = grupa;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getAnulDeStudii() {
        return anulDeStudii;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setAnulDeStudii(int anulDeStudii) {
        this.anulDeStudii = anulDeStudii;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", anulDeStudii=" + anulDeStudii +
                ", grupa='" + grupa + '\'' +
                '}';
    }
}
