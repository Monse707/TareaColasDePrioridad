public class Main {
    public static void main(String[] args) {
        BoundedPriorityQueue boundedPriorityQueue = new BoundedPriorityQueue(5);
        System.out.println(boundedPriorityQueue.toString());
        boundedPriorityQueue.enqueue(4,new Elemento("maestre"));
        boundedPriorityQueue.enqueue(2,new Elemento("ninos"));
        boundedPriorityQueue.enqueue(4,new Elemento("mecanico"));
        boundedPriorityQueue.enqueue(3,new Elemento("hombres"));
        boundedPriorityQueue.enqueue(4,new Elemento("vigia"));
        boundedPriorityQueue.enqueue(5,new Elemento("capitan"));
        boundedPriorityQueue.enqueue(4,new Elemento("timonel"));
        boundedPriorityQueue.enqueue(3,new Elemento("mujeres"));
        boundedPriorityQueue.enqueue(2,new Elemento("3era edad"));
        boundedPriorityQueue.enqueue(1,new Elemento("ninas"));
        System.out.println(boundedPriorityQueue.toString());

    }
}
