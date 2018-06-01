package _05_functional;

import java.util.ArrayList;
import java.util.List;

public class JavaWay {

    public List<String> comEmails(List<String> emails)
    {
        List<String> mails = new ArrayList<>();
        for(String email: emails)
        {
            if (email.endsWith("com"))
            {
                mails.add(email);
            }

        }

        return mails;
    }
}
