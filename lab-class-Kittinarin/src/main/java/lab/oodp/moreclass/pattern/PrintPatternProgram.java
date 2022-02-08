package lab.oodp.moreclass.pattern;

public class PrintPatternProgram {

    public void start() {
        
        printPatternOne();
        printPatternTwo();
        
    }
    public void printPatternOne() {
        System.out.println("First Pattern");
        //TODO uncomment the lines below
        Pattern top = new Pattern(15, '*');
//        
        Pattern sideOfFirstLine = new Pattern(7, '#');
        Pattern sideOfLine = new Pattern(7, '~');
        Pattern middle = new Pattern(1, '.');
//        
        System.out.println(top);
       System.out.println(sideOfFirstLine.toString() + middle.toString() + sideOfFirstLine.toString());
//        
       for (int i = 0; i < 6; i++) {
          middle.setNumberOfCharacters(middle.getNumberOfCharacters() + 1);
            System.out.println(sideOfLine.toString() + middle.toString() + sideOfLine.toString());
       }
    }
    
    public void printPatternTwo() {
        System.out.println("Second Pattern");
        
        Pattern top = new Pattern(36, '@');
//      
      Pattern sideOfFirstLine = new Pattern(12, '=');
      Pattern sideOfLine = new Pattern(12, '&');
      Pattern middle = new Pattern(12, '.');
//      
      System.out.println(top);
     System.out.println(sideOfFirstLine.toString() + middle.toString() + sideOfFirstLine.toString());
 
        for (int i = 0; i < 6; i++) {
        	sideOfLine.setNumberOfCharacters(sideOfLine.getNumberOfCharacters() + 1);
        	middle.setNumberOfCharacters(middle.getNumberOfCharacters() - 2);
            System.out.println(sideOfLine.toString() + middle.toString() + sideOfLine.toString());
        	
            
        }
//        	System.out.print(false);

    }

    public static void main(String[] args) {
        PrintPatternProgram ppp = new PrintPatternProgram();
        ppp.start();
    }
}
