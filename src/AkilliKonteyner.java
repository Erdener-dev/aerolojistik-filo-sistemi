public class AkilliKonteyner<T> {
    private T data;
    public AkilliKonteyner(T data) {
        this.data = data;
    }

    public void veriOkuma() {
        System.out.println("Konteynerin içerisindeki ürün: "+data);
    }
}
