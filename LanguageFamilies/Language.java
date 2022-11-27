class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String langName, int speakers, String regions, String 
wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers 
+ " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + 
this.wordOrder + ".");
    }

  public static void main(String[] args) {
     Language portuguese = new Language("Portuguese", 258000000, 
"Portugal, Brazil, Angola, Cape Verde, Mozambique, and Guinea-Bissau", 
"subject-verb-object"); 
     portuguese.getInfo();
     Mayan qʼeqchi = new Mayan("Qʼeqchi", 1300000);
     qʼeqchi.getInfo();
     SinoTibetan mandarin = new SinoTibetan("Mandarin", 920000000);
     SinoTibetan burmese = new SinoTibetan("Burmese",33000000);
     mandarin.getInfo();
     burmese.getInfo();
  }
}
