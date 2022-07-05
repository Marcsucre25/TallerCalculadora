import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Datos dato1[]= new Datos[1];

        String palabra = "";
        double numero = 0.0;
        int entero = 0;
        int a=0;

        for(int i=0; i<dato1.length; i++) {
            palabra=JOptionPane.showInputDialog(null, "String:  ");
            numero=Double.parseDouble(JOptionPane.showInputDialog(null, "Double: "));
            entero=Integer.parseInt(JOptionPane.showInputDialog(null, "Entero/int: "));
            a= Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un dato INT : ", "Calculadora", JOptionPane.QUESTION_MESSAGE));

            dato1[i]=new Datos(palabra, numero, entero, a);
        }


        int string= Integer.parseInt(palabra);
        double string1 = Double.parseDouble(palabra);
        double numero1= Double.parseDouble(String.valueOf(entero));
        Integer i = a;
        byte b = i.byteValue();

        JOptionPane.showMessageDialog(null, "De string a entero: "+string +"\n" +
                "De string a double:  "+ string1 +"\n"+"De Entero a Double: "+numero1+"\nValor de int a BYTE: "+b);





}
}

