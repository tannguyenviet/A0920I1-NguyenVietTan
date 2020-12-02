package B1_Introduction_java.Bai_tap;

import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        String st = "";
        int dv=0,chuc=0,tram=0;
        dv = num%10;
        num = num /10;
        chuc = num %10;
        num = num/10;
        tram = num%10;
        System.out.println(tram);
        switch (tram){
            case 1:
                st+="One hundred";
                break;
            case 2:
                st+="Two hundred";
                break;
            case 3:
                st+="Three hundred";
                break;
            case 4:
                st+="Four hundred";
                break;
            case 5:
                st+="Five hundred";
                break;
            case 6:
                st+="Six hundred";
                break;
            case 7:
                st+="Seven hundred";
                break;
            case 8:
                st+="Eight hundred";
                break;
            case 9:
                st+="Nine hundred";
                break;

            default:

        }
        if (tram !=0){
            st+=" and ";
        }
        switch (chuc){
            case 1:
                switch (dv){
                    case 0:
                        st+="ten";
                        break;
                    case 1:
                        st+="eleven";
                        break;
                    case 2:
                        st+="twelve";
                        break;
                    case 3:
                        st+="thirteen";
                        break;
                    case 4:
                        st+="fourteen";
                        break;
                    case 5:
                        st+="fifteen";
                        break;
                    case 6:
                        st+="sixteen";
                        break;
                    case 7:
                        st+="seventeen";
                        break;
                    case 8:
                        st+="eighteen";
                        break;
                    case 9:
                        st+="ten";
                        break;

                }
                break;
            case 2:
                st+="twenty ";
                break;
            case 3:
                st+="thirty ";
                break;
            case 4:
                st+="fourty ";
                break;
            case 5:
                st+="fifty ";
                break;
            case 6:
                st+="sixty ";
                break;
            case 7:
                st+="seventy ";
                break;
            case 8:
                st+="eighty ";
                break;
            case 9:
                st+="ninety ";
                break;
            default:


        }
        if(chuc!=1){
            switch (dv){
                case 0:
                    st+="";
                    break;
                case 1:
                    st+="one";
                    break;
                case 2:
                    st+="two";
                    break;
                case 3:
                    st+="three";
                    break;
                case 4:
                    st+="four";
                    break;
                case 5:
                    st+="five";
                    break;
                case 6:
                    st+="six";
                    break;
                case 7:
                    st+="seven";
                    break;
                case 8:
                    st+="eight";
                    break;
                case 9:
                    st+="nine";
                    break;
            }
        }
        System.out.println(st);
        // 114--> one Hundred and fourteen
        // 102--> one Hundred and two
        // 56 --> fifty six
        // 14 --> fourteen
        // 5 --> five
        // cat don vi
    }
}
