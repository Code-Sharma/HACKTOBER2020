import java.util.*;

class Shop{
    public static void main(String[] args) {
        String[] softToys ={"Giant-Teddy-Bear","Giraffe","Cat","Mega-Bear","T-rex","Big-Soft-Eagle","Dog","Lion","Billy-Bear","Besty-Bear","Monkey","Bobby-Bear","Bunny-Rabbit","Benjamin-Bear","Kung-Fu-Panda","Brown-Bear","Pink-Bear","Baby-Elephant","Blue-Fish","Hippo","Cute-Pig","Pikachu","Doremon","Tortoise","Cater-Pillar","Candy-Doll"};
        Scanner sc = new Scanner(System.in);

        String item = sc.nextLine();

        List<String> softList = new ArrayList<>();
        Collections.addAll(softList,softToys);

        if(softList.contains(item)){

           // System.out.println(item);
            softList.remove(item);

            for(int i=0;i<softList.size();i++){
                System.out.print(i+1+"."+softList.get(i)+" ");
            }
           
           
        }
        else{
            System.out.println("ITEM UNAVAILABLE");
        }
    }
}
