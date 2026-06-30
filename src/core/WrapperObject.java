package core;

class WrapperObject {

    public static void main(String[] args)
    {
        int a = 10;
        Integer i = Integer.valueOf(a); //auto-boxing
        System.out.println(i);

        //unboxing
        int j = i;
        System.out.println(j);
    }
    
}