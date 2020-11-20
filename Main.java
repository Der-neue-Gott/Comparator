import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {	
		
		PriorityQueue<Ticket> priorityQueue1 = new PriorityQueue<>(new CostComparator());
			priorityQueue1.add (new Ticket (600, true) );
			priorityQueue1.add (new Ticket (100, false) );
			priorityQueue1.add (new Ticket (500, true) );
			priorityQueue1.add (new Ticket (150, true) );
			priorityQueue1.add (new Ticket (800, true) );
			priorityQueue1.add (new Ticket (200, false) );
			priorityQueue1.add (new Ticket (250, false) );

		PriorityQueue<Ticket> priorityQueue2 = new PriorityQueue<>(new VipComparator().thenComparing(new CostComparator()));
			priorityQueue2.add (new Ticket (600, true) );
			priorityQueue2.add (new Ticket (100, false) );
			priorityQueue2.add (new Ticket (500, true) );
			priorityQueue2.add (new Ticket (150, true) );
			priorityQueue2.add (new Ticket (800, true) );
			priorityQueue2.add (new Ticket (200, false) );
			priorityQueue2.add (new Ticket (250, false) );
		
		
		while(!priorityQueue1.isEmpty()) {
			System.out.println("Price is: " + priorityQueue1.poll().getCost());
		}
	
	System.out.println("---------");
		
		while(!priorityQueue2.isEmpty()) {
			System.out.println("Is it VIP? : " + priorityQueue2.poll().getIsVIP());
		}
		
	}
	
	
	public static class CostComparator implements Comparator<Ticket> {
		
		@Override
		public int compare(Ticket o1, Ticket o2) {
			return o2.getCost() - o1.getCost();

		}
	
	}

	public static class VipComparator implements Comparator<Ticket> {

		@Override
		public int compare(Ticket o1, Ticket o2) {
            if(o2.getIsVIP()) {
                return 1;
            } else if (!o2.getIsVIP()){
                return -1;
            } else {
                return 0;
            }
		}

	}
}