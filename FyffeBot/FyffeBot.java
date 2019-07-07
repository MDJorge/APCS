public class FyffeBot
{
    public String Greeting()
    {
        return "Hello, I am the mighty Fyffebot, speak child. To test me, ask for a question";
    }
    public String getResponse(String statement)
    {
        String response = "";
        if(statement.length() == 0)
            response = "I said SPEAK!!!";
        else
        if(findKeyword(statement, "no") >= 0)
            response = "Why not?";
        else
        if(findKeyword(statement, "mother") >= 0 || findKeyword(statement, "father") >= 0 || findKeyword(statement, "sister") >= 0 || findKeyword(statement, "brother") >= 0)
            response = "Tell me more about your family.";
        else
        if(findKeyword(statement, "Ask") >= 0 || findKeyword(statement, "Question") >= 0)
            response = getRandomQuestion();
        else
        if(findKeyword(statement, "Nyack") >= 0)
            response = "So am I!!!";
        else
        if(findKeyword(statement, "Valley Cottage") >= 0)
            response = "I know where that is!";
        else
        if(findKeyword(statement, "pepe") >= 0)
            response = "Dank meme!!!";
        else
        if(findKeyword(statement, "Nice meme!") >= 0)
            response = "NICE MEME!!!!!!";
        else
        if(findKeyword(statement, "Mr. Skeltal") >= 0)
            response = "Thank, Mr. Skeltal";
        else
        if(findKeyword(statement, "Doge") >= 0)
            response = "much meme";
        else
        if(findKeyword(statement, "football") >= 0)
               response = "That hurts!";
        else
        if(findKeyword(statement, "tennis") >= 0)
            response = "That is a fun sport!";
        else
        if(findKeyword(statement, "Hockey") >= 0)
            response = "Are you Canadian?";
        else
        if(findKeyword(statement, "Baseball") >= 0)
            response = "I don't like baseball";
        else
        if(findKeyword(statement, "Basketball") >= 0)
            response = "LEBRON JAMES";
        else
        if(findKeyword(statement, "Pizza") >= 0)
            response = "PIZZA DOG, PIZZA DOG, PUT HIM IN THE OVEN, WATCH HIM GROW";
        else
        if(findKeyword(statement, "burgers") >= 0)
            response = "I like burgers";
        else
        if(findKeyword(statement, "salad") >= 0)
            response = "I don't like vegetables";
        else
        if(findKeyword(statement, "fruit") >= 0)
            response = "ohhh, juicy!";
            else
        if(findKeyword(statement, "Soccer") >= 0)
            response = "I love soccer!";
        else
        if(findKeyword(statement, "All") >= 0 && findKeyword(statement, "Memes") >= 0)
            response = "Then reddit is the place for you!";
        else
        if(findKeyword(statement, "donuts") >= 0)
            response = "Look at thiis donut doge meme!";
        else
        if(findKeyword(statement, "golf") >= 0)
            response = "golf is a slow game";
        else
          response = "I haven't heard of that meme";
        
        
        return response;
    }

    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();
        for(int psn = phrase.indexOf(goal, startPos); psn >= 0; psn = phrase.indexOf(goal, psn + 1))
        {
            String before = " ";
            String after = " ";
            if(psn > 0)
                before = phrase.substring(psn - 1, psn);
            if(psn + goal.length() < phrase.length())
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
            if((before.compareTo("a") < 0 || before.compareTo("z") > 0) && (after.compareTo("a") < 0 || after.compareTo("z") > 0))
                return psn;
        }

        return -1;
    }

    private int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

    private String getRandomResponse()
    {
        int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * 4);
        String response = "";
        if(whichResponse == 0)
            response = "Interesting, tell me more.";
        else
        if(whichResponse == 1)
            response = "Hmmm.";
        else
        if(whichResponse == 2)
            response = "Do you really think so?";
        else
        if(whichResponse == 3)
            response = "You don't say.";
        return response;
    }

    private String getRandomQuestion()
    {
        int NUMBER_OF_QUESTIONS = 4;
        double r = Math.random();
        int whichQuestion = (int)(r * 4);
        String response = "";
        if(whichQuestion == 0)
        {
            response = "Where are you from?";
        }
        if(whichQuestion == 1)
        {
            response = "What is your favorite meme?";
        } else
        if(whichQuestion == 2)
        {
            response = "What is your favorite sport?";
        }else
        if(whichQuestion == 3)
        {
            response = "What is your favorite food?";
        }
        return response;
    }

}