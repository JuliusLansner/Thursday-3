
class Palindrome{


char char1;
String newString = "";


void palindrome1(String sent){

for(int i=0; i<sent.length(); i++){
char1= sent.charAt(i);
newString=char1+newString;
}


System.out.println(sent+" reversed "+newString);
}
} 
