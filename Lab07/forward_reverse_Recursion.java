public class forward_reverse_Recursion {

    public void CharDesc(char Arr[], int index){

        if(Arr.length==index){
            return;
        }else{

            CharDesc(Arr,index+1);
            System.out.print(Arr[index] + " ");
    
        }

    }

    public void CharAsc(char Arr[], int index){

        if(Arr.length==index){
            return;
        }else{

            System.out.print(Arr[index] + " ");
            CharAsc(Arr,index+1);
        }
    }
    public static void main(String[] args) {
        forward_reverse_Recursion t2 = new forward_reverse_Recursion();
        
        char Arr[]={'S','U','H','A','I','L'};

        System.out.println("Ascending:");
        t2.CharAsc(Arr,0);
        System.out.println();

        System.out.println("Descending:");
        t2.CharDesc(Arr, 0);
        System.out.println();
    }
}

