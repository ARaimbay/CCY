public class MadLibs {
    /*
  This program generates a mad libbed story.
  Author: Laura
  Date: 2/19/2049
  */
    public static void main(String[] args){
        String name1 = "Aika";
        String name2 = "Zaika";
        String adjective1 = "beautiful";
        String adjective2 = "cool";
        String adjective3 = "bright";
        String verb1 = "play";
        String noun1 = "players";
        String noun2 = "balls";
        String noun3 = "player";
        String noun4 = "games";
        String noun5 = "ice";
        String noun6 = "cream";
        int number = 3;
        String place1 = "Canada";

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}
