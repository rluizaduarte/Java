#include <stdio.h>

int fatorial(int n){
    return (n == 1) ? 1 : n * fatorial(n - 1);
}

int main(){
    int n;
    scanf("%d", &n);
    printf("%d", fatorial(n));
    return 0;
}
