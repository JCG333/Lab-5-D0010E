package lab5.events;
import State.State;

public abstract class Event {
	private State state;
	private EventQueue queue;
	private double time;
	/**
	*@param state State som användas av simolatorn
	*@param time Tid som Eventet inträffar
	*@param queue EEventQueue som används
	*/
	public Event(State state,EventQueue queue,double time) {
		this.state=state;
		this.time=time;
		this.queue=queue;
	}
	/**
	 * @return time tiden för händelsen
	 */
	public double getTime() {
		return time;
	}
	/**
	 * utför effekten
	 */
	public abstract void effect();


}

