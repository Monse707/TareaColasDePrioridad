import java.util.ArrayList;
import java.util.List;

public class BoundedPriorityQueue {
    ArrayList<ArrayList<Elemento>> listaDeElementosConPrioridad = new ArrayList<ArrayList<Elemento>>();
    int prioridad;

    public BoundedPriorityQueue (int prioridad) {
        for (int i =  0; i < prioridad; i = i+1){
            listaDeElementosConPrioridad.add(new ArrayList<Elemento>());
        }
        this.prioridad = prioridad;

    }


    public boolean is_empty(){
        for (int i = 0; i < prioridad; i = i+1){
            if(listaDeElementosConPrioridad.get(i).isEmpty() == false)
                return false;
        }
        return true;
    }

    public int length(){
        int lengt = 0;
        for (int i = 0; i< prioridad; i = i+1){
           lengt = lengt + listaDeElementosConPrioridad.get(i).size();
        }
        return  lengt;
    }

    public void enqueue(int prioridad,Elemento e){
        listaDeElementosConPrioridad.get(prioridad-1).add(e);
    }
    public Elemento dequeue(){
        for (int i = 0; i < prioridad; i = i+1){
           if(listaDeElementosConPrioridad.get(i).isEmpty())
               return listaDeElementosConPrioridad.get(i).get(0);
        }
        return null;
    }

    @Override
    public String toString() {
        String des = "";
        for (int i = 0; i < prioridad; i = i+1){
            des = des + "\n" + String.format("Hay %d elemento en la prioridad %d",listaDeElementosConPrioridad.get(i).size(),i+1);
        }
        return des;
    }
}
