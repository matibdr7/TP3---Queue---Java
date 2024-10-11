package Punto2;

import java.util.Arrays;

public class Queue1<T> {
    private final static Integer defaulDimension = 4;

    //region Attributes
    private T[] data;
    private int head;
    private int tail;
    //endregion

    // Constructor por defecto con tamaño predeterminado
    public Queue1() {
        this(Queue1.defaulDimension);
    }

    // Constructor con tamaño personalizado
    public Queue1(int dimension) {
        this.data = (T[]) new Object[dimension];
        this.head = 0;
        this.tail = 0;
    }

    // Calcula la siguiente posición en la cola circular
    private int next(int pos) {
        if (++pos >= this.data.length) {
            pos = 0;
        }
        return pos;
    }

    // Agrega un elemento a la cola, lanza una excepción si está llena
    public boolean add(T element) {
        if (head == next(tail)) {
            throw new IllegalStateException("Cola llena ...");
        }
        this.data[this.tail] = element;
        this.tail = this.next(this.tail);
        return true;
    }

    // Devuelve el elemento en el frente de la cola, lanza excepción si está vacía
    public T element() {
        if (head == tail) {
            throw new IllegalStateException("Cola vacía ...");
        }
        return this.data[this.head];
    }

    // Intenta agregar un elemento a la cola, devuelve false si está llena
    public boolean offer(T element) {
        if (head == next(tail)) {
            return false;
        }
        this.data[this.tail] = element;
        this.tail = this.next(this.tail);
        return true;
    }

    // Devuelve el elemento en el frente de la cola sin eliminarlo, devuelve null si está vacía
    public T peek() {
        if (head == tail) {
            return null;
        }
        return this.data[this.head];
    }

    // Devuelve y elimina el elemento en el frente de la cola, devuelve null si está vacía
    public T pool() {
        if (head == tail) {
            return null;
        }
        T result = this.data[this.head];
        this.head = this.next(this.head);
        return result;
    }

    // Devuelve y elimina el elemento en el frente de la cola, lanza excepción si está vacía
    public T remove() {
        if (head == tail) {
            throw new IllegalStateException("Cola vacía ...");
        }
        T result = this.data[this.head];
        this.head = this.next(this.head);
        return result;
    }

    // Devuelve true si la cola está vacía, false en caso contrario
    public boolean isEmpty() {
        return head == tail;
    }
}
