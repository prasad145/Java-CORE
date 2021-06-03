class staticVariables{
    int a = 15; // instance variable or object variable
    static int b = 10; //static variable or class variable (it cannot be a local variable)
    void change(){
        int c = 25; // local varible
        System.out.println("instance Variable: " + a);
        System.out.println("static variable: " + b);
    }
    public static void main(String[] args)
    {
        staticVariables obj1 = new staticVariables();
        staticVariables obj2 = new staticVariables();
        obj1.change();
        b = 20; // static variable can accessed inside main method
        obj2.change();
    } 
}