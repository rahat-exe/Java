 interface Animals {
  void sound();
}

class Dogs implements Animals{
    public void sound(){
        System.out.println("Barks");
    }
}

class Interfacess {
    public static void main(String[] args){
        Dogs d1 = new Dogs();
        d1.sound();
    }
}
