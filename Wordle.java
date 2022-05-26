import java.util.*;

public class Wordle {
   private String word;
   private int wordIndex;
   private int day;
   private int month;
   private int year;
   private String letters;
   private ArrayList<Word> words = new ArrayList<Word>();

   public Wordle() {
      //Testers
      /*words.add(new Word("ABCDE", 3, 1, 2022));
      words.add(new Word("HAJKE", 3, 1, 2022));
      words.add(new Word("LMAOE", 3, 1, 2022));*/
      
      //April
      
      //March
      words.add(new Word("SAUTE", 3, 18, 2022));
      words.add(new Word("MOVIE", 3, 17, 2022));
      words.add(new Word("CATER", 3, 16, 2022));
      words.add(new Word("TEASE", 3, 15, 2022));
      words.add(new Word("SMELT", 3, 14, 2022));
      words.add(new Word("FOCUS", 3, 13, 2022));
      words.add(new Word("TODAY", 3, 12, 2022));
      words.add(new Word("WATCH", 3, 11, 2022));
      words.add(new Word("LAPSE", 3, 10, 2022));
      words.add(new Word("MONTH", 3, 9, 2022));
      words.add(new Word("SWEET", 3, 8, 2022));
      words.add(new Word("HOARD", 3, 7, 2022));
      words.add(new Word("CLOTH", 3, 6, 2022));
      words.add(new Word("BRINE", 3, 5, 2022));
      words.add(new Word("AHEAD", 3, 4, 2022));
      words.add(new Word("MOURN", 3, 3, 2022));
      words.add(new Word("NASTY", 3, 2, 2022));
      words.add(new Word("RUPEE", 3, 1, 2022));
   
      //Febuary
      words.add(new Word("CHOKE", 2, 28, 2022));
      words.add(new Word("CHANT", 2, 27, 2022));
      words.add(new Word("SPILL", 2, 26, 2022));
      words.add(new Word("VIVID", 2, 25, 2022));
      words.add(new Word("BLOKE", 2, 24, 2022));
      words.add(new Word("TROVE", 2, 23, 2022));
      words.add(new Word("THORN", 2, 22, 2022));
      words.add(new Word("OTHER", 2, 21, 2022));
      words.add(new Word("TACIT", 2, 20, 2022));
      words.add(new Word("SWILL", 2, 19, 2022));
      words.add(new Word("DODGE", 2, 18, 2022));
      words.add(new Word("SHAKE", 2, 17, 2022));
      words.add(new Word("CAULK", 2, 16, 2022));
      words.add(new Word("AROMA", 2, 15, 2022));
      words.add(new Word("CYNIC", 2, 14, 2022));
      words.add(new Word("ROBIN", 2, 13, 2022));
      words.add(new Word("ULTRA", 2, 12, 2022));
      words.add(new Word("ULCER", 2, 11, 2022));
      words.add(new Word("PAUSE", 2, 10, 2022));
      words.add(new Word("HUMOR", 2, 9, 2022));
      words.add(new Word("FRAME", 2, 8, 2022));
      words.add(new Word("ELDER", 2, 7, 2022));
      words.add(new Word("SKILL", 2, 6, 2022));
      words.add(new Word("ALOFT", 2, 5, 2022));
      words.add(new Word("PLEAT", 2, 4, 2022));
      words.add(new Word("SHARD", 2, 3, 2022));
      words.add(new Word("MOIST", 2, 2, 2022));
      words.add(new Word("THOSE", 2, 1, 2022));
   
      //January
      words.add(new Word("LIGHT", 1, 31, 2022));
      words.add(new Word("WRUNG", 1, 30, 2022));
      words.add(new Word("COULD", 1, 29, 2022));
      words.add(new Word("PERKY", 1, 28, 2022));
      words.add(new Word("MOUNT", 1, 27, 2022));
      words.add(new Word("WHACK", 1, 26, 2022));
      words.add(new Word("SUGAR", 1, 25, 2022));
      words.add(new Word("KNOLL", 1, 24, 2022));
      words.add(new Word("CRIMP", 1, 23, 2022));
      words.add(new Word("WINCE", 1, 22, 2022));
      words.add(new Word("PRICK", 1, 21, 2022));
      words.add(new Word("ROBOT", 1, 20, 2022));
      words.add(new Word("POINT", 1, 19, 2022));
      words.add(new Word("PROXY", 1, 18, 2022));
      words.add(new Word("SHIRE", 1, 17, 2022));
      words.add(new Word("SOLAR", 1, 16, 2022));
      words.add(new Word("PANIC", 1, 15, 2022));
      words.add(new Word("TANGY", 1, 14, 2022));
      words.add(new Word("ABBEY", 1, 13, 2022));
      words.add(new Word("FAVOR", 1, 12, 2022));
      words.add(new Word("DRINK", 1, 11, 2022));
      words.add(new Word("QUERY", 1, 10, 2022));
      words.add(new Word("GORGE", 1, 9, 2022));
      words.add(new Word("CRANK", 1, 8, 2022));
      words.add(new Word("SLUMP", 1, 7, 2022));
      words.add(new Word("BANAL", 1, 6, 2022));
      words.add(new Word("TIGER", 1, 5, 2022));
      words.add(new Word("SIEGE", 1, 4, 2022));
      words.add(new Word("TRUSS", 1, 3, 2022));
      words.add(new Word("BOOST", 1, 2, 2022));
      words.add(new Word("REBUS", 1, 1, 2022));
      
      wordIndex = (int)(Math.random() * ((words.size() - 1) + 1)) + 0;
      word = words.get(wordIndex).getWord();
      letters = words.get(wordIndex).getWord();
      day = words.get(wordIndex).getDay();
      month = words.get(wordIndex).getMonth();
      year = words.get(wordIndex).getYear();
   }

   public void newWord() {
      wordIndex = (int)(Math.random() * ((words.size() - 1) + 1)) + 0;
      word = words.get(wordIndex).getWord();
      day = words.get(wordIndex).getDay();
      month = words.get(wordIndex).getMonth();
      year = words.get(wordIndex).getYear();
   }

   public void removeWord(int n) {
      words.remove(n);
   }

   public void removeCurrentWord() {
      words.remove(wordIndex);
   }

   public String getWord() {
      return word;
   }

   public int getWordIndex() {
      return wordIndex;
   }
   
   public int getNumberOfWordsLeft() {
      return words.size();
   }
   public int getDay() {
      return day;
   }
   
   public String getMonth() {
      if(month == 1) {
         return "JANUARY";
      } else if(month == 2) {
         return "FEBUARY";
      } else if(month == 3) {
         return "MARCH";
      } else if(month == 4) {
         return "APRIL";
      } else if(month == 5) {
         return "MAY";
      } else if(month == 6) {
         return "JUNE";
      } else if(month == 7) {
         return "JULY";
      } else if(month == 8) {
         return "AUGUST";
      } else if(month == 9) {
         return "SEPTEMBER";
      } else if(month == 10) {
         return "OCTOBER";
      } else if(month == 11) {
         return "NOVEMBER";
      }
      return "DECEMBER";
   }
   
   public int getYear() {
      return year;
   }
   
   public String printDate() {
      return getMonth() + " " + getDay() + ", " + getYear();
   }
   
   public void printIntro() {
      System.out.println("WORDLE");
      System.out.println("TYPE A 5 LETTER WORD IN ALL CAPS, OR DONE TO END GAME");
   }
   
   public String getLetters() {
      return letters;
   }
   
   public void setLetters(String l) {
      letters = l;
   }
}
