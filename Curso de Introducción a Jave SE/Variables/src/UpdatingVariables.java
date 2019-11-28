public class UpdatingVariables {

    public static void main(String[] args){

        int salary = 1000;
        System.out.println(salary);

        // bono $200
        salary = salary + 200;
        System.out.println(salary);

        // pensión $50
        salary = salary - 50;
        System.out.println(salary);

        // actualizando cadenas de texto:
        String employeeName = "John Doe";

        employeeName = employeeName + " Doe2"; // concatenación de cadenas de texto
        System.out.println(employeeName);

    }
}
