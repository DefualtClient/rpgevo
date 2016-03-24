package rpgevo;
import java.util.Scanner;
public class Chapter1 {
    public static void main(String[] args) {
        boolean[] ch;
        boolean dead = false;
        boolean stick = false;
        boolean vultures = false;
        if(!dead){
            boolean[] die1 = {true,false};
            String[] results1 = {"A monster killed you.","You decide to go home. You see a stick and a rock lying on the ground."};
            ch=choice("You see a cave. Do you go in? 1 or yes, 2 for no.",results1,die1,0);
            dead=ch[0];
        }
        if(!dead){
            boolean[] die2 = {false,false};
            String[] results2 = {"You pick up the stick.","You pick up the rock."};
            ch = choice("Which do you pick up? 1 for stick, 2 for rock.",results2,die2,1);
            dead=ch[0];
            stick=ch[1];
        }
        if(!dead){
            boolean[] die3 = {false,true};
            String[] results3 = {"You decide to go back into the cave.","You decide not to go back. Slowly, the monster in the cave gains power, until two years later, it takes over the world and kills everyone..."};
            ch = choice("Do you go back into the cave? 1 for yes, 2 for no.",results3,die3,0);
            dead=ch[0];
        }
        if(!dead){
            boolean[] die4 = {false,true};
            String[] results4 = {"You decide to fight the monster.","You try to run away, but it is to fast for you. It slashes you with its claws and kills you."};
            ch = choice("You see a monster! What do you do? 1 for fight, 2 for run.",results4,die4,0);
            dead=ch[0];
            if(stick){
                System.out.print("You seriously just tried to attack the deadly monster with a stick? You try to attack it with the stick, but it slashes you to little tiny bits.");
                dead=true;
            }
            else{
                System.out.println("You make a dent in the monster's head by throwing your rock and knock it out. The monster will wake up, it only got hit by a rock.");
            }
        }
        if(!dead){
            boolean[] die5 = {false,true};
            String[] results5 = {"You decide to go deeper.","You decide not to go deeper. Slowly, the monster in the cave gains power, until two years later, it takes over the world and kills everyone..."};
            ch = choice("Do you go to retreive the rock and head deeper into the cave? 1 for yes, 2 for no.",results5,die5,0);
            dead=ch[0];
        }
        if(!dead){
            boolean[] die6 = {true,false};
            String[] results6 = {"You tiptoe so slowly that the monster wakes up while you are still walking and claws you to bits.","You speed towards the monster, grab your rock, and run into the cave."};
            ch = choice("How will you approach the monster? 1 for quietly, 2 for quickly.",results6,die6,0);
            dead=ch[0];
        }
        if(!dead){
            boolean[] die7 = {true,false};
            String[] results7 = {"You try to hurt it with the rock, but before you even raise your arm, it swings its axe at your head and chops your head off.","You retreat to a safe distance, and throw your rock at its head. It missed and hit its axe, which slices through its head. Gross! That one won't be getting up again.\nYou pick up its axe. You decide to go back up to the surface. You see the monster is stirring."};
            ch = choice("An ogre with a big battle-axe scares the pooh out of you and attacks you. What do you do? 1 for fight, 2 for run.",results7,die7,0);
            dead=ch[0];
        }
        if(!dead){
            boolean[] die8 = {false,true};
            String[] results8 = {"You chop off its head with your axe.","You're a stupid coward so imma kill u"};
            ch = choice("What do you do? 1 for fight, 2 for run.",results8,die8,0);
            dead=ch[0];
        }
        if(!dead){
            boolean[] die9 = {false,true};
            String[] results9 = {"You search for more things to brutally murder.\n***Tutorial Completed!*** Now for the real thing. More choices! More death! Eventually, maybe, just possibly some entertainment value!","Seriously? after all this? Imma kill u nao"};
            ch = choice("You have defeated the devil's minion. What do you do now? 1 for try and find another 2 for go home",results9,die9,0);
            dead=ch[0];
        }
        if(!dead){
            boolean[] die10 = {false,true,false,true};
            String[] results10 = {"The rock somehow flattens all 3 of them in one go. 3 birds with one stone!","You easily killed one with the axe, but the other two attack you viciously. You find out these guys are actually pretty dangerous. You don't retain this information for long.","The vultures ignore you back.","Vultures don't talk. They think this is a battle cry. You find out these guys are actually pretty dangerous. You don't retain this information for long."};
            ch = choice("While heading into the cave, you find some vultures eating away at the body of the ogre you killed earlier. What do you do? 1 for attack with rock, 2 for attack with axe, 3 for ignore and move on, 4 for talk with them.",results10,die10,3);
            dead=ch[0];
            vultures=ch[1];
        }
        if(!dead){
            boolean[] die11 = {true,false,true};
            String[] results11 = {"You walk off a cliff.","It's a dead end. Someone left their magical ball of light there. How rude. You decide to pick it up and go back.","You walk into the center path. It gets really dark, and then suddenly you get ambushed by something. It literally rips your face off."};
            ch = choice("After searching for a while, you find an intersection. You can go three ways. Left is very dark, and looks infinite. Right has a slight glow, its color you can't describe. The center path is unremarkable. Which way do you go? 1 for left, 2 for right, 3 for center.",results11,die11,0);
            dead=ch[0];
        }
        if(!dead){
            boolean[] die12 = {true,true,false,true,true};
            String[] results12 = {"You walk off a cliff and die.","You throw a rock at it. It misses.","You decide to fight with your axe.","Monkeys don't talk. It rips your face off.","No such luck."};
            ch = choice("Your magical ball of light reveals that the left path is actually the infinite pit, and the center path has some kind of creature in it. It looks kind of like a monkey.\nWhat do you do? 1 for walk off a cliff and die, 2 for fight with rock, 3 for fight with axe, 4 for try and reason with it, 5 for run through and hope it doesn't attack you.",results12,die12,0);
            dead=ch[0];
        }
        if(!dead){
            boolean[] die13 = {false,true};
            String[] results13 = {"The monkey had aimed for your face, but hit the axe instead.","The monkey rips your face off."};
            ch = choice("The monkey thing lunges at you. You ready your axe. Which direction will you swing? 1 for up/down, 2 for left/right.",results13,die13,0);
            dead=ch[0];
        }
        if(!dead){
            System.out.println("YOU WIN!!!!!");
        }
        /*
        --- TEMPLATE ---
        
        if(!dead){
            boolean[] die1 = {};
            String[] results1 = {};
            ch = choice("",results1,die1,0);
            dead=ch[0];
        }
        
        */
    }
    //Text displayed at start, text displayed after you pick each choice, whether you die for each choice, which choice leads to a certain variable being true
    public static boolean[] choice(String text, String[] results, boolean[] die, int o){
        Scanner inp = new Scanner(System.in);
        boolean[] opt = {false,false};
        boolean question = false;
        System.out.println(text);
        o-=1;
        while(!question){
            question=true;
            try{
                int choice = inp.nextInt()-1;
                System.out.println(results[choice]);
                if(die[choice]){
                    opt[0]=true;
                }
                if(o==choice){
                    opt[1]=true;
                }
            }catch(Exception e){
                question=false;
                System.out.println("Oops! I don't think that's an option.");
            }
        }
        return opt;
    }
}