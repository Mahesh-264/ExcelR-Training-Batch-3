class Demo003{
    public static void main(String args[] ){
        int a = 50;
        int b = 45;
        int c = 55;
        if (a > b && a > c){
            System.out.println(" Greater number is A:"+a);
        }else if(b > c && b > a){
            System.out.println(" Greater number is B:"+b);
        }else{
            System.out.println("Greatest number is C: "+c);
        }
    }
}