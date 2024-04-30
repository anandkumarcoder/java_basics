class Computer {
    public void playMusic(){
        // behaviour of method will be defined here
        // type of access - public
        // when you dont want anything in return - void

        System.out.println("Music Playing...");
    }


    // second method 


    public String getMePen(int cost) {

        if (cost >= 10) {
            return "pen";    
        } 
        // else 
        return "nothing"; // if esle would work without else also 
        
    }
}


public class Methods {

    public static void main(String[] args) {
        
        Computer comp = new Computer();

        comp.playMusic();
        String str = comp.getMePen(3);
        System.out.println(str);
    }

    // main is a method which defines we have to start the execution from here
}
