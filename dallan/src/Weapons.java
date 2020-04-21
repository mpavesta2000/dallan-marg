public class Weapons {
    private String Assaultrifle;
    private String Sniperrifle;

    public Weapons(String Assaultrifle,String Sniperrifle) {
        this.Assaultrifle = Assaultrifle;
        this.Sniperrifle = Sniperrifle;

    }

    public String getAssaultrifle() {
        return Assaultrifle;
    }

    public void setAssaultrifle(String assaultrifle) {
        Assaultrifle = assaultrifle;
    }

    public String getSniperrifle() {
        return Sniperrifle;
    }

    public void setSniperrifle(String sniperrifle) {
        Sniperrifle = sniperrifle;
    }
}
