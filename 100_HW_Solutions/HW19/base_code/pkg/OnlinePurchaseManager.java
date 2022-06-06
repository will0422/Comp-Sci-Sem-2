package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager{
   private ArrayList<Gizmo> purchases = new ArrayList<Gizmo>();
   public void add(String maker, boolean isElectronic, double price){
      purchases.add(new Gizmo(maker, isElectronic, price));
   }
   public int countElectronicsByMaker(String maker){

      int count = 0;

      for(int x = 0; x < purchases.size(); x++){
         if(purchases.get(x).getMaker().equals(maker) && purchases.get(x).isElectronic() == true)
            count++;
      }
      return count;
   }
   
   public Gizmo getCheapestGizmoByMaker(String maker){
   	double lowPrice = 1000000;
   	int index = -1;
      for(int x = 0; x < purchases.size(); x++){
         if(purchases.get(x).getMaker().equals(maker) && purchases.get(x).getPrice() < lowPrice){
            index = x;
            lowPrice = purchases.get(x).getPrice();
         }
      }
      return purchases.get(index);
   }
   
   public boolean hasAdjacentEqualPair(){
      if(purchases.size() < 2){return false;}
      for(int x = 0; x < purchases.size() - 1; x++){
         if(purchases.get(x).equals(purchases.get(x+1))){
            return true;
         }
      }
      return false;
   }
   
   public String toString(){
   	return "" + purchases;
   }
}
