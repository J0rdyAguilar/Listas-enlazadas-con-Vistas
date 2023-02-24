package modelos;

public class Lista {
    Nodo primero;
    
    public void insertarNodo(int dato){
        Nodo nodo1 = new Nodo(dato);
        if(primero == null){
            primero = nodo1;
        }
        else{
            nodo1.siguiente = primero;
            primero = nodo1;
        }
    }
    
    public void ListarNodos(){
        Nodo Auxiliar;
        Auxiliar = primero;
        while(Auxiliar!= null){
            System.out.println(Auxiliar.getDato());
            Auxiliar = Auxiliar.siguiente;
        }
    }
    
}
