package sample;

public class Nodoo {

    private int valor ;//Declaramos una variable llamada valor de tipo eentero
    private Nodoo prox;//Declaramos una variable que nos permite usar las variables de Nodoo


    public Nodoo() {//Este metodo nos permite inicializar el valor de la variable en 0
        this. valor = 0;//Inicia el valor de la variable variable en 0
        this.prox = null;//Inicia el valor de la variable prox como nulo

    }

    public Nodoo (int v){//Creamos un metodo que nos permitira ingresar un valor
        this.valor = v;//este valor sera ingresado a la varianble valor
        this.prox = null;//indica que la variable es igual a nula

    }

    public void Unir(Nodoo n) {//Creamos un metodo que nos permite unir los valores ingresados a los nodos
        prox = n;
    }

    public void setValor (int v) {//Metodo que enviar el valor ingresado a la variable valor
        valor = v;
    }

    public void setProx(Nodoo p){//Metodo que envia el valor al proxima posicion.
        prox = p;

    }

    public int getValor (){//Nos permite obtener el valor de la variable valor
        return valor;
    }

    public Nodoo getProx (){//Nos permite pasar al proximo elemnto de la pila
        return prox;
    }
}


