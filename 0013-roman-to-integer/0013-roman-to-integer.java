class Solution {

    
   public int romanToInt(String s) {
        int b = 0;
        char c = 't';
  for (int i = 0 ; i < s.length(); i++){
    char a = s.charAt(i);
    if(i < s.length()-1 )
   {
      c = s.charAt(i+1);
   }
    switch(a){
        case 'I':
        if(c == 'V'){
            b = b + 4;
            i++;
        }else if(c == 'X'){
            b = b + 9;
            i++;
        }
        else{
            b = b + 1;
        }
        
        break;
        case 'V':

        b = b + 5;
        break;
        case 'X':
         if(c == 'L'){
            b = b + 40;
            i++;
        }else if(c == 'C'){
            b = b + 90;
            i++;
        }
        else{
             b = b + 10;
        }
       
        break;
        case 'L':
        b = b + 50;
        break;
        case 'C':

        if(c == 'D'){
            b = b + 400;
            i++;
        }else if(c == 'M'){
            b = b + 900;
            i++;
        }
        
        else{
             b = b + 100;
        }
       
      
        break;
        case 'D':
        b = b + 500;
        break;
        case 'M':
        b = b + 1000;
        break;

    }


  }
  System.out.println(b);
  return b;
       
        
    }
}