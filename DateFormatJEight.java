	public class DateFormatJEight {
		public static void main(String args[]) {
			DateTimeFormatter format =  null;
			LocalDateTime before7Days  = null;
			LocalDateTime now = null;

			format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ?");

			now = LocalDateTime.now();
			before7Days  = now.minusDays(7);

			System.out.println(String.format("Now:  %s\nBefore7Days: %s", now.format(format), before7Days  .format(format)));
}
}