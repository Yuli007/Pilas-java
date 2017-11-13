package sample;

import java.util.Scanner;

public class Pilass {

    private Nodoo top; //definimos una variable de tipo privada que nos permiria accedes a los metodos de la clase Nodoo
    int size; //Declaramos una variable de tipo entero.


    public Pilass (){
        top = null;
    }
    public boolean vacia (){
        return ( top == null);
    }

    public void push (int valor){//Creamos un metodo que nos permirira ingresar valores a la pila
        Nodoo nuevoNodo;// Declaramos una variable que nos permitira usar los metodos de la clase Nodoo
        if(vacia()) //Si la pila esta vacia
            top = new Nodoo(valor);//Agrega un nuevo valor a la pila indicando que es el primer valor ingresado
        else{//Si la pila no esta vacia
            nuevoNodo = new Nodoo(valor);// agrega un valor a la pila y el valor ingresado se coloca como el primer valor de la pila
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }

    public void peek () {//Creamos un metodo que nos mostrara los valores que actualmente tiene la pila
        Nodoo temp = top;
        if (temp != null){// si variable temp es diferente de nulo muestra los valores
            System.out.println("La pila es:");
            while (temp != null){//ciclo while que nos mostrara todos los valores de la pila
                System.out.println(temp.getValor());//por medio de la variable top accedemos al valor de la pila
                temp = temp.getProx();//la variable temp no permite acceder a la metodo getProz que permire
                //mostrarnos todos los valores que tiene la pila.
            }
        }
        else
            System.out.println("Pila Vacía"); //Muestra un mensaje indicandonos que la pila esta vacia.
    }

    public void cima(int busqueda) {//Creamos un metodo buscar

        try {
            Nodoo temp = top;
            int posicion = 1;

            if (temp.getValor() == busqueda) { //Si la pila solo tiene un valor y este es igual a la busqueda, se indica que esta
                //en la posicion 0.
                System.out.println("El valor esta en la posición 0");
            } else {
                while (temp != null) {//Indica que si la pila es diferente de vacia
                    if (temp.getProx().getValor() == busqueda) {//Si se enuentra mas de un valor en la pila este empezara a buscar
                        //uno por uno y se detendra hasta que el valor ingresado se igual a un valor que se encuentra en la pila.
                        System.out.println("valor en la posicion:" + posicion);//Si el valor es encontrado se nos muestta en que
                        //posicion se encuentra.
                        break;
                    }
                    posicion++;//recorre cada posicion de 1 en 1
                    temp = temp.getProx();
                }}
        }
        catch (Exception ex)
        {
            System.out.println("El elemento no se encuentra");
        }
    }

    public void eliminar(int sigl) {//Metodo que nos permitira eliminar un elemento de la lista
        Nodoo temp = top;

        try {
            if (temp == null) {

                while (temp != null) {//Si la pila es diferentede vacia
                    if (temp.getValor() == sigl) {//Si el valor se encuentra en los valores de la pila
                        temp.Unir(temp.getProx().getProx());//Elimina el valor de la pila
                        size--;//Y en la contara con un elemnto menos si afectar la posicion de los valores que se encontraban
                        // despues de el
                        break;
                    }
                    temp = temp.getProx();
                }
            }
            System.out.println("Valor Eliminado"); //Muestra un valor que nos indica que el valor ha sido eliminado correctamente

        } catch (Exception ex) {//Si el valor no se encunra en la lista
            System.out.println("El valor  no existe");//muestra un mensaje indicandonos que no existe el valor que ingresamos
        }
    }


    public int size (){
        return size;
    }

    public int pop (){//Creamos un metodo que nos permitira contar los elemntos que tiene la pila
        Nodoo aux = null;
        int i=0; //declaramos la varibale i que tiene el valor 0
        aux = top;
        while(aux != null){//Cuenta los valores de la pila
            aux = aux.getProx();//suma los valores de 1 por 1
            i++;// y se incrementa el valor de la variable i
        }
        return i;//y nos retorna el valor de la variable i
    }

}




