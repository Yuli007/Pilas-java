package sample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Maiin {


    public static void main(String[] args) {

        Pilass p = new Pilass (); //Declaramos una variable p que nos permitira llamar a los metodos de la clase Pilass

        Scanner sc = new Scanner(System.in);//Funcion Scanner que nos permitira leer los datos ingresados por el usuario.

        boolean Terminar = false; //Denifimos una variable Terminar de tipo booleana que se inicia como falsa
        int min = 10000; //Definimos una variable min de tipo entero que toma el valor 10000.
        int max = 0; //Definimos una variable max de tipo entero que toma el valor 0.


        while (!Terminar) { //Ciclo while que repite el menu si terminar es diferente de falso, entoces se repitira si solamente es verdadero.
            //Le mostramos al usuario de manera grafica las opciones que puede elegir

            System.out.println(" "); //Espacio en blanco para dar simular un salto de linea
            System.out.println("1.Insertar"); //Opcion 1 del menu, inserta valores en la pila
            System.out.println("2.Mostrar"); //Opcion 2 del menu, muestra los valores que actualmente tiene la pila
            System.out.println("3.Buscar"); // Opcion 3 del menu, busca un valor en la pila
            System.out.println("4.Eliminar"); //Opcion 4 del menu, elimina un valor en especifico de la pila
            System.out.println("5.Contar"); //Opcion 5 del menu, cuenta los valores que tiene la pila actualmente
            System.out.println("6.Valor Maximo"); //Opcion 6 del menu, muestra el valor maximo de la pila
            System.out.println("7.Valor Minimo"); //Opcion 7 del menu, muestra el valor minimo de la pila
            System.out.println("8.Salir"); //Opcion 8 del menu, termina el proceso de la aplicacion

            System.out.println(" ");//Salto de linea

            System.out.println("Elige un numero:"); //Le pide al usuario elegir una de las opciones del menu
            int opcion = sc.nextInt(); //Toms el valor ingresado por el usuario y lo envia a la variable Opcion
            System.out.println(" ");//Salto de linea

            try {

                switch (opcion) { //Funcion Switch que nos permitira elegir una opcion del menu.
                    //Dependiendo del valor que tenga la variable opcion sera la opcion que se ejecutara en el menu.
                    case 1: //Si la variable opcion es igual a 1

                        System.out.println("Escribe el Tamaño de la pila "); //Le pide al usuario el tamano de la pila
                        int tamaño = sc.nextInt(); //Toma el valor ingresado por el usuario y lo envia a la variable tamaño

                        for (int i = 0; i < tamaño; i++) { //Ciclo for que repetira el proceso de agregar un valor a la pila
                            System.out.println("Teclea tu Valor "); //dependiendo del tamano que agrego el usuario.
                            int valor = sc.nextInt();// La variable valor va a tomar el valor ingresado por el usuario
                            p.push(valor);// La funcion push anadira el valor de la variable valor a la pila
                                        //Y el proceso finalizara cando el incremento del ciclo llegue al tamano defindo
                                        //por el usuario.

                            System.out.println(" "); //Salto de linea

                            if (valor < min) { //compara los valores de la variable valor y el valor mas pequeno es igual a la varaible min.
                                min = valor;
                            }
                            if (valor > max) {//compara los valores de la variable valor y el valor mas grande es igual a la varaible max.
                                max = valor;
                            }
                        }

                        break;//Funcion break del switch que termina el proceso.

                    case 2://Si la variable opcion es igual a 2

                        if (p.vacia()) { //Mandamos a traer la funcion vacia de la clase Pilas que indica que la pila esta vacia
                            System.out.println("La lista esta vacia no se puede Mostrar los elementos "); //Manda un mensaje indicandolo
                        } else {
                            p.peek(); //Mandamos a traer de la clase Pilass la funcion peek que nos devolvera los valores que actualmente
                            //Tiene la pila
                            System.out.println(" "); //Salto de linea
                            break;
                        }
                        break;//Funcion break del switch que termina el proceso.

                    case 3://Si la variable opcion es igual a 3

                        if (p.vacia()) {//Mandamos a traer la funcion vacia de la clase Pilas que indica que la pila esta vacia
                            System.out.println("La lista esta vacia no se puede buscar elementos "); //Manda un mensaje indicandolo
                        } else { //Si es falso
                            System.out.println("Teclee el valor que deseas buscar "); //Mensaje para preguntar al usuario
                            int valor1 = sc.nextInt(); // La variable valor1 tomara el valor ingresado por el usuario
                            p.cima(valor1); //LLamamos a la funcion cima de la clase Pilass que sirve para buscar un numero dentro de la pila
                            //y buscara el valor que ingreso el usuario, y este valor es el que actualmente tiene la variable valor1.
                            System.out.println("\n"); //Salto de linea.
                        }

                        break;//Funcion break del switch que termina el proceso.

                    case 4://Si la variable opcion es igual a 4

                        if (p.vacia()) { //Mandamos a traer la funcion vacia de la clase Pilas que indica que la pila esta vacia
                            System.out.println("La lista esta vacia no se puede eliminar elementos "); //Manda un mensaje indicandolo
                        } else {//Si es falso
                            int Sig1;
                            System.out.println("Teclea el Numero que deseas Eliminar "); //Pregunta al usuario el valor que desea eliminar de la pila
                            Sig1 = sc.nextInt(); //La varible Sig1 toma el valor ingresado por el usuario.
                            p.eliminar(Sig1); //Llamamos a la funcion eliminar de la clase Pilas que elimina un elemento de la pila y este valor que eliminara
                            //Sera el valor de la variable Sig1 que anteriormente el usuario le dio ese valor a la variable.
                            System.out.println("\n");//Salto de linea.
                        }

                        break;//Funcion break del switch que termina el proceso.

                    case 5://Si la variable opcion es igual a 5

                        if (p.vacia()) { //Mandamos a traer la funcion vacia de la clase Pilas que indica que la pila esta vacia
                            System.out.println("La lista esta vacia no hay elementos "); //Manda un mensaje indicandolo
                        } else {//Si es falso
                            System.out.println("\nEl total de elementos es de :" + p.pop()); //Llamamos a la funcion pop que se encuentra
                            //en la clase Pilas esta funcion mostrara el total de elementos que actualmente tiene la pila.

                            System.out.println(" ");//Salto de linea.
                        }

                        break;//Funcion break del switch que termina el proceso.

                    case 6://Si la variable opcion es igual a 6

                        if (p.vacia()) {//Mandamos a traer la funcion vacia de la clase Pilas que indica que la pila esta vacia
                            System.out.println("La lista esta vacia no hay elementos ");//Manda un mensaje indicandolo
                        } else {//Si es falso
                            System.out.println("\nEl Valor Maximo es:" + max);//Muestra el valor maximo de la pila
                            //comparando entre los valores que actualmente tiene y lo envia por medio de la variable max.

                            System.out.println(" ");//Salto de linea.
                        }

                        break;//Funcion break del switch que termina el proceso.

                    case 7://Si la variable opcion es igual a 7

                        if (p.vacia()){ //Mandamos a traer la funcion vacia de la clase Pilas que indica que la pila esta vacia
                            System.out.println("La lista esta vacia no hay elementos "); //Manda un mensaje indicandolo
                        } else { //Si es falso
                            System.out.println("\nEl Valor Minimo es:" + min);//Muestra el valor minimo de la pila
                            //comparando entre los valores que actualmente tiene y lo envia por medio de la variable min.

                            System.out.println(" ");//Salto de linea.
                        }

                        break;//Funcion break del switch que termina el proceso.

                    case 8://Si la variable opcion es igual a 8

                        Terminar = true; //Si terminar el verdadero termina el proceso de la aplicacion y finaliza el programa.
                        System.out.println("Saliste :*");//Muestra un mensaje indicandonos que salimos de la aplicacion

                        break;//Funcion break del switch que termina el proceso.

                    default://Por defecto si no se elige una de las opciones anteriores mostrara el siguiente mensaje y repetira el menu.

                        System.out.println("Solo numeros entre hasta 1 y 8"); //Muestra un mensaje al usuario indicandole que solo
                        //puede elegir una opcion entre 1 y 8 del menu.

                }
            } catch (InputMismatchException e) { //Capturador de errores

                System.out.println("Solo puedes teclear numeros"); //Muestra un mensaje al usuario indicandole que solo puede ingresar
                //numeros.
                sc.next();

            }
        }}}

