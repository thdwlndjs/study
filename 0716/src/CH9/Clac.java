package CH9;

class Clac {

	double avg;

	public double average(int length, double total) {
		avg = total / length;
		return avg;
	}

	public int round(double _avg) {
		int result = (int) Math.round(_avg);
		return result;
	}

}
