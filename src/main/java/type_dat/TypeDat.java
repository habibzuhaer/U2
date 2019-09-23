package type_dat;

    class TypeDat {
        byte b = 0;
        int i = 23344556;
        short s = 1234;
        long l = 8989889;
        double d = 1234.3443;
        boolean bool = true;
        char cr = '4';

        TypeDat frends = new TypeDat();
        TypeDat mom ;
        TypeDat dad;
        Car car  = new Car();


    public static void main(String[] args) {
        TypeDat human = new TypeDat();
        System.out.println(human.car.speed);


    }
}  ////  код не работает  - выдает ошибку на 12 строке
