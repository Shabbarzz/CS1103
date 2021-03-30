public class SimpleRandomSentences {

   static final String[] conjunctions = { "and", "or", "but", "because"};
                                   
   static final String[] proper_noun = { "Fred", "Jane", "Richard", "Nixon", "Miss America"};

   static final String[] common_noun = { "man", "woman", "fish", "elephant", "unicorn"}; 
   
   static final String[] determiner = { "a", "the", "every", "some"}; 
   
   static final String[] adjective = { "big", "tiny", "pretty", "bald"}; 
   
   static final String[] transitive_verbs = { "runs", "jumps", "talks", "sleep"};
   
   static final String[] intransitive_verbs = { "loves", "hates", "sees", "knows", "looks for", "finds"}; 

   public static void main(String[] args) {
      while (true) {
         RandomSentence();
	     System.out.println(".\n\n");
         try {
             Thread.sleep(3000);
         }
         catch (InterruptedException e) {
         }
      }
   }
   
   static void RandomSentence() {
	RandomNounPhrase();
	RandomVerbPhrase();
	if(Math.random() > 0.75){
		System.out.println(" "+ RandomItem(conjunctions));
		RandomSentence();
	}
   }
   
   static void RandomNounPhrase() { 
	   if(Math.random() > 0.75)
	   System.out.println(" "+ RandomItem(proper_noun));
	   else {
	   System.out.println(" "+ RandomItem(determiner)); 
	   if(Math.random() > 0.5)
	   System.out.println(" "+ RandomItem(adjective)+".");
	   System.out.println(" "+ RandomItem(common_noun));
	   if(Math.random() > 0.5){
		   System.out.println("who");
	      RandomVerbPhrase();
	      }
	   }
   }
   
   static void RandomVerbPhrase(){
	   if(Math.random() > 0.75)
	   System.out.println(" "+ RandomItem(intransitive_verbs));
	   else if(Math.random() > 0.50) {
		   System.out.println(" "+ RandomItem(transitive_verbs)); 
		   RandomNounPhrase();
	   }
	   if(Math.random() > 0.25)
	   System.out.println(" is " + RandomItem(adjective));
	   else {
		   System.out.println(" believes that");
		   RandomSentence();
		   
	   }
   }
   
   static String RandomItem(String[] listOfStrings){

	    return listOfStrings[(int)(Math.random()*listOfStrings.length)];

	 }

}
