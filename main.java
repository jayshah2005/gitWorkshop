class calculator{

    // Constructor
    calculator(){
        
    }

    void add(int i, int j){
        System.out.println(i * j);
    }


    public static void main(String[] args) {
        calculator c = new calculator();
        c.add(1, 2);
    }
}