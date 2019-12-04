public class NaminJava {
    /* Convención de nombres en Java
     *  · Sensible a mayúsculas y minúsculas.
     *  · Las variables empiezan por letra, '_' o '$', nunca por un número.
     *  · Constantes: en mayúsculas y las palabras separadas por '_'. EXISTE LA PALABRA RESERVADA 'FINAL'.
     * */
    public static void main(String[] args){
        int celphone = 1234;
        int celPhone = 5678;
        System.out.println(celphone);
        System.out.println(celPhone);

        String $countryName = "Spain";
        String _backgroundColor = "Green";
        System.out.println($countryName);
        System.out.println(_backgroundColor);

        String _variable$muy_rara_ = "hola";
        System.out.println(_variable$muy_rara_);

        int POSITION = 10;
        int POSITION_FINAL = 100;

        /* Upper Camel Case / Lower Camel Case
         *  · Las palabras que forman el nombre de una clase van juntos y empiezan cada una en mayúsulas.
         *  · Lo mismo con las variables excepto la primera letra que siempre va en minúscula.
         */
    }

}
