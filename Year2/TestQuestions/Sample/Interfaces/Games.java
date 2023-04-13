package Year2.TestQuestions.Sample.Interfaces;

class boardgame implements game {

    @Override
    public String game_type() {
        return "Board Games";
    }
}

class logicgames implements game{
    @Override
    public String game_type() {
        return "Logic Games";
    }
}
public class Games {
    public static void main(String[] args){
        boardgame ob = new boardgame();
        System.out.println("Game type: "+ob.game_type());
        logicgames ob1 = new logicgames();
        System.out.println("Game type: "+ob1.game_type());
    }
}
