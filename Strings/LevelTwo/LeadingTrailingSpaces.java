package LevelTwo;

public class LeadingTrailingSpaces {
    public static void main(String[] args) {
        String text ="   kanika agrawal    ";
        int start =0, end =0;
          for(int i=0;i<text.length();i++){
              if(text.charAt(i)!=' '){
                  start =i;
                  break;
              }
          }
          for(int i=text.length()-1;i>=0;i--){
              if(text.charAt(i)!=' '){
                  end =i+1;
                  break;
              }
          }
          String newText = text.substring(start,end);
        System.out.println(newText);
    }
}
