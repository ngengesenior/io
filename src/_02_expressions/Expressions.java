package _02_expressions;

public class Expressions {


    public String returnNot(String name)
    {
        String result = "";

        if(name == "Ngenge")

        {
            result = "Not approved";

        }

        else if (name == "Senior")
        {
            result = "Not approved too";
        }

        else {
            result = "If it is empty,then John Doe";
        }

        return result;
    }
}
