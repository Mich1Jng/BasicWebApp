package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.contains("name")) {
           return "MyTeam";
        }
        else if (query.contains("plus")) {
            String[] message = query.split(" ");
            int number1 = 0;
            int number2 = 0;

            for (int i = 0; i < message.length; i++) {
                if (message[i].matches(".*[0-9].*") && number1 == 0) {
                    number1 = Integer.parseInt(message[i].trim());
                } else if (message[i].matches(".*[0-9].*") && number1 != 0) {
                    number2 = Integer.parseInt(message[i].trim());
                } else if ((number1 != 0) && (number2 != 0)) {
                    break;
                }
            }
            return String.valueOf(number1 + number2);
        }
        else if (query.contains("multiplied")) {
            String[] message = query.split(" ");
            int number1 = 0;
            int number2 = 0;

            for (int i = 0; i < message.length; i++) {
                if (message[i].matches(".*[0-9].*") && number1 == 0) {
                    number1 = Integer.parseInt(message[i].trim());
                } else if (message[i].matches(".*[0-9].*") && number1 != 0) {
                    number2 = Integer.parseInt(message[i].trim());
                } else if ((number1 != 0) && (number2 != 0)) {
                    break;
                }
            }
            return String.valueOf(number1 * number2);
        }
        else if (query.contains("largest")) {
            String[] message = query.split(" ");
            int number = 0;

            for (int i = 0; i < message.length; i++) {
                if (message[i].matches(".*[0-9].*") && number > Integer.parseInt(message[i])) {
                    number = Integer.parseInt(message[i].trim());
                }
            }
            return String.valueOf(number);
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
