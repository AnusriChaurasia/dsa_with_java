package DSAWithJava.Patterns;
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class ModifySequence {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);

        int r = s.nextInt();

        int c = s.nextInt();

        char[][] array = new char[r][c];



        for(int i=0; i<r;i++){

            for(int j=0;j<c;j++){

                array[i][j] = s.next().charAt(0);
            }

        }



        int count=0;



        for(int a=0; a<r; a++){

            for(int b=0; b<c; b++){

                if(b+3<=c-1){



                    if(array[a][b]=='s'

                            && array[a][b+1]=='a'

                            && array[a][b+2]=='b'

                            && array[a][b+3]=='a'){

                        count++;

                    }



                }



                if(a+3<=r-1){



                    if(array[a][b]=='s'

                            && array[a+1][b]=='a'

                            && array[a+2][b]=='b'

                            && array[a+3][b]=='a'){

                        count++;

                    }



                }



                if(a+3<=r-1 && b+3<=c-1){



                    if(array[a][b]=='s'

                            && array[a+1][b+1]=='a'

                            && array[a+2][b+2]=='b'

                            && array[a+3][b+3]=='a'){

                        count++;

                    }



                }



                if(a-3>=0 && b+3<=c-1){



                    if(array[a][b]=='s'

                            && array[a-1][b+1]=='a'

                            && array[a-2][b+2]=='b'

                            && array[a-3][b+3]=='a'){

                        count++;

                    }



                }

            }

        }



        System.out.print(count);





    }
}


