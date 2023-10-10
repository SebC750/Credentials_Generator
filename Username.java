import java.util.*;
public class Username {
      public String generateNewUsername(){
          char[] alphabetAndNumbers = {
          ('a'),
          ('b'),
          ('c'),
          ('d'),
          ('e'),
          ('f'),
          ('g'),
          ('h'),
          ('i'),
          ('j'),
          ('k'),
          ('l'),
          ('m'),
          ('n'),
          ('o'),
          ('p'),
          ('q'),
          ('r'),
          ('s'),
          ('t'),
          ('u'),
          ('v'),
          ('w'),
          ('x'),
          ('y'),
          ('z'),
          ('0'),
          ('1'),
          ('2'),
          ('3'),
          ('4'),
          ('5'),
          ('6'),
          ('7'),
          ('8'),
          ('9'),
        };
        Random randomCharacters = new Random();
        String newUsername = "";
        int userNameSize = randomCharacters.nextInt(35);
        if(userNameSize < 10){
          do{
            userNameSize = randomCharacters.nextInt(35);
          }while(userNameSize < 10);
        }
        for(int i = 0; i < userNameSize; i++){
          int indexSelection = randomCharacters.nextInt(35); 
            newUsername += alphabetAndNumbers[indexSelection];
        }
        System.out.println("Username: "+newUsername);
        return newUsername;
      }
}
