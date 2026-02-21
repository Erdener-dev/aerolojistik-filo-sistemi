public abstract class  Tasit {
    private String plaka;
    private String model;

    public Tasit(String plaka, String model) {
        this.plaka = plaka;
        this.model = model;
    }

    public abstract void teslimataCik();
}
