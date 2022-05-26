public class Word {
   private String word;
   private int month;
   private int day;
   private int year;
   public Word() {
      word = "";
      month = -1;
      day = -1;
      year = -1;
   }
   
   public Word(String w) {
      word = w;
      month = -1;
      day = -1;
      year = -1;
   }
   
   public Word(String w, int m, int d, int y) {
      word = w;
      month = m;
      day = d;
      year = y;
   }
   
   public String getWord() {
      return word;
   }
   
   public int getMonth() {
      return month;
   }
   
   public int getDay() {
      return day;
   }
   
   public int getYear() {
      return year;
   }
}