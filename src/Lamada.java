interface Lamada {
    public void Lama();
}

 class LambdaExpressionExample {
    public static void main(String[] args) {
        int width=10;

        //with lambda
        Lamada d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.Lama();
    }
}


