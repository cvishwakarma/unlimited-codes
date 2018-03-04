
	import java.util.*;
	import java.util.stream.Collectors;
public class Game	{
		String name;
		int ranking;
		public Game(String name, int ranking){
			this.name = name;
			this.ranking = ranking;
		}
		public String getName(){
			return name;
		}
		public int getRanking(){
			return ranking;
		}
		public void setRanking(int ranking){
			this.ranking = ranking;
		}
		public void setName(String name){
	     this.name = name;
		}
		public static void main(String args[])	{
			List<Game> list = 
			Arrays.asList(new Game("Dragon Blaze", 5),
					  new Game("Angry Bird",6),
					  new Game("Candy Crush",7));
			String result = list.stream().map(x-> x.getName())
			.collect(Collectors.joining(",","{","}"));
			System.out.println(result);
			
			
		}

	}
