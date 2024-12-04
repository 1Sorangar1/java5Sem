package module30;

class Factorial{

    public static int getFactorial(int num) throws FactorialException{

        int result=1;
        if(num<1) throw new FactorialException("The number is less than 1", num);

        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
}

class FactorialException extends Exception{

    private int number;
    public int getNumber(){return number;}
    public FactorialException(String message, int num){

        super(message);
        number=num;
    }

    public static void main(String[] args){

        try{
            int result = Factorial.getFactorial(6);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}

/*
Здесь для определения ошибки, связанной с вычислением факториала, определен класс FactorialException,
который наследуется от Exception и который содержит всю информацию о вычислении.
В конструкторе FactorialException в конструктор базового класса Exception передается сообщение об ошибке: super(message).
Кроме того, отдельное поле предназначено для хранения числа, факториал которого вычисляется.
 */