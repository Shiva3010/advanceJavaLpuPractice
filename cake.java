class cake{
    private final String milk;
    private final String sugar;
    private final String egg;
    private final String fruits;
    private final String chololate;
    
    cake (Mybakery ref){
        this.milk = ref.milk;
        this.sugar = ref.sugar;
        this.egg = ref.egg;
        this.fruits = ref.fruits;
        this.chololate = ref.chololate;
    }
    public String toString() {
        return "Ingredient required to bake cake is :- "+milk+""+sugar+""+egg+""+fruits+""+chololate+".";
    }
    public static class Mybakery{
        public String chololate;
        private final String milk;
        private final String sugar;
        private  String egg;
        private  String fruits;
        public Mybakery(String milk, String sugar){
        this.milk= milk;
        this.sugar= sugar;
    }
    public Mybakery egg(String egg){
        this.egg = egg;
        return this;
    }
    public Mybakery sugar(String fruits){
        this.fruits=fruits;
        return this;
    }
    public Mybakery chocolate (String chocolate){
        return this;
    }
    public Mybakery fruits (String fruit){
        this.fruits=fruits;
        return this;
    }
    public cake build(){
        cake ck = new cake(this);
        return ck;
    }
    }
}

class cakebuilder{
    public static void main (String[] args){
        cake c1 = new cake.Mybakery ("Amul milk", "two spoon").build();
        System.out.println(c1);
        cake c2 = new cake.Mybakery ("Amul milk", "two spoon").egg("2 eggs").build();
        System.out.println(c2);
        cake c3 = new cake.Mybakery ("Amul milk", "two spoon").egg("2 eggs").fruits("mix fruit").build();
        System.out.println(c3);
        cake c4 = new cake.Mybakery ("Amul milk", "two spoon").egg("2 eggs").fruits("mix fruit").chocolate("Choco chips").build();
        System.out.println(c4);
    }
}

