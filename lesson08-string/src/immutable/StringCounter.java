package immutable;

public class StringCounter {
	    private int numberOfUcletters;
		private int numberOfLcletters;
		private int numberOfDigitletters;
		public StringCounter(int numberOfUcletters, int numberOfLcletters, int numberOfDigitletters) {
			super();
			this.numberOfUcletters = numberOfUcletters;
			this.numberOfLcletters = numberOfLcletters;
			this.numberOfDigitletters = numberOfDigitletters;
		}
		@Override
		public String toString() {
			return "StringCounter [numberOfUcletters=" + numberOfUcletters + ", numberOfLcletters=" + numberOfLcletters
					+ ", numberOfDigitletters=" + numberOfDigitletters + "]";
		}
		
}
