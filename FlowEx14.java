class FlowEx14 {
    public static void main(String[] arge){
        for(int i=1, j=10; i<=10; i++,j--){
            System.out.printf("%d \t %d%n", i, j);
        }
//        위와 동일
        for(int i=1; i<=10; i++){
            System.out.printf("%d \t %d%n", i, 11-i);
        }
    }
}
