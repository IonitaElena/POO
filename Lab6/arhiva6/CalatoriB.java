package Lab06;

public class CalatoriB {
    private int passagers = 50;
    private int postal = 400;
    private boolean doors = true;
    private boolean windows = true;

    public CalatoriB() {
    }

    public void setPassagers(int passagers) {
        this.passagers = passagers;
    }

    public int getPassagers() {
        return this.passagers;
    }

    public void setPostal(int postal) {
        this.postal = postal;
    }

    public int getPostal() {
        return this.postal;
    }

    public boolean automatDoors() {
        return this.doors;
    }

    public boolean automatWindows() {
        return this.windows;
    }

    public boolean compare(Vagon o) {
        return o.getPostal() < this.getPostal();
    }

    public String toString() {
        return "CalatoriB{passagers=" + this.passagers + ", postal=" + this.postal + ", doors=" + this.doors + ", windows=" + this.windows + "}";
    }
}
