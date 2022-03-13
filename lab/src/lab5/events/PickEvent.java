package lab5.events;

import State.ShoppingState;
import State.FIFO;
import State.Customer;
public class PickEvent extends Event{
	private FIFO f;
	private Customer customer;
	private ShoppingState state;
	private EventQueue queue;
	private double time;

	/**
	 * @param state State som användas av simolatorn
	 * @param time  Tid som Eventet inträffar
	 * @param queue EEventQueue som används
	 */

	public  PickEvent(ShoppingState state, EventQueue queue, double time,Customer customer) {
		super(state, queue, time,customer);

	}
	

	public void effect() {
		// om lediga kassor betala,annars ställ i kön
		if(state.getUnoccupiedRegisters()>0) {
			state.decUnoccupiedRegisters();
			queue.add(new PickEvent(state,queue,state.getQueueTime()+state.getLastPayTime()) ;
		}
		f.add(customer);
	}	
	
}



}
