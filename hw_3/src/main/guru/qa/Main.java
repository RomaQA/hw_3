package main.guru.qa;

public class Main {
    public static void main(String[] args) {
        byte varByte = 127; // -128 .. 127
        System.out.println(varByte+1);
        short varShort = 0; // -32768 ... 32767
        System.out.println(varByte-varShort);
        int varInt = 2147483647;
        System.out.println(varInt*varByte);
        long varLong = 1L;
        System.out.println(varLong>varInt);

        float varFloat = 5.5f;
        System.out.println(varFloat/2);
        double varDouble = 3.3d;
        System.out.println(varDouble);
        char varChar = 'a';
        System.out.println(varChar=='a');

        var all=varByte+varShort+varInt+varLong+varFloat+varDouble+varChar;
        System.out.println("Все подряд= "+all);
    }

}
