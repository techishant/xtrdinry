import java.util.ArrayList;
public class arrList{
    public static void main(){
        // resizable one-Dimensional
        ArrayList<String> food = new ArrayList<String>();
        
        food.add("Pizza");
        food.add("burger");
        food.add("puri");
        
        food.set(0, "kheer");
        food.remove(1);
        
        food.clear();
        
        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
        
        // TWO DIMENSIONAL ARRAYS
        
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pasta");
        bakeryList.add("Maggie");
        bakeryList.add("Pan Cakes");
        
        ArrayList<String> produceList = new ArrayList();
        produceList.add("Tomatoes");
        produceList.add("Peppers");
        produceList.add("Dhaniya");       
        
        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("Mirinda");
        drinksList.add("Limca");
        
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        
        
        System.out.println(groceryList);
        System.out.println(groceryList.get(1).get(2));
        System.out.println(groceryList.get(2).get(0));
    }
}