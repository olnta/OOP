public class Orange extends Obst {

    private boolean kernlos;

    public Orange (String name, double vitaminC_Gehalt, double gewicht, boolean reif, boolean kernlos){
        super(name, vitaminC_Gehalt, gewicht, reif);
        this.kernlos = kernlos;
    }
    public boolean iskernlos(){
        return this.kernlos;
    }

    public String toString(){
        String text;
        text =super.toString();
        text = text + "\nKernlos: " + iskernlos();
        return text;
    }

}
