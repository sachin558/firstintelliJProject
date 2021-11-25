interface Lamada1 {
    public void dispaly();
}
class LamadExpressinn {
    public static void main(String[] args) {
        int with = 40;
        Lamada1 d3 = () -> {
            System.out.println("this the writh" + with);
        };
        d3.dispaly();
    }
}