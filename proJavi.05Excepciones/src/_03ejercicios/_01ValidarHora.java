package _03ejercicios;

public class _01ValidarHora {
	public static void main(String[] args) {
		System.out.println(esHoraValida("10:30:45"));
		System.out.println(esHoraValida("30:20:10"));
		System.out.println(esHoraValida("10:2O:30"));

	}

	public static boolean esHoraValida(String h) {
		try {
			int posSeparador1 = h.indexOf(':');
			int posSeparador2 = h.lastIndexOf(':');

			String hh = h.substring(0, posSeparador1);
			String mm = h.substring(posSeparador1 + 1, posSeparador2);
			String ss = h.substring(posSeparador2 + 1);

			int numHora = Integer.parseInt(hh);
			int numMin = Integer.parseInt(mm);
			int numSeg = Integer.parseInt(ss);

			if (numHora >= 0 && numHora <= 23 && numMin >= 0 && numMin <= 59 && numSeg >= 0 && numSeg <= 59) {
				return true;
			} else {
				return false;
			}
		} catch (StringIndexOutOfBoundsException e) {
			return false;
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
