package main;

import java.util.Random;

/**
 * NON MODIFICARE
 */
public class PressureSensor implements PressureSensorListener {// implements?

	private Random rand = new Random(240);
	private Random randErrorCode = new Random(8);
	private PressureSensorListener listener;

	/**
	 * Imposta callback
	 * 
	 * @param listener
	 *            callback richiamata dal metodo next()
	 */
	@Override
	public void onSuccess(double pressure) {
		System.out.println(pressure);
	}
	@Override
	public void onFailed(PressureSensorException exception){
		System.out.println(exception.toString());
	}
	
	public void setListener(PressureSensorListener listener) {
		this.listener = listener;//non posso fare la new del listener essendo che e' un interfaccia
	}

	/**
	 * Ad ogni chiamata viene invocata la callback impostata su setListener. In
	 * caso di lettura corretta viene fornito il valore nella callback
	 * onSuccess. In caso di errore viene fornita sulla callback onFailed
	 * l'exception, con relativo codice di errore.
	 */
	public void next() {
		if (listener == null)
			return;

		// successo/errore simulato.
		double val = rand.nextDouble() * 20.0 - 1.0;
		if (val > 0) {
			listener.onSuccess(val);
		} else {
			listener.onFailed(new PressureSensorException("Pressure Error", randErrorCode.nextInt(10) * -1));
		}
	}

}
