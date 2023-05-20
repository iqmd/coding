#include<stdio.h>

#define MAXLINE 1000

int max;
char line[MAXLINE];
char longest[MAXLINE];
int getlines();
void copy();

int main(){
  int len;
  while((len=getlines()) > 0){
    for(int i=len-1; i>=0; i--) printf("%c",line[i]);
  }

/*   if (max > 0)
     {
      printf("%s", longest);
    }
*/
  return 0;
}

int getlines(){
  char c;
  int i = 0;
  while((c=getchar()) != EOF && c != '\n' && i < MAXLINE - 1 ){
    line[i] = c;
    i++;

  }

  if(c == '\n'){
    line[i] = c;
    ++i;
   }

  line[i] = '\0';
  return i;


}

void copy(){
  int i=0;
  while( (longest[i] = line[i]) != '\0' ){
    i++;
  }
}
