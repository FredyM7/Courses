public class WrapperInteger {
    public static void main(String[] args) {

        Integer intObjecto = Integer.valueOf(32768); //Forma explícita de crear un objeto del tipo Integer, se le conoce como [BOXING]
        Integer intObjeto2 = 32768; //Forma más automática (implícita) de hacer lo mismo de arriba. Toma de la literal el valor primitivo entero y lo convierte automáticamente a un objeto, esto se conoce como [AUTOBOXING]

        int intPrimitivo = 32768;
        Integer intObj = Integer.valueOf(intPrimitivo);
        Integer intObj0 = intPrimitivo;
        System.out.println("intObj0 = " + intObj0);

        //Convertir de tipo objeto a primitivo
        int num1 = intObj0.intValue(); //Forma explícita [UNBOXING]
        int num2 = intObj0; //Forma implícita [AUTO UNBOXING]
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valorTvLcdEnteroObjeto = Integer.valueOf(valorTvLcd);
        System.out.println(valorTvLcdEnteroObjeto+1);

        Short shortObjeto = intObj0.shortValue();
        System.out.println("shortObjeto = " + shortObjeto); //El máximo valor que admite el tipo Short es 32767, y se le asigna un valor de 32768, por lo tanto hay pérdida de información.

        Byte byteObjeto = intObj0.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);//Mismo caso que el Short

        Long longObjeto = intObj0.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
