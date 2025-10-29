class Demo2 {

    public static void main(String[] args) {
        try{    
            try{
                 System.out.println("Array element");
                 int arr[]={1,2,3};
                 System.out.println(arr[5]);
             }
             catch(ArrayIndexOutOfBoundsException e){
                 System.out.println("Array index is out of bounds");
             }
             try{
             System.out.println("Interger divison");
             int a=10/0;
             System.out.println(a);
             }
             catch(ArithmeticException e){
                 System.out.println("Denominator is zero");
             }
        String s="sailaja";
        System.out.println(s.length());
       }    

        catch(Exception e){
            System.out.println(e);

        }
        System.out.println("Program Completed");
}
}